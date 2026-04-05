package UltimateBravery.src.main.Components

import UltimateBravery.src.main.Gear.{Accessory, Backpack, Ring}
import UltimateBravery.src.main.Gear.Upgrades.{Infusions, Stats}

class TrinketComponent {

  private val statRoller = new Stats()
  private val infusionRoller = new Infusions()

  private val ring1 = new Ring(statRoller.ultimateBraveryV2,
    infusionRoller.ultimateBravery,
    infusionRoller.ultimateBravery,
    infusionRoller.ultimateBravery)
  private val ring2 = new Ring(statRoller.ultimateBraveryV2,
    infusionRoller.ultimateBravery,
    infusionRoller.ultimateBravery,
    infusionRoller.ultimateBravery)
  private val accessory1 = new Accessory(statRoller.ultimateBraveryV2, infusionRoller.ultimateBravery)
  private val accessory2 = new Accessory(statRoller.ultimateBraveryV2, infusionRoller.ultimateBravery)
  private val backpack = new Backpack(statRoller.ultimateBraveryV2, infusionRoller.ultimateBravery, infusionRoller.ultimateBravery)
  private val amulet = statRoller.ultimateBraveryV2.getName

  def toJsonString: String = {
    "{" +
      "\"Backpack\": " +
      "{" +
        "\"Stats\": \"" + backpack.getStats.getName + "\"," +
        "\"Infusion1\": \"" + backpack.getInfusion1 + "\"," +
        "\"Infusion2\": \"" + backpack.getInfusion2 + "\"" +
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
      "\"Stats\": \"" + backpack.getStats.getName + "\"" +
    "}"
  }

}
