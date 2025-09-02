package UltimateBravery.src.main.Gear.Pieces

import UltimateBravery.src.main.Gear.Collections.{Infusions, Stats}

class Ring(statRoller: Stats, infusionRoller: Infusions) {
  private val stats = statRoller.ultimateBravery
  private val infusion1 = infusionRoller.ultimateBravery
  private val infusion2 = infusionRoller.ultimateBravery
  private val infusion3 = infusionRoller.ultimateBravery

  def toJsonString: String = {
    "{\"Stats\": \"" + stats + "\"," +
    "\"Infusion1\": \"" + infusion1 + "\"," +
    "\"Infusion2\": \"" + infusion2 + "\"," +
    "\"Infusion3\": \"" + infusion3 + "\"}"
  }

}
