package UltimateBravery.src.main.Gear

import UltimateBravery.src.main.Gear.GearObjects.Armour
import UltimateBravery.src.main.Gear.Upgrades.{Infusions, Runes, Stats}

class ArmourComponent {
  private val statRoller = new Stats()
  private val runeRoller = new Runes()
  private val infusionRoller = new Infusions()

  private val helmet = new Armour(statRoller.ultimateBravery, runeRoller.ultimateBravery, infusionRoller.ultimateBravery)
  private val shoulders = new Armour(statRoller.ultimateBravery, runeRoller.ultimateBravery, infusionRoller.ultimateBravery)
  private val chest = new Armour(statRoller.ultimateBravery, runeRoller.ultimateBravery, infusionRoller.ultimateBravery)
  private val gloves = new Armour(statRoller.ultimateBravery, runeRoller.ultimateBravery, infusionRoller.ultimateBravery)
  private val leggings = new Armour(statRoller.ultimateBravery, runeRoller.ultimateBravery, infusionRoller.ultimateBravery)
  private val boots = new Armour(statRoller.ultimateBravery, runeRoller.ultimateBravery, infusionRoller.ultimateBravery)

  private val pvpStats = statRoller.pvpBravery

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
      "\"Stat\": \"" + helmet.getStats + "\"," +
      "\"Rune\": \"" + helmet.getRune + "\"" +
    "}"
  }

  def toPvPJsonString: String = {
    "{" +
      "\"Stat\": \"" + pvpStats + "\"," +
      "\"Rune\": \"" + helmet.getRune + "\"" +
    "}"
  }
}
