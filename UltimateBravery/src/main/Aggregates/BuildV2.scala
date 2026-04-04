package UltimateBravery.src.main.Aggregates

import UltimateBravery.src.main.ClassSpecific.Objects.Traitline
import UltimateBravery.src.main.ClassSpecific.{Classes, Traitlines, Weapons}
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

  private val armourAggregate = new ArmourAggregate(
    new Armour(STATS.ultimateBraveryV2, RUNES.ultimateBraveryV2, INFUSIONS.ultimateBravery),
    new Armour(STATS.ultimateBraveryV2, RUNES.ultimateBraveryV2, INFUSIONS.ultimateBravery),
    new Armour(STATS.ultimateBraveryV2, RUNES.ultimateBraveryV2, INFUSIONS.ultimateBravery),
    new Armour(STATS.ultimateBraveryV2, RUNES.ultimateBraveryV2, INFUSIONS.ultimateBravery),
    new Armour(STATS.ultimateBraveryV2, RUNES.ultimateBraveryV2, INFUSIONS.ultimateBravery),
    new Armour(STATS.ultimateBraveryV2, RUNES.ultimateBraveryV2, INFUSIONS.ultimateBravery)
  )

  private val trinketAggregate = new TrinketAggregate(
    STATS.ultimateBraveryV2.getName,
    new Backpack(STATS.ultimateBraveryV2, INFUSIONS.ultimateBravery, INFUSIONS.ultimateBravery),
    new Ring(STATS.ultimateBraveryV2, INFUSIONS.ultimateBravery, INFUSIONS.ultimateBravery, INFUSIONS.ultimateBravery),
    new Ring(STATS.ultimateBraveryV2, INFUSIONS.ultimateBravery, INFUSIONS.ultimateBravery, INFUSIONS.ultimateBravery),
    new Accessory(STATS.ultimateBraveryV2, INFUSIONS.ultimateBravery),
    new Accessory(STATS.ultimateBraveryV2, INFUSIONS.ultimateBravery)
  )

  private val weaponAggregate = createWeaponAggregate

  private val traitlineAggregate = createTraitLineAggregate

  private val skillAggregate = createSkillAggregate

  private val buildAggregate = new BuildAggregate(
    armourAggregate,
    trinketAggregate,
    weaponAggregate,
    traitlineAggregate,
    skillAggregate,
    RELICS.ultimateBraveryV2
  )

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
}
