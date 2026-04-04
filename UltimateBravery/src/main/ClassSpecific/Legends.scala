package UltimateBravery.src.main.ClassSpecific

import UltimateBravery.src.main.ClassSpecific.Objects.Legend

class Legends {

  private val CLASSES = new Classes

  private val baseLegends: List[Legend] = List(
    new Legend("Legendary Assassin Stance", 2),
    new Legend("Legendary Dwarf Stance", 3),
    new Legend("Legendary Demon Stance", 4),
    new Legend("Legendary Centaur Stance", 6)
  )

  private val heraldLegend: Legend = new Legend("Legendary Dragon Stance", 1)
  private val renegadeLegend: Legend = new Legend("Legendary Renegade Stance", 5)
  private val vindicatorLegend: Legend = new Legend("Legendary Alliance Stance", 7)
  private val conduitLegend: Legend = new Legend("Legendary Entity Stance", 8)

  def ultimateBravery(chosenClass: String): Legend = {
    var legendList = baseLegends
    chosenClass match {
      case CLASSES.HERALD => legendList = heraldLegend :: legendList
      case CLASSES.RENEGADE => legendList = renegadeLegend :: legendList
      case CLASSES.VINDICATOR => legendList = vindicatorLegend :: legendList
      case CLASSES.CONDUIT => legendList = conduitLegend :: legendList
    }

    val roll = Math.round(Math.random() * (legendList.length - 1)).toInt
    legendList(roll)
  }
}
