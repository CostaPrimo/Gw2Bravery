package UltimateBravery.src.main.Skills.Collections

import UltimateBravery.src.main.ClassSpecific.Collections.Classes

class HealSkills {

  private val classes = new Classes

  /**
   * New skill format
   *
   * String1 = Skill name
   * Int = Skill ID
   * String2 = Class
   */

  val warriorSkillsV2: List[(String, Int, String)] = List(
    ("We Shall Return!",76755, classes.PARAGON),
    ("Combat Stimulant",62978, classes.BLADESWORN),
    ("Natural Healing",41100, classes.SPELLBREAKER),
    ("Blood Reckoning",30189, classes.BERSERKER),
    ("Defiant Stance",21815, classes.WARRIOR),
    ("Healing Signet",14389, classes.WARRIOR),
    ("Mending",14401, classes.WARRIOR),
    ("To the Limit!",14402, classes.WARRIOR)
  )

  val warriorSkills: List[(String, String)] = List(
    ("Mending", classes.WARRIOR),
    ("To the Limit!", classes.WARRIOR),
    ("Healing Signet", classes.WARRIOR),
    ("Defiant Stance", classes.WARRIOR),
    ("Blood Reckoning", classes.BERSERKER),
    ("Natural Healing", classes.SPELLBREAKER),
    ("Combat Stimulant", classes.BLADESWORN),
  )

  val guardianSkillsV2: List[(String, Int, String)] = List(
    ("Resolute Stance",76621, classes.LUMINARY),
    ("Reversal of Fortune",62622, classes.WILLBENDER),
    ("Mantra of Solace",41714, classes.FIREBRAND),
    ("Purification",30025, classes.DRAGONHUNTER),
    ("Litany of Wrath",21664, classes.GUARDIAN),
    ("Receive the Light!",9083, classes.GUARDIAN),
    ("Signet of Resolve",9158, classes.GUARDIAN),
    ("Shelter",9102, classes.GUARDIAN)
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

  val revenantLegendsV2: List[(String, Int, String)] = List(
    ("Legendary Entity Stance",77043, classes.CONDUIT),
    ("Legendary Alliance Stance",62719, classes.VINDICATOR),
    ("Legendary Renegade Stance",45686, classes.RENEGADE),
    ("Legendary Dragon Stance",27220, classes.HERALD),
    ("Legendary Assassin Stance",26937, classes.REVENANT),
    ("Legendary Centaur Stance",29148, classes.REVENANT),
    ("Legendary Centaur Stance",28427, classes.REVENANT),
    ("Legendary Demon Stance",28219, classes.REVENANT),
    ("Legendary Dwarf Stance",27372, classes.REVENANT)
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

  val engineerSkillsV2: List[(String, Int, String)] = List(
    ("Mitotic State",76738, classes.AMALGAM),
    ("Coolant Blast",40507, classes.HOLOSMITH),
    ("Rectifier Signet",63049, classes.MECHANIST),
    ("Medic Gyro",30357, classes.SCRAPPER),
    ("Healing Turret",5857, classes.ENGINEER),
    ("A.E.D.",21659, classes.ENGINEER),
    ("Med Kit",5802, classes.ENGINEER),
    ("Elixir H",5834, classes.ENGINEER)
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

  val thiefSkillsV2: List[(String, Int, String)] = List(
    ("Antivenom Draught",76886, classes.ANTIQUARY),
    ("Well of Gloom",63292, classes.SPECTER),
    ("Malicious Restoration",45088, classes.DEADEYE),
    ("Channeled Vigor",30400, classes.DAREDEVIL),
    ("Signet of Malice",13050, classes.THIEF),
    ("Skelk Venom",21778, classes.THIEF),
    ("Withdraw",13021, classes.THIEF),
    ("Hide in Shadows",13027, classes.THIEF)
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

  val rangerSkillsV2: List[(String, Int, String)] = List(
    ("Soothing Breeze",77271, classes.GALESHOT),
    ("Perilous Gift",63319, classes.UNTAMED),
    ("Bear Stance",44948, classes.SOULBEAST),
    ("Glyph of Rejuvenation",31407, classes.DRUID),
    ("Water Spirit",21773, classes.RANGER),
    ("Healing Spring",12489, classes.RANGER),
    ("Troll Unguent",12483, classes.RANGER),
    ("We Heal As One!",31914, classes.RANGER)
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

  val mesmerSkillsV2: List[(String, Int, String)] = List(
    ("Tale of the Second Scion",76695, classes.TROUBADOUR),
    ("Twin Blade Restoration",62522, classes.VIRTUOSO),
    ("False Oasis",40200,classes.MIRAGE),
    ("Well of Eternity",30305, classes.CHRONOMANCER),
    ("Signet of the Ether",21750, classes.MESMER),
    ("Mantra of Recovery",10213, classes.MESMER),
    ("Mirror",10177, classes.MESMER),
    ("Ether Feast",10176, classes.MESMER)
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

  val necromancerSkillsV2: List[(String, Int, String)] = List(
    ("Resilient Weapon",77259, classes.RITUALIST),
    ("Elixir of Promise",62667, classes.HARBINGER),
    ("Sand Flare",43148, classes.SCOURGE),
    ("Your Soul Is Mine!",30488, classes.REAPER),
    ("Signet of Vampirism",21762, classes.NECROMANCER),
    ("Well of Blood",10527, classes.NECROMANCER),
    ("Consume Conditions",10548, classes.NECROMANCER),
    ("Summon Blood Fiend",10547, classes.NECROMANCER)
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

  val elementalistSkillsV2: List[(String, Int, String)] = List(
    ("Rejuvenate",76634, classes.EVOKER),
    ("Soothing Water",62827, classes.CATALYST),
    ("Aquatic Stance",44239, classes.WEAVER),
    ("Wash the Pain Away!",29535, classes.TEMPEST),
    ("Arcane Brilliance",21656 , classes.ELEMENTALIST),
    ("Signet of Restoration",5503 , classes.ELEMENTALIST),
    ("Ether Renewal",5507 , classes.ELEMENTALIST),
    ("Glyph of Elemental Harmony",5569 , classes.ELEMENTALIST)
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
