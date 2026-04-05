package UltimateBravery.src.main.Gear.Upgrades

import UltimateBravery.src.main.util.utility.rollRandomIndex

class Infusions {

  val infusions: List[String] = List(
    "Mighty",
    "Precise",
    "Spiteful",
    "Malign",
    "Resilient",
    "Vital",
    "Healing",
    "Mystical"
  )

  def ultimateBravery: String = {
    val roll = rollRandomIndex(infusions.size)
    infusions(roll)
  }

}
