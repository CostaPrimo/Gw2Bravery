package UltimateBravery.src.main.Skills.Collections

import UltimateBravery.src.main.ClassSpecific.Collections.Classes

class UtilitySkills {

  private val classes = new Classes

  private val warriorSkills:List[(String, String)] = List(
    ("Banner of Defense", classes.WARRIOR),
    ("Banner of Discipline", classes.WARRIOR),
    ("Banner of Strength", classes.WARRIOR),
    ("Banner of Tactics", classes.WARRIOR),
    ("Bull's Charge", classes.WARRIOR),
    ("Kick", classes.WARRIOR),
    ("Stomp", classes.WARRIOR),
    ("Throw Bolas", classes.WARRIOR),
    ("Fear Me!", classes.WARRIOR),
    ("For Great Justice!", classes.WARRIOR),
    ("On My Mark!", classes.WARRIOR),
    ("Shake It Off!", classes.WARRIOR),
    ("Dolyak Signet", classes.WARRIOR),
    ("Signet of Fury", classes.WARRIOR),
    ("Signet of Might", classes.WARRIOR),
    ("Signet of Stamina", classes.WARRIOR),
    ("Balanced Stance", classes.WARRIOR),
    ("Berserker Stance", classes.WARRIOR),
    ("Endure Pain", classes.WARRIOR),
    ("Frenzy", classes.WARRIOR),
    ("Outrage", classes.BERSERKER),
    ("Shattering Blow", classes.BERSERKER),
    ("Sundering Leap", classes.BERSERKER),
    ("Wild Blow", classes.BERSERKER),
    ("Break Enchantments", classes.SPELLBREAKER),
    ("Featherfoot Grace", classes.SPELLBREAKER),
    ("Imminent Threat", classes.SPELLBREAKER),
    ("Sight beyond Sight", classes.SPELLBREAKER),
    ("Dragonspike Mine", classes.BLADESWORN),
    ("Electric Fence", classes.BLADESWORN),
    ("Flow Stabilizer", classes.BLADESWORN),
    ("Overcharged Cartridges", classes.BLADESWORN)
  )

  private val guardianSkills:List[(String, String)] = List(
    ("Hallowed Ground", classes.GUARDIAN),
    ("Purging Flames", classes.GUARDIAN),
    ("Sanctuary", classes.GUARDIAN),
    ("Wall of Reflection", classes.GUARDIAN),
    ("Contemplation of Purity", classes.GUARDIAN),
    ("Judge's Intervention", classes.GUARDIAN),
    ("Merciful Intervention", classes.GUARDIAN),
    ("Smite Condition", classes.GUARDIAN),
    ("Advance!", classes.GUARDIAN),
    ("Hold the Line!", classes.GUARDIAN),
    ("Save Yourselves!", classes.GUARDIAN),
    ("Stand Your Ground!", classes.GUARDIAN),
    ("Bane Signet", classes.GUARDIAN),
    ("Signet of Judgement", classes.GUARDIAN),
    ("Signet of Mercy", classes.GUARDIAN),
    ("Signet of Wrath", classes.GUARDIAN),
    ("Bow of Truth", classes.GUARDIAN),
    ("Hammer of Wisdom", classes.GUARDIAN),
    ("Shield of the Avenger", classes.GUARDIAN),
    ("Sword of Justice", classes.GUARDIAN),
    ("Fragments of Faith", classes.DRAGONHUNTER),
    ("Light's Judgement", classes.DRAGONHUNTER),
    ("Procession of Blades", classes.DRAGONHUNTER),
    ("Test of Faith", classes.DRAGONHUNTER),
    ("Mantra of Flame", classes.FIREBRAND),
    ("Mantra of Lore", classes.FIREBRAND),
    ("Mantra of Potence", classes.FIREBRAND),
    ("Mantra of Truth", classes.FIREBRAND),
    ("Flash Combo", classes.WILLBENDER),
    ("Heel Crack", classes.WILLBENDER),
    ("Roiling Light", classes.WILLBENDER),
    ("Whirling Light", classes.WILLBENDER)
  )

  private val revenantSkills:List[(String, String)] = List(
    ("Legendary Assassin Stance", classes.REVENANT),
    ("Legendary Centaur Stance", classes.REVENANT),
    ("Legendary Demon Stance", classes.REVENANT),
    ("Legendary Dwarf Stance", classes.REVENANT),
    ("Legendary Dragon Stance", classes.HERALD),
    ("Legendary Renegade Stance", classes.RENEGADE),
    ("Legendary Alliance Stance", classes.VINDICATOR)
  )

  private val engineerSkills:List[(String, String)] = List(
    ("Elixir B", classes.ENGINEER),
    ("Elixir C", classes.ENGINEER),
    ("Elixir R", classes.ENGINEER),
    ("Elixir S", classes.ENGINEER),
    ("Elixir U", classes.ENGINEER),
    ("Bomb Kit", classes.ENGINEER),
    ("Elixir Gun", classes.ENGINEER),
    ("Flamethrower", classes.ENGINEER),
    ("Grenade Kit", classes.ENGINEER),
    ("Tool Kit", classes.ENGINEER),
    ("Personal Battering Ram", classes.ENGINEER),
    ("Rocket Boots", classes.ENGINEER),
    ("Slick Shoes", classes.ENGINEER),
    ("Throw Mine", classes.ENGINEER),
    ("Utility Googles", classes.ENGINEER),
    ("Rifle turret", classes.ENGINEER),
    ("Flame Turret", classes.ENGINEER),
    ("Harpoon Turret", classes.ENGINEER),
    ("Net Turret", classes.ENGINEER),
    ("Rocket Turret", classes.ENGINEER),
    ("Thumber Turret", classes.ENGINEER),
    ("Blast Gyro", classes.SCRAPPER),
    ("Bulwark Gyro", classes.SCRAPPER),
    ("Purge Gyro", classes.SCRAPPER),
    ("Shredder Gyro", classes.SCRAPPER),
    ("Hard Light Arena", classes.HOLOSMITH),
    ("Laser Disk", classes.HOLOSMITH),
    ("Photon Wall", classes.HOLOSMITH),
    ("Spectrum Shield", classes.HOLOSMITH),
    ("Barrier Signet", classes.MECHANIST),
    ("Force Signet", classes.MECHANIST),
    ("Shift Signet", classes.MECHANIST),
    ("Superconducting Signet", classes.MECHANIST)
  )

  private val thiefSkills:List[(String, String)] = List(
    ("Blinding Powder", classes.THIEF),
    ("Shadow Refuge", classes.THIEF),
    ("Shadowstep", classes.THIEF),
    ("Smoke Screen", classes.THIEF),
    ("Prepare Pitfall", classes.THIEF),
    ("Prepare Seal Area", classes.THIEF),
    ("Prepare Shadow Portal", classes.THIEF),
    ("Prepare Thousand Needles", classes.THIEF),
    ("Assassin's Signet", classes.THIEF),
    ("Infiltrator's Signet", classes.THIEF),
    ("Signet of Agility", classes.THIEF),
    ("Signet of Shadows", classes.THIEF),
    ("Caltrops", classes.THIEF),
    ("Haste", classes.THIEF),
    ("Roll for Initiative", classes.THIEF),
    ("Scorpion Wire", classes.THIEF),
    ("Devourer Venom", classes.THIEF),
    ("Ice Drake Venom", classes.THIEF),
    ("Skale Venom", classes.THIEF),
    ("Spider Venom", classes.THIEF),
    ("Bandit's Defense", classes.DAREDEVIL),
    ("Distracting Daggers", classes.DAREDEVIL),
    ("Fist Flurry", classes.DAREDEVIL),
    ("Impairing Daggers", classes.DAREDEVIL),
    ("Binding Shadow", classes.DEADEYE),
    ("Mercy", classes.DEADEYE),
    ("Shadow Flare", classes.DEADEYE),
    ("Shadow Gust", classes.DEADEYE),
    ("Well of Bounty", classes.SPECTER),
    ("Well of Silence", classes.SPECTER),
    ("Well of Sorrow", classes.SPECTER),
    ("Well of Tears", classes.SPECTER)
  )

  private val rangerSkills:List[(String, String)] = List(
    ("Guard!", classes.RANGER),
    ("Protect Me!", classes.RANGER),
    ("Search and Rescue!", classes.RANGER),
    ("Sic 'Em!", classes.RANGER),
    ("Signet of Renewal", classes.RANGER),
    ("Signet of Stone", classes.RANGER),
    ("Signet of the Hunt", classes.RANGER),
    ("Signet of the Wild", classes.RANGER),
    ("Frost Spirit", classes.RANGER),
    ("Stone Spirit", classes.RANGER),
    ("Storm Spirit", classes.RANGER),
    ("Sun Spirit", classes.RANGER),
    ("Lightning Reflexes", classes.RANGER),
    ("Muddy Terrain", classes.RANGER),
    ("Quickening Zephyr", classes.RANGER),
    ("Sharpening Stone", classes.RANGER),
    ("Flame Trap", classes.RANGER),
    ("Frost Trap", classes.RANGER),
    ("Spike Trap", classes.RANGER),
    ("Viper's Next", classes.RANGER),
    ("Glyph of Alignment", classes.DRUID),
    ("Glyph of Equality", classes.DRUID),
    ("Glyph of Unity", classes.DRUID),
    ("Glyph of the Tides", classes.DRUID),
    ("Dolyak Stance", classes.SOULBEAST),
    ("Griffon Stance", classes.SOULBEAST),
    ("Moa Stance", classes.SOULBEAST),
    ("Vulture Stance", classes.SOULBEAST),
    ("Exploding Spores", classes.UNTAMED),
    ("Mutate Conditions", classes.UNTAMED),
    ("Nature's Binding", classes.UNTAMED),
    ("Unnatural Traversal", classes.UNTAMED)
  )

  private val mesmerSkills:List[(String, String)] = List(
    ("Decoy", classes.MESMER),
    ("Mirror Images", classes.MESMER),
    ("Feedback", classes.MESMER),
    ("Null Field", classes.MESMER),
    ("Portal Entre", classes.MESMER),
    ("Veil", classes.MESMER),
    ("Arcane Thievery", classes.MESMER),
    ("Blink", classes.MESMER),
    ("Illusion of Life", classes.MESMER),
    ("Mimic", classes.MESMER),
    ("Mantra of Concentration", classes.MESMER),
    ("Mantra of Distraction", classes.MESMER),
    ("Mantra of Pain", classes.MESMER),
    ("Mantra of Resolve", classes.MESMER),
    ("Phantasmal Defender", classes.MESMER),
    ("Phantasmal Disenchanter", classes.MESMER),
    ("Signet of Domination", classes.MESMER),
    ("Signet of Illusions", classes.MESMER),
    ("Signet of Inspiration", classes.MESMER),
    ("Signet of Midnight", classes.MESMER),
    ("Well of Action", classes.CHRONOMANCER),
    ("Well of Calamity", classes.CHRONOMANCER),
    ("Well of Precognition", classes.CHRONOMANCER),
    ("Well of Senility", classes.CHRONOMANCER),
    ("Crystal Sands", classes.MIRAGE),
    ("Illusionary Ambush", classes.MIRAGE),
    ("Mirage Advance", classes.MIRAGE),
    ("Sand through Glass", classes.MIRAGE),
    ("Blade Renewal", classes.VIRTUOSO),
    ("Psychic Force", classes.VIRTUOSO),
    ("Rain of Swords", classes.VIRTUOSO),
    ("Sword of Decimation", classes.VIRTUOSO)
  )

  private val necromancerSkills:List[(String, String)] = List(
    ("Blood is Power", classes.NECROMANCER),
    ("Corrosive Poison Cloud", classes.NECROMANCER),
    ("Corrupt Boon", classes.NECROMANCER),
    ("Epidemic", classes.NECROMANCER),
    ("Summon Bone Fiend", classes.NECROMANCER),
    ("Summon Bone Minions", classes.NECROMANCER),
    ("Summon Flesh Wurm", classes.NECROMANCER),
    ("Summon Shadow Fiend", classes.NECROMANCER),
    ("Plague Signet", classes.NECROMANCER),
    ("Signet of Spite", classes.NECROMANCER),
    ("Signet of Undeath", classes.NECROMANCER),
    ("Signet of the Locust", classes.NECROMANCER),
    ("Spectral Armor", classes.NECROMANCER),
    ("Spectral Grasp", classes.NECROMANCER),
    ("Spectral Ring", classes.NECROMANCER),
    ("Spectral Walk", classes.NECROMANCER),
    ("Well of Corruption", classes.NECROMANCER),
    ("Well of Darkness", classes.NECROMANCER),
    ("Well of Power", classes.NECROMANCER),
    ("Well of Suffering", classes.NECROMANCER),
    ("Nothing Can Save You!", classes.REAPER),
    ("Rise!", classes.REAPER),
    ("Suffer!", classes.REAPER),
    ("You Are All Weaklings!", classes.REAPER),
    ("Desiccate", classes.SCOURGE),
    ("Sand Swell", classes.SCOURGE),
    ("Serpent Siphon", classes.SCOURGE),
    ("Trail of Anguish", classes.SCOURGE),
    ("Elixir of Anguish", classes.HARBINGER),
    ("Elixir of Bliss", classes.HARBINGER),
    ("Elixir of Ignorance", classes.HARBINGER),
    ("Elixir of Risk", classes.HARBINGER),
  )

  private val elementalistSkills:List[(String, String)] = List(
    ("Arcane Blast", classes.ELEMENTALIST),
    ("Arcane Power", classes.ELEMENTALIST),
    ("Arcane Shield", classes.ELEMENTALIST),
    ("Arcane Wave", classes.ELEMENTALIST),
    ("Armor of Earth", classes.ELEMENTALIST),
    ("Cleansing Fire", classes.ELEMENTALIST),
    ("Lightning Flash", classes.ELEMENTALIST),
    ("Mist Form", classes.ELEMENTALIST),
    ("Conjure Earth Shield", classes.ELEMENTALIST),
    ("Conjure Flame Axe", classes.ELEMENTALIST),
    ("Conjure Frost Bow", classes.ELEMENTALIST),
    ("Conjure Lightning Hammer", classes.ELEMENTALIST),
    ("Glyph of Elemental Power", classes.ELEMENTALIST),
    ("Glyph of Lesser Elementals", classes.ELEMENTALIST),
    ("Glyph of Renewal", classes.ELEMENTALIST),
    ("Glyph of Storms", classes.ELEMENTALIST),
    ("Signet of Air", classes.ELEMENTALIST),
    ("Signet of Earth", classes.ELEMENTALIST),
    ("Signet of Fire", classes.ELEMENTALIST),
    ("Signet of Water", classes.ELEMENTALIST),
    ("Aftershock!", classes.TEMPEST),
    ("Eye of the Storm!", classes.TEMPEST),
    ("Feel the Burn!", classes.TEMPEST),
    ("Flash-Freeze!", classes.TEMPEST),
    ("Primordial Stance", classes.WEAVER),
    ("Stone Resonance", classes.WEAVER),
    ("Twist of Fate", classes.WEAVER),
    ("Unravel", classes.WEAVER),
    ("Fortified Earth", classes.CATALYST),
    ("Invigorating Air", classes.CATALYST),
    ("Relentless Fire", classes.CATALYST),
    ("Shattering Ice", classes.CATALYST),
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
