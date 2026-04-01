package UltimateBravery.src.main.Skills.Collections

import UltimateBravery.src.main.ClassSpecific.Collections.Classes

class EliteSkills {

  private val classes = new Classes

  private val warriorSkillsV2: List[(String, Int, String)] = List(
    ("We Will Never Yield!",76562, classes.PARAGON),
    ("Tactical Reload",62901, classes.BLADESWORN),
    ("Winds of Disenchantment",45333, classes.SPELLBREAKER),
    ("Head Butt",30343, classes.BERSERKER),
    ("Rampage",14483, classes.WARRIOR),
    ("Signet of Rage",14355, classes.WARRIOR),
    ("Battle Standard",14419, classes.WARRIOR)
  )

  private val warriorSkills: List[(String, String)] = List(
    ("Battle Standard", classes.WARRIOR),
    ("Rampage", classes.WARRIOR),
    ("Signet of Rage", classes.WARRIOR),
    ("Head Butt", classes.BERSERKER),
    ("Winds of Disenchantment", classes.SPELLBREAKER),
    ("Tactical Reload", classes.BLADESWORN),
  )

  private val guardianSkillsV2: List[(String, Int, String)] = List(
    ("Daring Advance",76687, classes.LUMINARY),
    ("Heaven's Palm",62561, classes.WILLBENDER),
    ("Mantra of Liberation",43357, classes.FIREBRAND),
    ("Dragon's Maw",30273, classes.DRAGONHUNTER),
    ("Signet of Courage",30461, classes.GUARDIAN),
    ("Renewed Focus",9154, classes.GUARDIAN),
    ("Feel My Wrath!",29965, classes.GUARDIAN)
  )

  private val guardianSkills: List[(String, String)] = List(
    ("Renewed Focus", classes.GUARDIAN),
    ("Feel My Wrath!", classes.GUARDIAN),
    ("Signet of Courage", classes.GUARDIAN),
    ("Dragon's Maw", classes.DRAGONHUNTER),
    ("Mantra of Liberation", classes.FIREBRAND),
    ("Heaven's Palm", classes.WILLBENDER)
  )

  private val revenantSkillsV2: List[(String, Int, String)] = List(
    ("Legendary Entity Stance",76968, classes.CONDUIT),
    ("Legendary Alliance Stance",62942, classes.VINDICATOR),
    ("Legendary Renegade Stance",45773, classes.RENEGADE),
    ("Legendary Dragon Stance",27760, classes.HERALD),
    ("Legendary Assassin Stance",28406, classes.REVENANT),
    ("Legendary Centaur Stance",27356, classes.REVENANT),
    ("Legendary Demon Stance",28287, classes.REVENANT),
    ("Legendary Dwarf Stance",27975, classes.REVENANT)
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

  private val engineerSkillsV2: List[(String, Int, String)] = List(
    ("Flux State",76993, classes.AMALGAM),
    ("Prime Light Beam",42009, classes.HOLOSMITH),
    ("Overclock Signet",63095, classes.MECHANIST),
    ("Sneak Gyro",30815, classes.SCRAPPER),
    ("Elite Mortar Kit",30800, classes.ENGINEER),
    ("Elixir X",5832, classes.ENGINEER),
    ("Supply Crate",5868, classes.ENGINEER)
  )

  private val engineerSkills: List[(String, String)] = List(
    ("Elixir X", classes.ENGINEER),
    ("Elite Mortar Kit", classes.ENGINEER),
    ("Supply Crate", classes.ENGINEER),
    ("Sneak Gyro", classes.SCRAPPER),
    ("Prime Light Beam", classes.HOLOSMITH),
    ("Overclock Signet", classes.MECHANIST),
  )

  private val thiefSkillsV2: List[(String, Int, String)] = List(
    ("Skritt Scuffle",77255, classes.ANTIQUARY),
    ("Shadowfall",63275, classes.SPECTER),
    ("Shadow Meld",45508, classes.DEADEYE),
    ("Impact Strike",29516, classes.DAREDEVIL),
    ("Dagger Storm",13085, classes.THIEF),
    ("Basilisk Venom",13132, classes.THIEF),
    ("Thieves Guild",13082, classes.THIEF)
  )

  private val thiefSkills: List[(String, String)] = List(
    ("Thieves Guild", classes.THIEF),
    ("Dagger Storm", classes.THIEF),
    ("Basilisk Venom", classes.THIEF),
    ("Impact Strike", classes.DAREDEVIL),
    ("Shadow Meld", classes.DEADEYE),
    ("Shadowfall", classes.SPECTER),
  )

  private val rangerSkillsV2: List[(String, Int, String)] = List(
    ("Perfect Storm",76979, classes.GALESHOT),
    ("Forest's Fortification",63163, classes.UNTAMED),
    ("One Wolf Pack",45717, classes.SOULBEAST),
    ("Glyph of the Stars",31677, classes.DRUID),
    ("Spirit of Nature",12569, classes.RANGER),
    ("Entangle",12580, classes.RANGER),
    ("Strength of the Pack!",12516, classes.RANGER)
  )

  private val rangerSkills: List[(String, String)] = List(
    ("Strength of the Pack!", classes.RANGER),
    ("Spirit of Nature", classes.RANGER),
    ("Entangle", classes.RANGER),
    ("Glyph of the Stars", classes.DRUID),
    ("One Wolf Pack", classes.SOULBEAST),
    ("Forest's Fortification", classes.UNTAMED),
  )

  private val mesmerSkillsV2: List[(String, Int, String)] = List(
    ("Tale of the August Queen",76971, classes.TROUBADOUR),
    ("Thousand Cuts",24755, classes.VIRTUOSO),
    ("Jaunt",45449, classes.MIRAGE),
    ("Gravity Well",30359, classes.CHRONOMANCER),
    ("Mass Invisibility",10245, classes.MESMER),
    ("Time Warp",10311, classes.MESMER),
    ("Signet of Humility",29519, classes.MESMER)
  )

  private val mesmerSkills: List[(String, String)] = List(
    ("Time Warp", classes.MESMER),
    ("Mass Invisibility", classes.MESMER),
    ("Signet of Humility", classes.MESMER),
    ("Gravity Well", classes.CHRONOMANCER),
    ("Jaunt", classes.MIRAGE),
    ("Thousand Cuts", classes.VIRTUOSO),
  )

  private val necromancerSkillsV2: List[(String, Int, String)] = List(
    ("Xinrae's Weapon",76941, classes.RITUALIST),
    ("Elixir of Ambition",62655, classes.HARBINGER),
    ("Ghastly Breach",42355, classes.SCOURGE),
    ("Chilled to the Bone!",30105, classes.REAPER),
    ("Lich Form",10550, classes.NECROMANCER),
    ("Summon Flesh Golem",10646, classes.NECROMANCER),
    ("Plaguelands",10549, classes.NECROMANCER)
  )

  private val necromancerSkills: List[(String, String)] = List(
    ("Plaguelands", classes.NECROMANCER),
    ("Summon Flesh Golem", classes.NECROMANCER),
    ("Lich Form", classes.NECROMANCER),
    ("Chilled to the Bone!", classes.REAPER),
    ("Ghastly Breach", classes.SCOURGE),
    ("Elixir of Ambition", classes.HARBINGER),
  )

  private val elementalistSkillsV2: List[(String, Int, String)] = List(
    ("Elemental Procession",76841, classes.EVOKER),
    ("Elemental Celerity",62725, classes.CATALYST),
    ("Weave Self",43638, classes.WEAVER),
    ("Rebound!",29968, classes.TEMPEST),
    ("Tornado",5534, classes.ELEMENTALIST),
    ("Conjure Fiery Greatsword",5516, classes.ELEMENTALIST),
    ("Glyph of Elementals",5666, classes.ELEMENTALIST)
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
