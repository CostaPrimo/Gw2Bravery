package UltimateBravery.src.main.Gear.Collections

class Stats {

  /**
   * String = Stat name
   * List[Int] = List of stat IDs
   */
  val statsV2: List[(String, List[Int])] = List(
    ("Berserker's",List(1077, 1046, 599, 584, 161)),
    ("Zealot's",List(1163, 799)),
    ("Soldier's",List(1048, 601, 586, 162)),
    ("Valkyrie",List(1119, 157)),
    ("Harrier's",List(1377, 1367, 1363, 1345)),
    ("Commander's",List(1267, 1227, 1131, 1125)),
    ("Marauder",List(1263, 1231, 1145, 1111)),
    ("Vigilant",List(1264, 1228, 1139, 1118)),
    ("Crusader",List(1271, 1232, 1109, 1098)),
    ("Wanderer's",List(1270, 1225, 1162, 1140)),
    ("Diviner's",List(1566, 1556, 1539, 1538)),
    ("Dragon's",List(1697, 1691, 1687, 1681)),
    ("Viper's",List(1268, 1224, 1153, 1130)),
    ("Grieving",List(1379, 1366, 1344, 1329)),
    ("Marshal's",List(1378, 1374, 1364, 1337)),
    ("Rampager's",List(1078, 1047, 663, 658, 159)),
    ("Assassin's",List(1128, 1040, 753)),
    ("Seraph",List(1269, 1230, 1222, 1220)),
    ("Knight's",List(1051, 662, 657, 158)),
    ("Cavalier's",List(1050, 616, 602, 583)),
    ("Nomad's",List(1066, 1063, 1026)),
    ("Settler's",List(700, 693, 690)),
    ("Giver's",List(1430, 1070, 1031, 1030, 631, 630, 629, 628, 627)),
    ("Trailblazer's",List(1262, 1229, 1115, 1085)),
    ("Minstrel's",List(1265, 1226, 1134, 1123)),
    ("Sentinel's",List(1035, 686)),
    ("Shaman's",List(1097, 1071, 153)),
    ("Ritualist's",List(1717, 1706, 1694, 1686)),
    ("Plaguedoctor's",List(1559, 1549, 1486, 1484)),
    ("Sinister",List(1067, 1065, 1064)),
    ("Carrion",List(1075, 1038, 160)),
    ("Rabid",List(1042, 594, 585, 154)),
    ("Dire",List(1114, 1073, 756, 754)),
    ("Bringer's",List(1436, 1032)),
    ("Cleric's",List(1076, 1044, 661, 656, 155)),
    ("Magi's",List(1037, 156)),
    ("Apothecary's",List(1043, 664, 659, 605)),
    ("Celestial",List(1052, 593, 588, 559))
  )

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
