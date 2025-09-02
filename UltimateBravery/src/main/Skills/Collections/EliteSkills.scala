package UltimateBravery.src.main.Skills.Collections

import UltimateBravery.src.main.ClassSpecific.Collections.Classes

class EliteSkills {

  private val classes = new Classes

  private val warriorSkills: List[(String, String)] = List(
    ("Battle Standard", classes.WARRIOR),
    ("Rampage", classes.WARRIOR),
    ("Signet of Rage", classes.WARRIOR),
    ("Head Butt", classes.BERSERKER),
    ("Winds of Disenchantment", classes.SPELLBREAKER),
    ("Tactical Reload", classes.BLADESWORN),
  )
  private val guardianSkills: List[(String, String)] = List(
    ("Renewed Focus", classes.GUARDIAN),
    ("Feel My Wrath!", classes.GUARDIAN),
    ("Signet of Courage", classes.GUARDIAN),
    ("Dragon's Maw", classes.DRAGONHUNTER),
    ("Mantra of Liberation", classes.FIREBRAND),
    ("Heaven's Palm", classes.WILLBENDER)
  )

  private val revenantSkills: List[(String, String)] = List(
    ("Legendary Assassin Stance", classes.REVENANT),
    ("Legendary Centaur Stance", classes.REVENANT),
    ("Legendary Demon Stance", classes.REVENANT),
    ("Legendary Dwarf Stance", classes.REVENANT),
    ("Legendary Dragon Stance", classes.HERALD),
    ("Legendary Renegade Stance", classes.RENEGADE),
    ("Legendary Alliance Stance", classes.VINDICATOR)
  )

  private val engineerSkills: List[(String, String)] = List(
    ("Elixir X", classes.ENGINEER),
    ("Elite Mortar Kit", classes.ENGINEER),
    ("Supply Crate", classes.ENGINEER),
    ("Sneak Gyro", classes.SCRAPPER),
    ("Prime Light Beam", classes.HOLOSMITH),
    ("Overclock Signet", classes.MECHANIST),
  )
  private val thiefSkills: List[(String, String)] = List(
    ("Thieves Guild", classes.THIEF),
    ("Dagger Storm", classes.THIEF),
    ("Basilisk Venom", classes.THIEF),
    ("Impact Strike", classes.DAREDEVIL),
    ("Shadow Meld", classes.DEADEYE),
    ("Shadowfall", classes.SPECTER),
  )
  private val rangerSkills: List[(String, String)] = List(
    ("Strength of the Pack!", classes.RANGER),
    ("Spirit of Nature", classes.RANGER),
    ("Entangle", classes.RANGER),
    ("Glyph of the Stars", classes.DRUID),
    ("One Wolf Pack", classes.SOULBEAST),
    ("Forest's Fortification", classes.UNTAMED),
  )

  private val mesmerSkills: List[(String, String)] = List(
    ("Time Warp", classes.MESMER),
    ("Mass Invisibility", classes.MESMER),
    ("Signet of Humility", classes.MESMER),
    ("Gravity Well", classes.CHRONOMANCER),
    ("Jaunt", classes.MIRAGE),
    ("Thousand Cuts", classes.VIRTUOSO),
  )

  private val necromancerSkills: List[(String, String)] = List(
    ("Plaguelands", classes.NECROMANCER),
    ("Summon Flesh Golem", classes.NECROMANCER),
    ("Lich Form", classes.NECROMANCER),
    ("Chilled to the Bone!", classes.REAPER),
    ("Ghastly Breach", classes.SCOURGE),
    ("Elixir of Ambition", classes.HARBINGER),
  )

  private val elementalistSkills: List[(String, String)] = List(
    ("Tornado", classes.ELEMENTALIST),
    ("Conjure Fiery Greatsword", classes.ELEMENTALIST),
    ("Glyph of Elementals", classes.ELEMENTALIST),
    ("Rebound!", classes.TEMPEST),
    ("Weave Self", classes.WEAVER),
    ("Elemental Celerity", classes.CATALYST),
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
    if(skillList.isEmpty) "error"
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
    for(skillList <- skillLists) {
      if(skillList._2 == baseClass) return skillList._1
    }
    List()
  }

}
