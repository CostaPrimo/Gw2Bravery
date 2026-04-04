package UltimateBravery.src.main.Aggregates

import UltimateBravery.src.main.ClassSpecific.Objects.{Legend, Pet, Traitline}
import UltimateBravery.src.main.ClassSpecific.{Classes, Legends, Pets, Traitlines, Weapons}
import UltimateBravery.src.main.Gear.{Accessory, Armour, Backpack, Ring, Weapon}
import UltimateBravery.src.main.Gear.Upgrades.{Infusions, Relics, Runes, Sigils, Stats}
import UltimateBravery.src.main.Skills.{EliteSkills, HealSkills, Skill, UtilitySkills}

class BuildV2(chosenClass: String) {
  private val CLASSES = new Classes
  private val BASECLASS = CLASSES.getBaseClass(chosenClass)

  private val RUNES = new Runes
  private val SIGILS = new Sigils
  private val STATS = new Stats
  private val INFUSIONS = new Infusions
  private val WEAPONS = new Weapons
  private val RELICS = new Relics
  private val TRAITLINES = new Traitlines
  private val HEALSKILLS = new HealSkills
  private val UTILITYSKILLS = new UtilitySkills
  private val ELITESKILLS = new EliteSkills

  private val PETS = new Pets
  private val LEGENDS = new Legends

  private val armourAggregate: ArmourAggregate = new ArmourAggregate(
    new Armour(STATS.ultimateBraveryV2, RUNES.ultimateBraveryV2, INFUSIONS.ultimateBravery),
    new Armour(STATS.ultimateBraveryV2, RUNES.ultimateBraveryV2, INFUSIONS.ultimateBravery),
    new Armour(STATS.ultimateBraveryV2, RUNES.ultimateBraveryV2, INFUSIONS.ultimateBravery),
    new Armour(STATS.ultimateBraveryV2, RUNES.ultimateBraveryV2, INFUSIONS.ultimateBravery),
    new Armour(STATS.ultimateBraveryV2, RUNES.ultimateBraveryV2, INFUSIONS.ultimateBravery),
    new Armour(STATS.ultimateBraveryV2, RUNES.ultimateBraveryV2, INFUSIONS.ultimateBravery)
  )

  private val trinketAggregate: TrinketAggregate = new TrinketAggregate(
    STATS.ultimateBraveryV2.getName,
    new Backpack(STATS.ultimateBraveryV2, INFUSIONS.ultimateBravery, INFUSIONS.ultimateBravery),
    new Ring(STATS.ultimateBraveryV2, INFUSIONS.ultimateBravery, INFUSIONS.ultimateBravery, INFUSIONS.ultimateBravery),
    new Ring(STATS.ultimateBraveryV2, INFUSIONS.ultimateBravery, INFUSIONS.ultimateBravery, INFUSIONS.ultimateBravery),
    new Accessory(STATS.ultimateBraveryV2, INFUSIONS.ultimateBravery),
    new Accessory(STATS.ultimateBraveryV2, INFUSIONS.ultimateBravery)
  )

  private val weaponAggregate: WeaponAggregate = createWeaponAggregate

  private val traitlineAggregate: TraitlineAggregate = createTraitLineAggregate

  private val skillAggregate: SkillAggregate = createSkillAggregate

  val buildAggregate: BuildAggregate = new BuildAggregate(
    armourAggregate,
    trinketAggregate,
    weaponAggregate,
    traitlineAggregate,
    skillAggregate,
    RELICS.ultimateBraveryV2
  )

  val pets: List[Pet] = createPets

  val legends: List[Legend] = createLegends

  private def createWeaponAggregate: WeaponAggregate = {
    val weaponSet1Type = WEAPONS.ultimateBraveryV2()
    val weaponSet2Type = WEAPONS.ultimateBraveryV2()

    var weaponA1: Weapon = null
    var weaponA2: Weapon = null
    var weaponB1: Weapon = null
    var weaponB2: Weapon = null

    weaponSet1Type match {
      case WEAPONS.MAIN =>
        weaponA1 = new Weapon(STATS.ultimateBraveryV2,
          SIGILS.ultimateBraveryV2, null,
          INFUSIONS.ultimateBravery, null,
          WEAPONS.getRandomClassWeaponWithHanding(BASECLASS, WEAPONS.MAIN)
        )
        weaponA2 = new Weapon(STATS.ultimateBraveryV2,
          SIGILS.ultimateBraveryV2, null,
          INFUSIONS.ultimateBravery, null,
          WEAPONS.getRandomClassWeaponWithHanding(BASECLASS, WEAPONS.OFF)
        )
      case WEAPONS.BOTH =>
        weaponA1 = new Weapon(STATS.ultimateBraveryV2,
          SIGILS.ultimateBraveryV2, SIGILS.ultimateBraveryV2,
          INFUSIONS.ultimateBravery, INFUSIONS.ultimateBravery,
          WEAPONS.getRandomClassWeaponWithHanding(BASECLASS, WEAPONS.BOTH)
        )
        weaponA2 = null
      case _ =>
    }
    weaponSet2Type match {
      case WEAPONS.MAIN =>
        weaponB1 = new Weapon(
          STATS.ultimateBraveryV2,
          SIGILS.ultimateBraveryV2, null,
          INFUSIONS.ultimateBravery, null,
          WEAPONS.getRandomClassWeaponWithHanding(BASECLASS, WEAPONS.MAIN)
        )
        weaponB2 = new Weapon(
          STATS.ultimateBraveryV2,
          SIGILS.ultimateBraveryV2, null,
          INFUSIONS.ultimateBravery, null,
          WEAPONS.getRandomClassWeaponWithHanding(BASECLASS, WEAPONS.OFF)
        )
      case WEAPONS.BOTH =>
        weaponB1 = new Weapon(
          STATS.ultimateBraveryV2,
          SIGILS.ultimateBraveryV2, SIGILS.ultimateBraveryV2,
          INFUSIONS.ultimateBravery, INFUSIONS.ultimateBravery,
          WEAPONS.getRandomClassWeaponWithHanding(BASECLASS, WEAPONS.BOTH)
        )
        weaponB2 = null
      case _ =>
    }

    new WeaponAggregate(
      weaponA1,
      weaponA2,
      weaponB1,
      weaponB2
    )
  }

  private def createTraitLineAggregate: TraitlineAggregate = {
    var generatedTraitlines: List[Traitline] = List(TRAITLINES.eliteUltimateBravery(chosenClass))
    while(generatedTraitlines.size < 3) {
      val currentTraitLines = generatedTraitlines.map(tl => tl.getName)
      val randomLine = TRAITLINES.ultimateBraveryV2(BASECLASS)
      if (!currentTraitLines.contains(randomLine.getName)) generatedTraitlines = randomLine :: generatedTraitlines
    }

    new TraitlineAggregate(
      generatedTraitlines(0),
      generatedTraitlines(1),
      generatedTraitlines(2)
    )
  }

  private def createSkillAggregate: SkillAggregate = {
    if(BASECLASS.equalsIgnoreCase(CLASSES.REVENANT)) return new SkillAggregate(null, null, null, null, null)

    var generatedSkills: List[Skill] = List(UTILITYSKILLS.ultimateBraveryV2(chosenClass))
    while (generatedSkills.size < 3) {
      val currentSkills = generatedSkills.map(s => s.getName)
      val randomSkill = UTILITYSKILLS.ultimateBraveryV2(chosenClass)
      if (!currentSkills.contains(randomSkill.getName)) generatedSkills = randomSkill :: generatedSkills
    }

    new SkillAggregate(
      HEALSKILLS.ultimateBraveryV2(chosenClass),
      generatedSkills(0),
      generatedSkills(1),
      generatedSkills(2),
      ELITESKILLS.ultimateBraveryV2(chosenClass)
    )
  }

  private def createPets: List[Pet] = {
    if(!BASECLASS.equalsIgnoreCase(CLASSES.RANGER)) return List()

    var petList: List[Pet] = List(PETS.ultimateBravery)
    while(petList.size < 2) {
      val randomPet = PETS.ultimateBravery
      if(!petList.head.equals(randomPet)) petList = randomPet :: petList
    }
    petList
  }

  private def createLegends: List[Legend] = {
    if(!BASECLASS.equalsIgnoreCase(CLASSES.REVENANT)) return List()

    var legendList: List[Legend] = List(LEGENDS.ultimateBravery)
    while (legendList.size < 2) {
      val randomLegend = LEGENDS.ultimateBravery
      if (!legendList.head.equals(randomLegend)) legendList = randomLegend :: legendList
    }
    legendList
  }
}
