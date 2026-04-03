package UltimateBravery.src.main.Gear.Upgrades

import UltimateBravery.src.main.Gear.Upgrades.UpgradeObjects.Stat

class Stats {

  val statsV2: List[Stat] = List(
    new Stat("Berserker's",List(1077, 1046, 599, 584, 161)),
    new Stat("Zealot's",List(1163, 799)),
    new Stat("Soldier's",List(1048, 601, 586, 162)),
    new Stat("Valkyrie",List(1119, 157)),
    new Stat("Harrier's",List(1377, 1367, 1363, 1345)),
    new Stat("Commander's",List(1267, 1227, 1131, 1125)),
    new Stat("Marauder",List(1263, 1231, 1145, 1111)),
    new Stat("Vigilant",List(1264, 1228, 1139, 1118)),
    new Stat("Crusader",List(1271, 1232, 1109, 1098)),
    new Stat("Wanderer's",List(1270, 1225, 1162, 1140)),
    new Stat("Diviner's",List(1566, 1556, 1539, 1538)),
    new Stat("Dragon's",List(1697, 1691, 1687, 1681)),
    new Stat("Viper's",List(1268, 1224, 1153, 1130)),
    new Stat("Grieving",List(1379, 1366, 1344, 1329)),
    new Stat("Marshal's",List(1378, 1374, 1364, 1337)),
    new Stat("Rampager's",List(1078, 1047, 663, 658, 159)),
    new Stat("Assassin's",List(1128, 1040, 753)),
    new Stat("Seraph",List(1269, 1230, 1222, 1220)),
    new Stat("Knight's",List(1051, 662, 657, 158)),
    new Stat("Cavalier's",List(1050, 616, 602, 583)),
    new Stat("Nomad's",List(1066, 1063, 1026)),
    new Stat("Settler's",List(700, 693, 690)),
    new Stat("Giver's",List(1430, 1070, 1031, 1030, 631, 630, 629, 628, 627)),
    new Stat("Trailblazer's",List(1262, 1229, 1115, 1085)),
    new Stat("Minstrel's",List(1265, 1226, 1134, 1123)),
    new Stat("Sentinel's",List(1035, 686)),
    new Stat("Shaman's",List(1097, 1071, 153)),
    new Stat("Ritualist's",List(1717, 1706, 1694, 1686)),
    new Stat("Plaguedoctor's",List(1559, 1549, 1486, 1484)),
    new Stat("Sinister",List(1067, 1065, 1064)),
    new Stat("Carrion",List(1075, 1038, 160)),
    new Stat("Rabid",List(1042, 594, 585, 154)),
    new Stat("Dire",List(1114, 1073, 756, 754)),
    new Stat("Bringer's",List(1436, 1032)),
    new Stat("Cleric's",List(1076, 1044, 661, 656, 155)),
    new Stat("Magi's",List(1037, 156)),
    new Stat("Apothecary's",List(1043, 664, 659, 605)),
    new Stat("Celestial",List(1052, 593, 588, 559))
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

  def ultimateBraveryV2: Stat = {
    val roll = Math.round(Math.random() * (statsV2.size - 1)).toInt
    statsV2(roll)
  }

  def pvpBravery: String = {
    val roll = Math.round(Math.random() * (pvpStats.size - 1)).toInt
    pvpStats(roll)
  }
}
