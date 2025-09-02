package UltimateBravery.src.main.ClassSpecific.Collections

class Classes {

  val GUARDIAN = "Guardian"
  val DRAGONHUNTER = "Dragonhunter"
  val FIREBRAND = "Firebrand"
  val WILLBENDER = "Willbender"
  val WARRIOR = "Warrior"
  val BERSERKER = "Berserker"
  val SPELLBREAKER = "Spellbreaker"
  val BLADESWORN = "Bladesworn"
  val REVENANT = "Revenant"
  val HERALD = "Herald"
  val RENEGADE = "Renegade"
  val VINDICATOR = "Vindicator"
  val RANGER = "Ranger"
  val DRUID = "Druid"
  val SOULBEAST = "Soulbeast"
  val UNTAMED = "Untamed"
  val THIEF = "Thief"
  val DAREDEVIL = "Daredevil"
  val DEADEYE = "Deadeye"
  val SPECTER = "Specter"
  val ENGINEER = "Engineer"
  val SCRAPPER = "Scrapper"
  val HOLOSMITH = "Holosmith"
  val MECHANIST = "Mechanist"
  val MESMER = "Mesmer"
  val CHRONOMANCER = "Chronomancer"
  val MIRAGE = "Mirage"
  val VIRTUOSO = "Virtuoso"
  val NECROMANCER = "Necromancer"
  val REAPER = "Reaper"
  val SCOURGE = "Scourge"
  val HARBINGER = "Harbinger"
  val ELEMENTALIST = "Elementalist"
  val TEMPEST = "Tempest"
  val WEAVER = "Weaver"
  val CATALYST = "Catalyst"

  val guardianClasses: List[String] = List(
    GUARDIAN,
    DRAGONHUNTER,
    FIREBRAND,
    WILLBENDER
  )

  val warriorClasses: List[String] = List(
    WARRIOR,
    BERSERKER,
    SPELLBREAKER,
    BLADESWORN
  )

  val revenantClasses: List[String] = List(
    REVENANT,
    HERALD,
    RENEGADE,
    VINDICATOR
  )

  val engineerClasses:List[String] = List(
    ENGINEER,
    SCRAPPER,
    HOLOSMITH,
    MECHANIST
  )
  val thiefClasses:List[String] = List(
    THIEF,
    DAREDEVIL,
    DEADEYE,
    SPECTER
  )
  val rangerClasses:List[String] = List(
    RANGER,
    DRUID,
    SOULBEAST,
    UNTAMED
  )
  val mesmerClasses:List[String] = List(
    MESMER,
    CHRONOMANCER,
    MIRAGE,
    VIRTUOSO
  )
  val necromancerClasses:List[String] = List(
    NECROMANCER,
    REAPER,
    SCOURGE,
    HARBINGER
  )
  val elementalistClasses:List[String] = List(
    ELEMENTALIST,
    TEMPEST,
    WEAVER,
    CATALYST
  )

  val coreClasses:List[String] = List(
    WARRIOR, GUARDIAN, REVENANT,
    ENGINEER, THIEF, RANGER,
    MESMER, NECROMANCER, ELEMENTALIST
  )

  private val allClasses: List[String] = warriorClasses ::: guardianClasses ::: revenantClasses ::: engineerClasses :::
    rangerClasses ::: thiefClasses ::: mesmerClasses ::: necromancerClasses ::: elementalistClasses

  def ultimateBravery: String = {
    val roll = Math.round(Math.random() * (allClasses.size - 1)).toInt
    allClasses(roll)
  }

  def coreBravery: String = {
    val roll = Math.round(Math.random() * (coreClasses.size - 1)).toInt
    coreClasses(roll)
  }

  def getBaseClass(_class: String): String = {
    if (warriorClasses.contains(_class)) WARRIOR
    else if (guardianClasses.contains(_class)) GUARDIAN
    else if (revenantClasses.contains(_class)) REVENANT
    else if (rangerClasses.contains(_class)) RANGER
    else if (thiefClasses.contains(_class)) THIEF
    else if (engineerClasses.contains(_class)) ENGINEER
    else if (mesmerClasses.contains(_class)) MESMER
    else if (necromancerClasses.contains(_class)) NECROMANCER
    else if (elementalistClasses.contains(_class)) ELEMENTALIST
    else "Error"
  }

  def getAllClasses: List[String] = {
    this.allClasses
  }
}
