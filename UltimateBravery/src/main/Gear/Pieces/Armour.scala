package UltimateBravery.src.main.Gear.Pieces

import UltimateBravery.src.main.Gear.Collections.{Infusions, Runes, Stats}

class Armour(statRoller: Stats, runeRoller: Runes, infusionRoller: Infusions) {

  private val stats = statRoller.ultimateBravery
  private val pvpStats = statRoller.pvpBravery
  private val rune = runeRoller.ultimateBravery
  private val infusion = infusionRoller.ultimateBravery

  def toJsonString: String = {
    "{\"Stats\": \"" + stats + "\"," +
    "\"Rune\": \"" + rune + "\"," +
    "\"Infusion\": \"" + infusion + "\"}"
  }

  def getStat: String = {
    this.stats
  }

  def getRune: String = {
    this.rune
  }

  def getPvPStats: String = {
    this.pvpStats
  }
}
