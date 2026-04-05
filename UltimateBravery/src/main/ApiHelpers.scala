package UltimateBravery.src.main

import UltimateBravery.src.main.Aggregates.{ArmourAggregate, BuildAggregate, SkillAggregate, TraitlineAggregate, TrinketAggregate, WeaponAggregate}
import UltimateBravery.src.main.ClassSpecific.Objects.{Gw2Trait, Traitline}
import UltimateBravery.src.main.ClassSpecific.Traitlines
import UltimateBravery.src.main.Gear.Upgrades.UpgradeObjects.Relic
import UltimateBravery.src.main.Gear.Upgrades.{Relics, Runes, Stats}
import UltimateBravery.src.main.Gear.{Accessory, Armour, Backpack, Ring, Weapon}
import UltimateBravery.src.main.Skills.{AllSkills, Skill}
import UltimateBravery.src.main.util.utility.getValueIfKeyExists
import org.json.{JSONArray, JSONObject}

class ApiHelpers {

  private val ALLSKILLS: AllSkills = new AllSkills
  private val TRAITLINES: Traitlines = new Traitlines
  private val STATS: Stats = new Stats

  def convertCharacterObjectToAggregates(jsonObject: JSONObject): BuildAggregate = {
    val baseClass = jsonObject.getString("profession")

    val specializations: JSONObject = getValueIfKeyExists(jsonObject, "specializations")
    val skills: JSONObject = getValueIfKeyExists(jsonObject, "skills")
    val equipment: JSONArray = new JSONArray(jsonObject.get("equipment").toString)
    var equipmentList: List[JSONObject] = List()

    equipment.forEach(e => equipmentList = new JSONObject(e.toString) :: equipmentList)

    val traitlineAggregate = createTraitlineAggregateFromJson(specializations, baseClass)
    val skillAggregate = createSkillAggregateFromJson(skills, baseClass)
    val equipmentAggregates = createEquipmentAggregatesFromJson(equipmentList)

    new BuildAggregate(
      equipmentAggregates._1,
      equipmentAggregates._2,
      equipmentAggregates._3,
      traitlineAggregate,
      skillAggregate,
      equipmentAggregates._4)
  }

  private def createEquipmentAggregatesFromJson(jsonList: List[JSONObject]): (ArmourAggregate, TrinketAggregate, WeaponAggregate, Relic) = {
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
        case "weapona1" => weaponA1 = extractWeaponFromJson(obj)
        case "weapona2" => weaponA2 = extractWeaponFromJson(obj)
        case "weaponb1" => weaponB1 = extractWeaponFromJson(obj)
        case "weaponb2" => weaponB2 = extractWeaponFromJson(obj)
        case "amulet" => amulet = STATS.getStatById(new JSONObject(obj.get("stats").toString).getInt("id")).getName
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
      new WeaponAggregate(null, null, null, null),
      relic
    )

  }

  //TODO
  private def extractWeaponFromJson(jsonObject: JSONObject): Weapon = {
    new Weapon(null, null, null, null, null, null)
  }

  private def extractBackpackFromJson(jsonObject: JSONObject): Backpack = {
    val stats = getValueIfKeyExists(jsonObject, "stats")
    val infusions = new JSONArray(jsonObject.get("infusions").toString)

    new Backpack(
      STATS.getStatById(stats.getInt("id")),
      null,
      null
    )
  }

  private def extractRingFromJson(jsonObject: JSONObject): Ring = {
    val stats = getValueIfKeyExists(jsonObject, "stats")
    val infusions = new JSONArray(jsonObject.get("infusions").toString)

    new Ring(
      STATS.getStatById(stats.getInt("id")),
      null,
      null,
      null
    )
  }

  private def extractAccessoryFromJson(jsonObject: JSONObject): Accessory = {
    val stats = getValueIfKeyExists(jsonObject, "stats")
    val infusions = new JSONArray(jsonObject.get("infusions").toString)

    new Accessory(
      STATS.getStatById(stats.getInt("id")),
      null
    )
  }

  private def extractArmourFromJson(jsonObject: JSONObject): Armour = {
    val runes = new Runes

    val upgrades = new JSONArray(jsonObject.get("upgrades").toString)
    val infusions = new JSONArray(jsonObject.get("infusions").toString) //TODO
    val stats = getValueIfKeyExists(jsonObject, "stats")


    new Armour(
      STATS.getStatById(stats.getInt("id")),
      if (upgrades.length() > 1) null else runes.getRunebyId(upgrades.getInt(0)),
      null
    )
  }

  private def createTraitlineAggregateFromJson(specializationJson: JSONObject, baseClass: String): TraitlineAggregate = {
    val jsonTraitsLines = new JSONArray(specializationJson.get("pve").toString)
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
    val id = jsonObject.getInt("id")
    val traitline = TRAITLINES.getTraitLineByIdAndBaseClass(id, baseClass)

    val traits = new JSONArray(jsonObject.get("traits").toString)
    var traitIds: List[Int] = List()

    traits.forEach(t => traitIds = Integer.valueOf(t.toString) :: traitIds)

    new Traitline(
      traitline.getName,
      traitline.getId,
      List(getTraitInTraitListThatMatchesIdInList(traitIds, traitline.getAdeptTraits)),
      List(getTraitInTraitListThatMatchesIdInList(traitIds, traitline.getMasterTraits)),
      List(getTraitInTraitListThatMatchesIdInList(traitIds, traitline.getGrandmasterTraits))
    )
  }

  private def getTraitInTraitListThatMatchesIdInList(ids: List[Int], traits: List[Gw2Trait]): Gw2Trait = {
    for(id <- ids){
      for(t <- traits) {
        if (t.getId == id) return t
      }
    }
    null
  }

  private def createSkillAggregateFromJson(skillsJson: JSONObject, baseClass: String): SkillAggregate = {
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
}
