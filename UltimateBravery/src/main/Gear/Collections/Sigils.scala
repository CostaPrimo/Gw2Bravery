package UltimateBravery.src.main.Gear.Collections

class Sigils {
  private val name: String = "Superior Sigil of "
  private val sigils: List[String] = List(
    "Accuracy",
    "Force",
    "Bursting",
    "Malice",
    "Concentration",
    "Transference",
    "Agony",
    "Smoldering",
    "Chilling",
    "Hobbling",
    "Venom",
    "Demons",
    "Peril",
    "Debility",
    "Paralyzation",
    "Nullification",
    "Purity",
    "Frailty",
    "Ice",
    "Incapacitation",
    "Air",
    "Fire",
    "Blood",
    "Generosity",
    "Rage",
    "Strength",
    "Water",
    "Blight",
    "Earth",
    "Torment",
    "Agility",
    "Battle",
    "Cleansing",
    "Doom",
    "Energy",
    "Geomancy",
    "Hydromancy",
    "Leeching",
    "Mischief",
    "Renewal",
    "Vision",
    "Absorption",
    "Celerity",
    "Draining",
    "Rending",
    "Restoration",
    "Ruthlessness",
    "Severance"
  )
  private val slayerSigils: List[String] = List(
    "Centaur Slaying",
    "Demon Slaying",
    "Destroyer Slaying",
    "Sorrow",
    "Elemental Slaying",
    "Smothering",
    "Ghost Slaying",
    "Grawl Slaying",
    "Hologram Slaying",
    "Icebrood Slaying",
    "Mad Scientists",
    "Justice",
    "Karka Slaying",
    "Serpent Slaying",
    "Dreams",
    "the Night",
    "Ogre Slaying",
    "Wrath",
    "Impact",
    "Undead Slaying"
  )
  private val onKillSigils: List[String] = List(
    "Frenzy",
    "Luck",
    "Speed",
    "Stamina"
  )
  private val stackingSigils: List[String] = List(
    "Bounty",
    "Corruption",
    "Cruelty",
    "Benevolence",
    "Life",
    "Bloodlust",
    "Perception",
    "Momentum",
    "the Stars"
  )
  private val pvpSigils: List[String] = List(
    "Absorption",
    "Agony",
    "Battle",
    "Cleansing",
    "Compounding",
    "Confusion",
    "Courage",
    "Doom",
    "Energy",
    "Enchantment",
    "Escape",
    "Exploitation",
    "Exposure",
    "Intelligence",
    "Misery",
    "Opportunity",
    "Peril",
    "Purging",
    "Revocation",
    "Ruthlessness",
    "Savagery",
    "Separation",
    "Smoldering",
    "Stagnation",
    "Transference",
    "Venom"
  )

  def ultimateBravery: String = {
    val all = sigils ::: slayerSigils ::: onKillSigils ::: stackingSigils
    val roll = Math.round(Math.random() * (all.size - 1)).toInt
    name.concat(all(roll))
  }

  def prettyBrave: String = {
    val all = sigils ::: slayerSigils ::: stackingSigils
    val roll = Math.round(Math.random() * (all.size - 1)).toInt
    name.concat(all(roll))
  }

  def kindaBrave: String = {
    val all = sigils
    val roll = Math.round(Math.random() * (all.size - 1)).toInt
    name.concat(all(roll))
  }

  def pvpBrave: String = {
    val roll = Math.round(Math.random() * (pvpSigils.size - 1)).toInt
    name.concat(pvpSigils(roll))
  }

}
