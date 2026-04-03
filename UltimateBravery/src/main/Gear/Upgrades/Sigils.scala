package UltimateBravery.src.main.Gear.Upgrades

import UltimateBravery.src.main.Gear.Upgrades.UpgradeObjects.Sigil

class Sigils {


  /**
   * Removed values are damage bonus sigils, on kill sigils, and stacking sigils
   * For the truly insane these can be included as well.
   */
  private val sigilsV2: List[Sigil] = List(
    new Sigil("Superior Sigil of Absorption", List(91589)),
      new Sigil("Superior Sigil of Accuracy", List(91607, 24618)),
      new Sigil("Superior Sigil of Agility", List(91403, 72092)),
      new Sigil("Superior Sigil of Agony", List(91534, 24612)),
      new Sigil("Superior Sigil of Air", List(91520, 24554)),
      new Sigil("Superior Sigil of Battle", List(91390, 24601)),
//      new Sigil("Superior Sigil of Benevolence", List(91382, 24584)),
      new Sigil("Superior Sigil of Blight", List(91542, 67913)),
      new Sigil("Superior Sigil of Blood", List(91604, 24570)),
//      new Sigil("Superior Sigil of Bloodlust", List(91476, 24575)),
//      new Sigil("Superior Sigil of Bounty", List(91492, 81045)),
      new Sigil("Superior Sigil of Bursting", List(91416)),
      new Sigil("Superior Sigil of Celerity", List(91546, 24865)),
//      new Sigil("Superior Sigil of Centaur Slaying", List(91519, 24645)),
      new Sigil("Superior Sigil of Chilling", List(91584, 24630)),
      new Sigil("Superior Sigil of Cleansing", List(91548, 67340)),
      new Sigil("Superior Sigil of Concentration", List(91473)),
//      new Sigil("Superior Sigil of Corruption", List(91496, 24578)),
//      new Sigil("Superior Sigil of Cruelty", List(91603, 67341)),
      new Sigil("Superior Sigil of Debility", List(91575, 24636)),
//      new Sigil("Superior Sigil of Demon Slaying", List(91431, 24664)),
      new Sigil("Superior Sigil of Demons", List(91388, 24583)),
//      new Sigil("Superior Sigil of Destroyer Slaying", List(91539, 24654)),
      new Sigil("Superior Sigil of Doom", List(91480, 24609)),
      new Sigil("Superior Sigil of Draining", List(91544, 70825)),
//      new Sigil("Superior Sigil of Dreams", List(91452, 24681)),
      new Sigil("Superior Sigil of Earth", List(91531, 24560)),
//      new Sigil(Superior Sigil of Elemental Slaying, List(91537, 24661)),
      new Sigil("Superior Sigil of Energy", List(91441, 24607)),
      new Sigil("Superior Sigil of Fire", List(91559, 24548)),
      new Sigil("Superior Sigil of Force", List(91439, 24615)),
      new Sigil("Superior Sigil of Frailty", List(91443, 24567)),
//      new Sigil("Superior Sigil of Frenzy", List(91461, 82876)),
      new Sigil("Superior Sigil of Generosity", List(91558, 38294)),
      new Sigil("Superior Sigil of Geomancy", List(91552, 24605)),
//      new Sigil("Superior Sigil of Ghost Slaying", List(91455, 24809)),
//      new Sigil("Superior Sigil of Grawl Slaying", List(91436, 24648)),
      new Sigil("Superior Sigil of Hobbling", List(91511, 24627)),
//      new Sigil("Superior Sigil of Hologram Slaying", List(91438, 91339)),
      new Sigil("Superior Sigil of Hydromancy", List(91406, 24597)),
      new Sigil("Superior Sigil of Ice", List(91535, 24555)),
//      new Sigil("Superior Sigil of Icebrood Slaying", List(91490, 24651)),
      new Sigil("Superior Sigil of Impact", List(91405, 24868)),
      new Sigil("Superior Sigil of Incapacitation", List(91463, 67343)),
//      new Sigil("Superior Sigil of Justice", List(91600, 24678)),
//      new Sigil("Superior Sigil of Karka Slaying", List(91413)),
      new Sigil("Superior Sigil of Leeching", List(91577, 24599)),
//      new Sigil("Superior Sigil of Life", List(91502, 24582)),
//      new Sigil("Superior Sigil of Luck", List(91393, 24591)),
//      new Sigil("Superior Sigil of Mad Scientists", List(91453, 24672)),
      new Sigil("Superior Sigil of Malice", List(91478)),
      new Sigil("Superior Sigil of Mischief", List(91543, 68436)),
//      new Sigil("Superior Sigil of Momentum", List(91521)),
      new Sigil("Superior Sigil of Nullification", List(91474, 24572)),
//      new Sigil("Superior Sigil of Ogre Slaying", List(91506, 24655)),
      new Sigil("Superior Sigil of Paralyzation", List(91398, 24639)),
//      new Sigil("Superior Sigil of Perception", List(91426, 24580)),
      new Sigil("Superior Sigil of Peril", List(91500, 24621)),
      new Sigil("Superior Sigil of Purity", List(91509, 24571)),
      new Sigil("Superior Sigil of Rage", List(91420, 24561)),
      new Sigil("Superior Sigil of Rending", List(91486, 73532)),
      new Sigil("Superior Sigil of Renewal", List(91400)),
      new Sigil("Superior Sigil of Restoration", List(91415, 24594)),
      new Sigil("Superior Sigil of Ruthlessness", List(91429, 71130)),
//      new Sigil("Superior Sigil of Serpent Slaying", List(91456, 24658)),
      new Sigil("Superior Sigil of Severance", List(91499, 84505)),
      new Sigil("Superior Sigil of Smoldering", List(91488, 24624)),
//      new Sigil("Superior Sigil of Smothering", List(91609, 24675)),
//      new Sigil("Superior Sigil of Sorrow", List(91526, 24684)),
//      new Sigil("Superior Sigil of Speed", List(91409, 24589)),
//      new Sigil("Superior Sigil of Stamina", List(91470, 24592)),
      new Sigil("Superior Sigil of Strength", List(91561, 24562)),
//      new Sigil("Superior Sigil of the Night", List(91389, 36053)),
//      new Sigil("Superior Sigil of the Stars", List(91384, 86170)),
      new Sigil("Superior Sigil of Torment", List(91412, 48911)),
      new Sigil("Superior Sigil of Transference", List(91448, 74326)),
//      new Sigil("Superior Sigil of Undead Slaying", List(91524, 24642)),
      new Sigil("Superior Sigil of Venom", List(91532, 24632)),
      new Sigil("Superior Sigil of Vision", List(91407, 24600)),
      new Sigil("Superior Sigil of Water", List(91594, 24551))
//      new Sigil("Superior Sigil of Wrath", List(91527, 24667))
  )

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
