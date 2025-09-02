package UltimateBravery.src.main.Gear.Pieces

import UltimateBravery.src.main.Gear.Collections.{Infusions, Stats}

class Accessory(statRoller: Stats, infusionRoller: Infusions) {
  private val stats = statRoller.ultimateBravery
  private val infusion = infusionRoller.ultimateBravery

  def toJsonString: String = {
    "{\"Stats\": \"" + stats + "\"," +
    "\"Infusion\": \"" + infusion + "\"}"
  }
}
