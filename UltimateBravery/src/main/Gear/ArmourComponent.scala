package UltimateBravery.src.main.Gear

import UltimateBravery.src.main.Gear.Pieces.Armour
import UltimateBravery.src.main.Gear.Collections.{Infusions, Runes, Stats}

class ArmourComponent {
  private val statRoller = new Stats()
  private val runeRoller = new Runes()
  private val infusionRoller = new Infusions()

  private val helmet = new Armour(statRoller, runeRoller, infusionRoller)
  private val shoulders = new Armour(statRoller, runeRoller, infusionRoller)
  private val chest = new Armour(statRoller, runeRoller, infusionRoller)
  private val gloves = new Armour(statRoller, runeRoller, infusionRoller)
  private val leggings = new Armour(statRoller, runeRoller, infusionRoller)
  private val boots = new Armour(statRoller, runeRoller, infusionRoller)

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
      "\"Stat\": \"" + helmet.getStat + "\"," +
      "\"Rune\": \"" + helmet.getRune + "\"" +
    "}"
  }

  def toPvPJsonString: String = {
    "{" +
      "\"Stat\": \"" + helmet.getPvPStats + "\"," +
      "\"Rune\": \"" + helmet.getRune + "\"" +
    "}"
  }
}
