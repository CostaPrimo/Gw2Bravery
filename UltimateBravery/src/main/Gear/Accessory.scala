package UltimateBravery.src.main.Gear

class Accessory(stats: String, infusion: String) {
  def getStats: String = this.stats
  def getInfusion: String = this.infusion

  def toJsonString: String = {
    "{\"Stats\": \"" + this.getStats + "\"," +
    "\"Infusion\": \"" + this.getInfusion + "\"}"
  }

  def equals(accessory: Accessory): Boolean = {
    if (this.stats.equalsIgnoreCase(accessory.getStats)
      && this.infusion.equalsIgnoreCase(accessory.getInfusion)
    ) return true
    false
  }

  def equalsLite(accessory: Accessory): Boolean = {
    this.stats.equalsIgnoreCase(accessory.getStats)
  }
}
