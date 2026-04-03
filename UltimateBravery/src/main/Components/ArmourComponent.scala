package UltimateBravery.src.main.Components

import UltimateBravery.src.main.Gear.Armour
import UltimateBravery.src.main.Gear.Upgrades.{Infusions, Runes, Stats}

class ArmourComponent {
  private val STATS = new Stats()
  private val RUNES = new Runes()
  private val infusionRoller = new Infusions()

  private val helmet = new Armour(STATS.ultimateBraveryV2, RUNES.ultimateBraveryV2, infusionRoller.ultimateBravery)
  private val shoulders = new Armour(STATS.ultimateBraveryV2, RUNES.ultimateBraveryV2, infusionRoller.ultimateBravery)
  private val chest = new Armour(STATS.ultimateBraveryV2, RUNES.ultimateBraveryV2, infusionRoller.ultimateBravery)
  private val gloves = new Armour(STATS.ultimateBraveryV2, RUNES.ultimateBraveryV2, infusionRoller.ultimateBravery)
  private val leggings = new Armour(STATS.ultimateBraveryV2, RUNES.ultimateBraveryV2, infusionRoller.ultimateBravery)
  private val boots = new Armour(STATS.ultimateBraveryV2, RUNES.ultimateBraveryV2, infusionRoller.ultimateBravery)

  private val pvpStats = STATS.pvpBravery

  def toJsonString: String = {
    "{" +
      "\"Helmet\": " + helmet.toJsonString + "," +
      "\"Shoulders\": " + shoulders.toJsonString + "," +
      "\"Chest\": " + chest.toJsonString + "," +
      "\"Gloves\": " + gloves.toJsonString + "," +
      "\"Leggings\": " + leggings.toJsonString + "," +
      "\"Boots\": " + boots.toJsonString +
    "}"
  }

  def toSimpleJsonString: String = {
    "{" +
      "\"Stat\": \"" + helmet.getStats.getName + "\"," +
      "\"Rune\": \"" + helmet.getRune.getName + "\"" +
    "}"
  }

  def toPvPJsonString: String = {
    "{" +
      "\"Stat\": \"" + pvpStats + "\"," +
      "\"Rune\": \"" + helmet.getRune.getName + "\"" +
    "}"
  }
}
