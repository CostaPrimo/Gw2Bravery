package UltimateBravery.src.main

import UltimateBravery.src.main.Aggregates.{ArmourAggregate, BuildAggregate, SkillAggregate, TraitlineAggregate, TrinketAggregate, WeaponAggregate}
import UltimateBravery.src.main.ClassSpecific.Objects.{Gw2Trait, Legend, Pet, Traitline, WeaponBase}
import UltimateBravery.src.main.ClassSpecific.{Classes, Legends, Pets, Traitlines, Weapons}
import UltimateBravery.src.main.Gear.Upgrades.UpgradeObjects.{Infusion, Relic, Stat}
import UltimateBravery.src.main.Gear.Upgrades.{Infusions, Relics, Runes, Sigils, Stats}
import UltimateBravery.src.main.Gear.{Accessory, Armour, Backpack, Ring, Weapon}
import UltimateBravery.src.main.Skills.{AllSkills, Skill}
import UltimateBravery.src.main.util.utility.getValueIfKeyExists
import org.json.{JSONArray, JSONObject}

import java.net.URI
import java.net.http.{HttpClient, HttpRequest, HttpResponse}
import scala.util.matching.Regex

class ApiHelpers {

  private val STATS: Stats = new Stats
  private val WEAPONS: Weapons = new Weapons

  def convertCharacterObjectToAggregates(jsonObject: JSONObject): JSONObject = {
    val CLASSES = new Classes
    val baseClass = jsonObject.getString("profession")

    val specializations: JSONObject = getValueIfKeyExists(jsonObject, "specializations")
    val skills: JSONObject = getValueIfKeyExists(jsonObject, "skills")
    val equipment: JSONArray = jsonObject.getJSONArray("equipment")
    var equipmentList: List[JSONObject] = List()

    equipment.forEach(e => equipmentList = new JSONObject(e.toString) :: equipmentList)

    val traitlineAggregate = createTraitlineAggregateFromJson(specializations, baseClass)
    val skillAggregate = createSkillAggregateFromJson(skills, baseClass)
    val equipmentAggregates = createEquipmentAggregatesFromJson(baseClass, equipmentList)

    new JSONObject()
      .put("build", new BuildAggregate(
        equipmentAggregates._1,
        equipmentAggregates._2,
        equipmentAggregates._3,
        traitlineAggregate,
        skillAggregate,
        equipmentAggregates._4
      ).getJsonObject)
      .put("pets", if(CLASSES.RANGER.equalsIgnoreCase(baseClass)) new JSONArray(getPets(skills).toArray) else null)
      .put("legends", if(CLASSES.REVENANT.equalsIgnoreCase(baseClass)) new JSONArray(getLegends(skills).toArray) else null)
  }

  private def createEquipmentAggregatesFromJson(baseClass: String, jsonList: List[JSONObject]): (ArmourAggregate, TrinketAggregate, WeaponAggregate, Relic) = {
    val relics = new Relics

    var relic: Relic = null
    var weaponA1: Weapon = null
    var weaponA2: Weapon = null
    var weaponB1: Weapon = null
    var weaponB2: Weapon = null
    var helmet: Armour = null
    var shoulders: Armour = null
    var coat: Armour = null
    var gloves: Armour = null
    var leggings: Armour = null
    var boots: Armour = null
    var amulet: String = null
    var backpack: Backpack = null
    var ring1: Ring = null
    var ring2: Ring = null
    var accessory1: Accessory = null
    var accessory2: Accessory = null

    for(obj <- jsonList) {
      obj.getString("slot").toLowerCase match {
        case "relic" => relic = relics.getRelicById(obj.getInt("id"))
        case "weapona1" => weaponA1 = extractWeaponFromJson(baseClass, WEAPONS.MAIN, obj)
        case "weapona2" => weaponA2 = extractWeaponFromJson(baseClass, WEAPONS.OFF, obj)
        case "weaponb1" => weaponB1 = extractWeaponFromJson(baseClass, WEAPONS.MAIN, obj)
        case "weaponb2" => weaponB2 = extractWeaponFromJson(baseClass, WEAPONS.OFF, obj)
        case "amulet" => amulet = getStatFromApiJson(obj).getName
        case "backpack" => backpack = extractBackpackFromJson(obj)
        case "ring1" => ring1 = extractRingFromJson(obj)
        case "ring2" => ring2 = extractRingFromJson(obj)
        case "accessory1" => accessory1 = extractAccessoryFromJson(obj)
        case "accessory2" => accessory2 = extractAccessoryFromJson(obj)
        case "helm" => helmet = extractArmourFromJson(obj)
        case "shoulders" => shoulders = extractArmourFromJson(obj)
        case "coat" => coat = extractArmourFromJson(obj)
        case "gloves" => gloves = extractArmourFromJson(obj)
        case "leggings" => leggings = extractArmourFromJson(obj)
        case "boots" => boots = extractArmourFromJson(obj)
        case _ =>
      }
    }

    (
      new ArmourAggregate(helmet, shoulders, coat, gloves, leggings, boots),
      new TrinketAggregate(amulet, backpack, ring1, ring2, accessory1, accessory2),
      new WeaponAggregate(weaponA1, weaponA2, weaponB1, weaponB2),
      relic
    )

  }

  private def extractWeaponFromJson(baseClass: String, handing: String, jsonObject: JSONObject): Weapon = {
    val SIGILS: Sigils = new Sigils

    val infusions: List[Infusion] = getInfusionsFromApiJson(jsonObject)
    val weaponBase: WeaponBase = WEAPONS.getWeaponByBaseClassAndId(baseClass, handing, jsonObject.getInt("id"))
    val upgrades: List[Int] = getIntListFromJsonObjectElement(jsonObject, "upgrades")

    new Weapon(
      getStatFromApiJson(jsonObject),
      if (upgrades.isEmpty) null else SIGILS.getSigilById(upgrades.head),
      if (upgrades.size <= 1) null else SIGILS.getSigilById(upgrades(1)),
      if (infusions.isEmpty) null else infusions.head,
      if (infusions.size <= 1) null else infusions(1),
      weaponBase
    )
  }

  private def extractBackpackFromJson(jsonObject: JSONObject): Backpack = {
    val extract = extractTrinketStatsAndInfusions(jsonObject)
    val stats = extract._1
    val infusions = extract._2

    new Backpack(
      stats,
      if(infusions.isEmpty) null else infusions.head,
      if(infusions.size <= 1) null else infusions(1)
    )
  }

  private def extractRingFromJson(jsonObject: JSONObject): Ring = {
    val extract = extractTrinketStatsAndInfusions(jsonObject)
    val stats = extract._1
    val infusions = extract._2

    new Ring(
      stats,
      if(infusions.isEmpty) null else infusions.head,
      if(infusions.size <= 1) null else infusions(1),
      if(infusions.size <= 2) null else infusions(2)
    )
  }

  private def extractAccessoryFromJson(jsonObject: JSONObject): Accessory = {
    val extract = extractTrinketStatsAndInfusions(jsonObject)
    val stats = extract._1
    val infusions = extract._2

    new Accessory(
      stats,
      if(infusions.isEmpty) null else infusions.head
    )
  }

  private def extractTrinketStatsAndInfusions(jsonObject: JSONObject): (Stat, List[Infusion]) = {
    val stat = getStatFromApiJson(jsonObject)
    val infusionList: List[Infusion] = getInfusionsFromApiJson(jsonObject)

    (stat, infusionList)
  }

  private def extractArmourFromJson(jsonObject: JSONObject): Armour = {
    val runes = new Runes

    val upgrades = new JSONArray(jsonObject.get("upgrades").toString)
    val infusionList: List[Infusion] = getInfusionsFromApiJson(jsonObject)

    new Armour(
      getStatFromApiJson(jsonObject),
      if (upgrades.length() < 1) null else runes.getRunebyId(upgrades.getInt(0)),
      if (infusionList.isEmpty) null else infusionList.head
    )
  }

  private def createTraitlineAggregateFromJson(specializationJson: JSONObject, baseClass: String): TraitlineAggregate = {
    val jsonTraitsLines = specializationJson.getJSONArray("pve")
    var traitLineList: List[Traitline] = List()

    jsonTraitsLines.forEach(tl =>
      traitLineList = extractTraitLineFromJson(new JSONObject(tl.toString), baseClass) :: traitLineList)

    new TraitlineAggregate(
      if(traitLineList.isEmpty) null else traitLineList.head,
      if(traitLineList.size <= 1) null else traitLineList(1),
      if(traitLineList.size <= 2) null else traitLineList(2)
    )
  }

  private def extractTraitLineFromJson(jsonObject:JSONObject, baseClass: String): Traitline = {
    val TRAITLINES: Traitlines = new Traitlines

    val id = jsonObject.getInt("id")
    val traitline = TRAITLINES.getTraitLineByIdAndBaseClass(id, baseClass)
    val traitIds: List[Int] = getIntListFromJsonObjectElement(jsonObject, "traits")

    new Traitline(
      traitline.getName,
      traitline.getId,
      if(traitIds.nonEmpty) List(getTraitInTraitListThatMatchesIdInList(traitIds, traitline.getAdeptTraits)) else null,
      if(traitIds.nonEmpty) List(getTraitInTraitListThatMatchesIdInList(traitIds, traitline.getMasterTraits)) else null,
      if(traitIds.nonEmpty) List(getTraitInTraitListThatMatchesIdInList(traitIds, traitline.getGrandmasterTraits)) else null
    )
  }

  private def getTraitInTraitListThatMatchesIdInList(ids: List[Int], traits: List[Gw2Trait]): Gw2Trait = {
    for(id <- ids){
      for(t <- traits) {
        if (t.getId == id) return t
      }
    }
    new Gw2Trait("Error", -1)
  }

  private def createSkillAggregateFromJson(skillsJson: JSONObject, baseClass: String): SkillAggregate = {
    val ALLSKILLS: AllSkills = new AllSkills

    val skills = getValueIfKeyExists(skillsJson, "pve")

    val healSkill = ALLSKILLS.getHealSkillByIdAndBaseClass(skills.getInt("heal"), baseClass)
    val eliteSkill = ALLSKILLS.getEliteSkillByIdAndBaseClass(skills.getInt("elite"), baseClass)

    val buildUtilities: JSONArray = new JSONArray(skills.get("utilities").toString)
    var utilitySkills: List[Skill] = List()

    buildUtilities.forEach(skill =>
      utilitySkills = ALLSKILLS.getUtilitySkillByIdAndBaseClass(Integer.valueOf(skill.toString), baseClass) :: utilitySkills)

    new SkillAggregate(
      healSkill,
      if(utilitySkills.isEmpty) null else utilitySkills.head,
      if(utilitySkills.size <= 1) null else utilitySkills(1),
      if(utilitySkills.size <= 2) null else utilitySkills(2),
      eliteSkill)
  }

  private def getPets(jsonObject: JSONObject): List[Pet] = {
    val PETS = new Pets
    val terrestrial = jsonObject.getJSONObject("pve").getJSONObject("pets").getJSONArray("terrestrial")
    var petList: List[Pet] = List()

    terrestrial.forEach(p => petList = PETS.getPetById(Integer.valueOf(p.toString)) :: petList)

    petList
  }

  private def getLegends(jsonObject: JSONObject): List[Legend] = {
    val LEGENDS = new Legends
    val legendsJson = jsonObject.getJSONObject("pve").getJSONArray("legends")
    val legendPattern: Regex = "legend(.)".r

    var legendList: List[Legend] = List()
    legendsJson.forEach(l => legendPattern.findFirstMatchIn(l.toString.toLowerCase) match {
      case Some(patternMatch) => legendList = LEGENDS.getLegendById(Integer.valueOf(patternMatch.group(1))) :: legendList
      case None =>
    })
    legendList
  }

  private def getStatFromApiJson(jsonObject: JSONObject): Stat = {
    if(jsonObject.has("stats")) STATS.getStatById(jsonObject.getJSONObject("stats").getInt("id"))
    else {
      val path = String.format("https://api.guildwars2.com/v2/items/%s", jsonObject.getInt("id"))
      val request: HttpRequest = HttpRequest.newBuilder()
        .GET()
        .uri(URI.create(path))
        .build()
      val response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString())
      val infix_upgrade = new JSONObject(response.body())
        .getJSONObject("details")
        .getJSONObject("infix_upgrade")

      STATS.getStatById(infix_upgrade.getInt("id"))
    }
  }

  private def getInfusionsFromApiJson(jsonObject: JSONObject): List[Infusion] = {
    val INFUSIONS: Infusions = new Infusions
    val infusions: List[Int] = if(jsonObject.has("infusions")) getIntListFromJsonObjectElement(jsonObject, "infusions") else List()
    infusions.map(i => INFUSIONS.getInfusionById(i))
  }

  private def getIntListFromJsonObjectElement(jsonObject: JSONObject, element: String): List[Int] = {
    var intList: List[Int] = List()
    val integerElements = if(jsonObject.has(element)) jsonObject.getJSONArray(element) else new JSONArray()
    integerElements.forEach(i =>
      try { intList = Integer.valueOf(i.toString) :: intList }
      catch { case e: NumberFormatException => println("Caught non integer string")})
    intList
  }

}
