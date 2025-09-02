package UltimateBravery.src.main.Gear

import UltimateBravery.src.main.Gear.Pieces.{Accessory, Ring}
import UltimateBravery.src.main.Gear.Collections.{Infusions, Stats}

class TrinketComponent {

  private val statRoller = new Stats()
  private val infusionRoller = new Infusions()

  private val ring1 = new Ring(statRoller, infusionRoller)
  private val ring2 = new Ring(statRoller, infusionRoller)
  private val accessory1 = new Accessory(statRoller, infusionRoller)
  private val accessory2 = new Accessory(statRoller, infusionRoller)
  private val backpack = (statRoller.ultimateBravery, infusionRoller.ultimateBravery, infusionRoller.ultimateBravery)
  private val amulet = statRoller.ultimateBravery

  def toJsonString: String = {
    "{" +
      "\"Backpack\": " +
      "{" +
        "\"Stats\": \"" + backpack._1 + "\"," +
        "\"Infusion1\": \"" + backpack._2 + "\"," +
        "\"Infusion2\": \"" + backpack._3 + "\"" +
      "}," +
      "\"Accessory1\": " + accessory1.toJsonString + "," +
      "\"Accessory2\": " + accessory2.toJsonString + "," +
      "\"Amulet\": " +
      "{" +
        "\"Stats\": \"" + amulet + "\"" +
      "}," +
      "\"Ring1\": " + ring1.toJsonString + "," +
      "\"Ring2\": " + ring2.toJsonString +
    "}"
  }

  def toSimpleJsonString: String = {
    "{" +
      "\"Stats\": \"" + backpack._1 + "\"" +
    "}"
  }

}
