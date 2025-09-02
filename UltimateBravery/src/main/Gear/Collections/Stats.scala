package UltimateBravery.src.main.Gear.Collections

class Stats {

  val stats: List[String] = List(
    "Berserker's",
    "Zealot's",
    "Soldier's",
    "Valkyrie",
    "Harrier's",
    "Commander's",
    "Marauder",
    "Vigilant",
    "Crusader",
    "Wanderer's",
    "Diviner's",
    "Dragon's",
    "Viper's",
    "Grieving",
    "Marshal's",
    "Rampager",
    "Assassin's",
    "Seraph",
    "Knight's",
    "Cavalier's",
    "Nomad's",
    "Settler's",
    "Giver's",
    "Trailblazer's",
    "Minstrel's",
    "Sentinel's",
    "Shaman's",
    "Ritualist's",
    "Plaguedoctor's",
    "Sinister",
    "Carrion",
    "Rabid",
    "Dire",
    "Bringer's",
    "Cleric's",
    "Magi's",
    "Apothecary's",
    "Celestial"
  )

  val pvpStats: List[String] = List(
    "Berserker's",
    "Valkyrie",
    "Heretic",
    "Tyrant",
    "Paladin",
    "Demolisher",
    "Swashbuckler",
    "Marauder",
    "Avatar",
    "Destroyer",
    "Wizard",
    "Grieving",
    "Sage",
    "Rampager's",
    "Assassin's",
    "Sinster",
    "Carrion",
    "Rabid"
  )

  def ultimateBravery: String = {
    val roll = Math.round(Math.random() * (stats.size - 1)).toInt
    stats(roll)
  }

  def pvpBravery: String = {
    val roll = Math.round(Math.random() * (pvpStats.size - 1)).toInt
    pvpStats(roll)
  }
}
