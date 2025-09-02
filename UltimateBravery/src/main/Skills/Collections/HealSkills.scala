package UltimateBravery.src.main.Skills.Collections

import UltimateBravery.src.main.ClassSpecific.Collections.Classes

class HealSkills {

  private val classes = new Classes

  val warriorSkills: List[(String, String)] = List(
    ("Mending", classes.WARRIOR),
    ("To the Limit!", classes.WARRIOR),
    ("Healing Signet", classes.WARRIOR),
    ("Defiant Stance", classes.WARRIOR),
    ("Blood Reckoning", classes.BERSERKER),
    ("Natural Healing", classes.SPELLBREAKER),
    ("Combat Stimulant", classes.BLADESWORN),
  )

  val guardianSkills: List[(String, String)] = List(
    ("Shelter", classes.GUARDIAN),
    ("Litany of Warth", classes.GUARDIAN),
    ("Receive the Light!", classes.GUARDIAN),
    ("Signet of Resolve", classes.GUARDIAN),
    ("Purification", classes.DRAGONHUNTER),
    ("Mantra of Solace", classes.FIREBRAND),
    ("Reversal of Fortune", classes.WILLBENDER)
  )

  val revenantSkills: List[(String, String)] = List(
    ("Legendary Assassin Stance", classes.REVENANT),
    ("Legendary Centaur Stance", classes.REVENANT),
    ("Legendary Demon Stance", classes.REVENANT),
    ("Legendary Dwarf Stance", classes.REVENANT),
    ("Legendary Dragon Stance", classes.HERALD),
    ("Legendary Renegade Stance", classes.RENEGADE),
    ("Legendary Alliance Stance", classes.VINDICATOR)
  )

  val engineerSkills: List[(String, String)] = List(
    ("Elixir H", classes.ENGINEER),
    ("Med Kit", classes.ENGINEER),
    ("A.E.D.", classes.ENGINEER),
    ("Healing Turret", classes.ENGINEER),
    ("Medic Gyro", classes.SCRAPPER),
    ("Coolant Blast", classes.HOLOSMITH),
    ("Rectifier Signet", classes.MECHANIST),
  )

  val thiefSkills: List[(String, String)] = List(
    ("Hide in Shadows", classes.THIEF),
    ("Signet of Malice", classes.THIEF),
    ("Withdraw", classes.THIEF),
    ("Skelk Venom", classes.THIEF),
    ("Channeled Vigor", classes.DAREDEVIL),
    ("Malicious Restoration", classes.DEADEYE),
    ("Well of Gloom", classes.SPECTER),
  )

  val rangerSkills: List[(String, String)] = List(
    ("We Heal As One!", classes.RANGER),
    ("Water Spirit", classes.RANGER),
    ("Troll Unguent", classes.RANGER),
    ("Healing Spring", classes.RANGER),
    ("Glyph of Rejuvenation", classes.DRUID),
    ("Bear Stance", classes.SOULBEAST),
    ("Perilous Gift", classes.UNTAMED),
  )

  val mesmerSkills: List[(String, String)] = List(
    ("Ether Feast", classes.MESMER),
    ("Mirror", classes.MESMER),
    ("Mantra of Recovery", classes.MESMER),
    ("Signet of Ether", classes.MESMER),
    ("Well of Eternity", classes.CHRONOMANCER),
    ("False Oasis", classes.MIRAGE),
    ("Twin Blade Restoration", classes.VIRTUOSO),
  )

  val necromancerSkills: List[(String, String)] = List(
    ("Consume Conditions", classes.NECROMANCER),
    ("Summon Blood Fiend", classes.NECROMANCER),
    ("Signet of Vampirism", classes.NECROMANCER),
    ("Well of Blood", classes.NECROMANCER),
    ("Your Soul Is Mine!", classes.REAPER),
    ("Sand Flare", classes.SCOURGE),
    ("Elixir of Promise", classes.HARBINGER),
  )
  val elementalistSkills: List[(String, String)] = List(
    ("Arcane Brilliance", classes.ELEMENTALIST),
    ("Ether Renewal", classes.ELEMENTALIST),
    ("Glyph of Elemental Harmony", classes.ELEMENTALIST),
    ("Signet of Restoration", classes.ELEMENTALIST),
    ("Wash the Pain Away!", classes.TEMPEST),
    ("Aquatic Stance", classes.WEAVER),
    ("Soothing Water", classes.CATALYST),
  )

  private val skillLists: List[(List[(String, String)], String)] = List(
    (warriorSkills, classes.WARRIOR),
    (guardianSkills, classes.GUARDIAN),
    (revenantSkills, classes.REVENANT),
    (engineerSkills, classes.ENGINEER),
    (rangerSkills, classes.RANGER),
    (thiefSkills, classes.THIEF),
    (mesmerSkills, classes.MESMER),
    (necromancerSkills, classes.NECROMANCER),
    (elementalistSkills, classes.ELEMENTALIST)
  )

  def ultimateBravery(classRoll: String): String = {
    val baseClass = classes.getBaseClass(classRoll)
    val skillList = filterSkills(getSkillList(baseClass), baseClass, classRoll)
    if (skillList.isEmpty) "error"
    else {
      val roll = Math.round(Math.random() * (skillList.length - 1)).toInt
      skillList(roll)._1
    }
  }

  private def filterSkills(skillList: List[(String, String)], baseClass: String, eliteSpec: String): List[(String, String)] = {
    var newList: List[(String, String)] = List()
    for (skill <- skillList) {
      if (skill._2 == baseClass || skill._2 == eliteSpec) newList = skill :: newList
    }
    newList
  }

  private def getSkillList(baseClass: String): List[(String, String)] = {
    for (skillList <- skillLists) {
      if (skillList._2 == baseClass) return skillList._1
    }
    List()
  }
}
