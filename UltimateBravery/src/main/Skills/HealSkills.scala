package UltimateBravery.src.main.Skills

import UltimateBravery.src.main.ClassSpecific.Classes

class HealSkills {

  private val classes = new Classes

  private val warriorHealSkillsV2: List[Skill] = List(
    new Skill("We Shall Return!",76755, classes.PARAGON),
    new Skill("Combat Stimulant",62978, classes.BLADESWORN),
    new Skill("Natural Healing",41100, classes.SPELLBREAKER),
    new Skill("Blood Reckoning",30189, classes.BERSERKER),
    new Skill("Defiant Stance",21815, classes.WARRIOR),
    new Skill("Healing Signet",14389, classes.WARRIOR),
    new Skill("Mending",14401, classes.WARRIOR),
    new Skill("To the Limit!",14402, classes.WARRIOR)
  )

  private val guardianHealSkillsV2: List[Skill] = List(
    new Skill("Resolute Stance",76621, classes.LUMINARY),
    new Skill("Reversal of Fortune",62622, classes.WILLBENDER),
    new Skill("Mantra of Solace",41714, classes.FIREBRAND),
    new Skill("Purification",30025, classes.DRAGONHUNTER),
    new Skill("Litany of Wrath",21664, classes.GUARDIAN),
    new Skill("Receive the Light!",9083, classes.GUARDIAN),
    new Skill("Signet of Resolve",9158, classes.GUARDIAN),
    new Skill("Shelter",9102, classes.GUARDIAN)
  )

  private val revenantHealLegendsV2: List[Skill] = List(
    new Skill("Legendary Entity Stance",77043, classes.CONDUIT),
    new Skill("Legendary Alliance Stance",62719, classes.VINDICATOR),
    new Skill("Legendary Renegade Stance",45686, classes.RENEGADE),
    new Skill("Legendary Dragon Stance",27220, classes.HERALD),
    new Skill("Legendary Assassin Stance",26937, classes.REVENANT),
    new Skill("Legendary Centaur Stance",29148, classes.REVENANT),
    new Skill("Legendary Centaur Stance",28427, classes.REVENANT),
    new Skill("Legendary Demon Stance",28219, classes.REVENANT),
    new Skill("Legendary Dwarf Stance",27372, classes.REVENANT)
  )

  private val engineerHealSkillsV2: List[Skill] = List(
    new Skill("Mitotic State",76738, classes.AMALGAM),
    new Skill("Coolant Blast",40507, classes.HOLOSMITH),
    new Skill("Rectifier Signet",63049, classes.MECHANIST),
    new Skill("Medic Gyro",30357, classes.SCRAPPER),
    new Skill("Healing Turret",5857, classes.ENGINEER),
    new Skill("A.E.D.",21659, classes.ENGINEER),
    new Skill("Med Kit",5802, classes.ENGINEER),
    new Skill("Elixir H",5834, classes.ENGINEER)
  )

  private val thiefHealSkillsV2: List[Skill] = List(
    new Skill("Antivenom Draught",76886, classes.ANTIQUARY),
    new Skill("Well of Gloom",63292, classes.SPECTER),
    new Skill("Malicious Restoration",45088, classes.DEADEYE),
    new Skill("Channeled Vigor",30400, classes.DAREDEVIL),
    new Skill("Signet of Malice",13050, classes.THIEF),
    new Skill("Skelk Venom",21778, classes.THIEF),
    new Skill("Withdraw",13021, classes.THIEF),
    new Skill("Hide in Shadows",13027, classes.THIEF)
  )

  private val rangerHealSkillsV2: List[Skill] = List(
    new Skill("Soothing Breeze",77271, classes.GALESHOT),
    new Skill("Perilous Gift",63319, classes.UNTAMED),
    new Skill("Bear Stance",44948, classes.SOULBEAST),
    new Skill("Glyph of Rejuvenation",31407, classes.DRUID),
    new Skill("Water Spirit",21773, classes.RANGER),
    new Skill("Healing Spring",12489, classes.RANGER),
    new Skill("Troll Unguent",12483, classes.RANGER),
    new Skill("We Heal As One!",31914, classes.RANGER)
  )

  private val mesmerHealSkillsV2: List[Skill] = List(
    new Skill("Tale of the Second Scion",76695, classes.TROUBADOUR),
    new Skill("Twin Blade Restoration",62522, classes.VIRTUOSO),
    new Skill("False Oasis",40200,classes.MIRAGE),
    new Skill("Well of Eternity",30305, classes.CHRONOMANCER),
    new Skill("Signet of the Ether",21750, classes.MESMER),
    new Skill("Mantra of Recovery",10213, classes.MESMER),
    new Skill("Mirror",10177, classes.MESMER),
    new Skill("Ether Feast",10176, classes.MESMER)
  )

  private val necromancerHealSkillsV2: List[Skill] = List(
    new Skill("Resilient Weapon",77259, classes.RITUALIST),
    new Skill("Elixir of Promise",62667, classes.HARBINGER),
    new Skill("Sand Flare",43148, classes.SCOURGE),
    new Skill("Your Soul Is Mine!",30488, classes.REAPER),
    new Skill("Signet of Vampirism",21762, classes.NECROMANCER),
    new Skill("Well of Blood",10527, classes.NECROMANCER),
    new Skill("Consume Conditions",10548, classes.NECROMANCER),
    new Skill("Summon Blood Fiend",10547, classes.NECROMANCER)
  )

  private val elementalistHealSkillsV2: List[Skill] = List(
    new Skill("Rejuvenate",76634, classes.EVOKER),
    new Skill("Soothing Water",62827, classes.CATALYST),
    new Skill("Aquatic Stance",44239, classes.WEAVER),
    new Skill("Wash the Pain Away!",29535, classes.TEMPEST),
    new Skill("Arcane Brilliance",21656 , classes.ELEMENTALIST),
    new Skill("Signet of Restoration",5503 , classes.ELEMENTALIST),
    new Skill("Ether Renewal",5507 , classes.ELEMENTALIST),
    new Skill("Glyph of Elemental Harmony",5569 , classes.ELEMENTALIST)
  )

  val healSkillListsV2: List[(List[Skill], String)] = List(
    (warriorHealSkillsV2, classes.WARRIOR),
    (guardianHealSkillsV2, classes.GUARDIAN),
    (revenantHealLegendsV2, classes.REVENANT),
    (engineerHealSkillsV2, classes.ENGINEER),
    (rangerHealSkillsV2, classes.RANGER),
    (thiefHealSkillsV2, classes.THIEF),
    (mesmerHealSkillsV2, classes.MESMER),
    (necromancerHealSkillsV2, classes.NECROMANCER),
    (elementalistHealSkillsV2, classes.ELEMENTALIST),
  )

}
