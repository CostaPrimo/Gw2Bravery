package UltimateBravery.src.main.Gear.Collections

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
    val roll = Math.round(Math.random() * (infusions.length - 1)).toInt
    infusions(roll)
  }

}
