package UltimateBravery.src.main.ClassSpecific

class Classes {

  val GUARDIAN = "Guardian"
  val DRAGONHUNTER = "Dragonhunter"
  val FIREBRAND = "Firebrand"
  val WILLBENDER = "Willbender"
  val LUMINARY = "Luminary"
  val WARRIOR = "Warrior"
  val BERSERKER = "Berserker"
  val SPELLBREAKER = "Spellbreaker"
  val BLADESWORN = "Bladesworn"
  val PARAGON = "Paragon"
  val REVENANT = "Revenant"
  val HERALD = "Herald"
  val RENEGADE = "Renegade"
  val VINDICATOR = "Vindicator"
  val CONDUIT = "Conduit"
  val RANGER = "Ranger"
  val DRUID = "Druid"
  val SOULBEAST = "Soulbeast"
  val UNTAMED = "Untamed"
  val GALESHOT = "Galeshot"
  val THIEF = "Thief"
  val DAREDEVIL = "Daredevil"
  val DEADEYE = "Deadeye"
  val SPECTER = "Specter"
  val ANTIQUARY = "Antiquary"
  val ENGINEER = "Engineer"
  val SCRAPPER = "Scrapper"
  val HOLOSMITH = "Holosmith"
  val MECHANIST = "Mechanist"
  val AMALGAM = "Amalgam"
  val MESMER = "Mesmer"
  val CHRONOMANCER = "Chronomancer"
  val MIRAGE = "Mirage"
  val VIRTUOSO = "Virtuoso"
  val TROUBADOUR = "Troubadour"
  val NECROMANCER = "Necromancer"
  val REAPER = "Reaper"
  val SCOURGE = "Scourge"
  val HARBINGER = "Harbinger"
  val RITUALIST = "Ritualist"
  val ELEMENTALIST = "Elementalist"
  val TEMPEST = "Tempest"
  val WEAVER = "Weaver"
  val CATALYST = "Catalyst"
  val EVOKER = "Evoker"

  val BLACK = "Evoker" //Added as an inside joke

  val guardianClasses: List[String] = List(
    GUARDIAN,
    DRAGONHUNTER,
    FIREBRAND,
    WILLBENDER,
    LUMINARY
  )

  val warriorClasses: List[String] = List(
    WARRIOR,
    BERSERKER,
    SPELLBREAKER,
    BLADESWORN,
    PARAGON
  )

  val revenantClasses: List[String] = List(
    REVENANT,
    HERALD,
    RENEGADE,
    VINDICATOR,
    CONDUIT
  )

  val engineerClasses:List[String] = List(
    ENGINEER,
    SCRAPPER,
    HOLOSMITH,
    MECHANIST,
    AMALGAM
  )
  val thiefClasses:List[String] = List(
    THIEF,
    DAREDEVIL,
    DEADEYE,
    SPECTER,
    ANTIQUARY
  )
  val rangerClasses:List[String] = List(
    RANGER,
    DRUID,
    SOULBEAST,
    UNTAMED,
    GALESHOT
  )
  val mesmerClasses:List[String] = List(
    MESMER,
    CHRONOMANCER,
    MIRAGE,
    VIRTUOSO,
    TROUBADOUR
  )
  val necromancerClasses:List[String] = List(
    NECROMANCER,
    REAPER,
    SCOURGE,
    HARBINGER,
    RITUALIST
  )
  val elementalistClasses:List[String] = List(
    ELEMENTALIST,
    TEMPEST,
    WEAVER,
    CATALYST,
    EVOKER
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
