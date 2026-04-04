package UltimateBravery.src.main.ClassSpecific

import UltimateBravery.src.main.ClassSpecific.Objects.Legend

class Legends {

  private val allLegends: List[Legend] = List(
    new Legend("Legendary Dragon Stance", 1),
    new Legend("Legendary Assassin Stance", 2),
    new Legend("Legendary Dwarf Stance", 3),
    new Legend("Legendary Demon Stance", 4),
    new Legend("Legendary Renegade Stance", 5),
    new Legend("Legendary Centaur Stance", 6),
    new Legend("Legendary Alliance Stance", 7),
    new Legend("Legendary Entity Stance", 8)
  )

  val ultimateBravery: Legend = {
    val roll = Math.round(Math.random() * (allLegends.length - 1)).toInt
    allLegends(roll)
  }
}
