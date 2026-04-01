package UltimateBravery.src.main.Skills.Collections

import UltimateBravery.src.main.ClassSpecific.Collections.Classes

class EliteSkills {

  private val classes = new Classes

  private val warriorSkillsV2: List[Skill] = List(
    new Skill("We Will Never Yield!",76562, classes.PARAGON),
    new Skill("Tactical Reload",62901, classes.BLADESWORN),
    new Skill("Winds of Disenchantment",45333, classes.SPELLBREAKER),
    new Skill("Head Butt",30343, classes.BERSERKER),
    new Skill("Rampage",14483, classes.WARRIOR),
    new Skill("Signet of Rage",14355, classes.WARRIOR),
    new Skill("Battle Standard",14419, classes.WARRIOR)
  )

  private val warriorSkills: List[(String, String)] = List(
    ("Battle Standard", classes.WARRIOR),
    ("Rampage", classes.WARRIOR),
    ("Signet of Rage", classes.WARRIOR),
    ("Head Butt", classes.BERSERKER),
    ("Winds of Disenchantment", classes.SPELLBREAKER),
    ("Tactical Reload", classes.BLADESWORN),
  )

  private val guardianSkillsV2: List[Skill] = List(
    new Skill("Daring Advance",76687, classes.LUMINARY),
    new Skill("Heaven's Palm",62561, classes.WILLBENDER),
    new Skill("Mantra of Liberation",43357, classes.FIREBRAND),
    new Skill("Dragon's Maw",30273, classes.DRAGONHUNTER),
    new Skill("Signet of Courage",30461, classes.GUARDIAN),
    new Skill("Renewed Focus",9154, classes.GUARDIAN),
    new Skill("Feel My Wrath!",29965, classes.GUARDIAN)
  )

  private val guardianSkills: List[(String, String)] = List(
    ("Renewed Focus", classes.GUARDIAN),
    ("Feel My Wrath!", classes.GUARDIAN),
    ("Signet of Courage", classes.GUARDIAN),
    ("Dragon's Maw", classes.DRAGONHUNTER),
    ("Mantra of Liberation", classes.FIREBRAND),
    ("Heaven's Palm", classes.WILLBENDER)
  )

  private val revenantSkillsV2: List[Skill] = List(
    new Skill("Legendary Entity Stance",76968, classes.CONDUIT),
    new Skill("Legendary Alliance Stance",62942, classes.VINDICATOR),
    new Skill("Legendary Renegade Stance",45773, classes.RENEGADE),
    new Skill("Legendary Dragon Stance",27760, classes.HERALD),
    new Skill("Legendary Assassin Stance",28406, classes.REVENANT),
    new Skill("Legendary Centaur Stance",27356, classes.REVENANT),
    new Skill("Legendary Demon Stance",28287, classes.REVENANT),
    new Skill("Legendary Dwarf Stance",27975, classes.REVENANT)
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

  private val engineerSkillsV2: List[Skill] = List(
    new Skill("Flux State",76993, classes.AMALGAM),
    new Skill("Prime Light Beam",42009, classes.HOLOSMITH),
    new Skill("Overclock Signet",63095, classes.MECHANIST),
    new Skill("Sneak Gyro",30815, classes.SCRAPPER),
    new Skill("Elite Mortar Kit",30800, classes.ENGINEER),
    new Skill("Elixir X",5832, classes.ENGINEER),
    new Skill("Supply Crate",5868, classes.ENGINEER)
  )

  private val engineerSkills: List[(String, String)] = List(
    ("Elixir X", classes.ENGINEER),
    ("Elite Mortar Kit", classes.ENGINEER),
    ("Supply Crate", classes.ENGINEER),
    ("Sneak Gyro", classes.SCRAPPER),
    ("Prime Light Beam", classes.HOLOSMITH),
    ("Overclock Signet", classes.MECHANIST),
  )

  private val thiefSkillsV2: List[Skill] = List(
    new Skill("Skritt Scuffle",77255, classes.ANTIQUARY),
    new Skill("Shadowfall",63275, classes.SPECTER),
    new Skill("Shadow Meld",45508, classes.DEADEYE),
    new Skill("Impact Strike",29516, classes.DAREDEVIL),
    new Skill("Dagger Storm",13085, classes.THIEF),
    new Skill("Basilisk Venom",13132, classes.THIEF),
    new Skill("Thieves Guild",13082, classes.THIEF)
  )

  private val thiefSkills: List[(String, String)] = List(
    ("Thieves Guild", classes.THIEF),
    ("Dagger Storm", classes.THIEF),
    ("Basilisk Venom", classes.THIEF),
    ("Impact Strike", classes.DAREDEVIL),
    ("Shadow Meld", classes.DEADEYE),
    ("Shadowfall", classes.SPECTER),
  )

  private val rangerSkillsV2: List[Skill] = List(
    new Skill("Perfect Storm",76979, classes.GALESHOT),
    new Skill("Forest's Fortification",63163, classes.UNTAMED),
    new Skill("One Wolf Pack",45717, classes.SOULBEAST),
    new Skill("Glyph of the Stars",31677, classes.DRUID),
    new Skill("Spirit of Nature",12569, classes.RANGER),
    new Skill("Entangle",12580, classes.RANGER),
    new Skill("Strength of the Pack!",12516, classes.RANGER)
  )

  private val rangerSkills: List[(String, String)] = List(
    ("Strength of the Pack!", classes.RANGER),
    ("Spirit of Nature", classes.RANGER),
    ("Entangle", classes.RANGER),
    ("Glyph of the Stars", classes.DRUID),
    ("One Wolf Pack", classes.SOULBEAST),
    ("Forest's Fortification", classes.UNTAMED),
  )

  private val mesmerSkillsV2: List[Skill] = List(
    new Skill("Tale of the August Queen",76971, classes.TROUBADOUR),
    new Skill("Thousand Cuts",24755, classes.VIRTUOSO),
    new Skill("Jaunt",45449, classes.MIRAGE),
    new Skill("Gravity Well",30359, classes.CHRONOMANCER),
    new Skill("Mass Invisibility",10245, classes.MESMER),
    new Skill("Time Warp",10311, classes.MESMER),
    new Skill("Signet of Humility",29519, classes.MESMER)
  )

  private val mesmerSkills: List[(String, String)] = List(
    ("Time Warp", classes.MESMER),
    ("Mass Invisibility", classes.MESMER),
    ("Signet of Humility", classes.MESMER),
    ("Gravity Well", classes.CHRONOMANCER),
    ("Jaunt", classes.MIRAGE),
    ("Thousand Cuts", classes.VIRTUOSO),
  )

  private val necromancerSkillsV2: List[Skill] = List(
    new Skill("Xinrae's Weapon",76941, classes.RITUALIST),
    new Skill("Elixir of Ambition",62655, classes.HARBINGER),
    new Skill("Ghastly Breach",42355, classes.SCOURGE),
    new Skill("Chilled to the Bone!",30105, classes.REAPER),
    new Skill("Lich Form",10550, classes.NECROMANCER),
    new Skill("Summon Flesh Golem",10646, classes.NECROMANCER),
    new Skill("Plaguelands",10549, classes.NECROMANCER)
  )

  private val necromancerSkills: List[(String, String)] = List(
    ("Plaguelands", classes.NECROMANCER),
    ("Summon Flesh Golem", classes.NECROMANCER),
    ("Lich Form", classes.NECROMANCER),
    ("Chilled to the Bone!", classes.REAPER),
    ("Ghastly Breach", classes.SCOURGE),
    ("Elixir of Ambition", classes.HARBINGER),
  )

  private val elementalistSkillsV2: List[Skill] = List(
    new Skill("Elemental Procession",76841, classes.EVOKER),
    new Skill("Elemental Celerity",62725, classes.CATALYST),
    new Skill("Weave Self",43638, classes.WEAVER),
    new Skill("Rebound!",29968, classes.TEMPEST),
    new Skill("Tornado",5534, classes.ELEMENTALIST),
    new Skill("Conjure Fiery Greatsword",5516, classes.ELEMENTALIST),
    new Skill("Glyph of Elementals",5666, classes.ELEMENTALIST)
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
