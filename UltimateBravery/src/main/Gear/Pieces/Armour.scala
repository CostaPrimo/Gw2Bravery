package UltimateBravery.src.main.Gear.Pieces

class Armour(stats: String, rune: String, infusion: String) {

  def getStats: String = this.stats

  def getRune: String = this.rune

  def getInfusion: String = this.infusion

  def toJsonString: String = {
    "{\"Stats\": \"" + stats + "\"," +
    "\"Rune\": \"" + rune + "\"," +
    "\"Infusion\": \"" + infusion + "\"}"
  }

  def compareTo(armour: Armour): Boolean = {
    if (this.stats.equalsIgnoreCase(armour.stats)
      && this.rune.equalsIgnoreCase(armour.rune)
      && this.infusion.equalsIgnoreCase(armour.infusion)) return true
    false
  }

}
