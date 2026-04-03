package UltimateBravery.src.main.Gear.GearObjects

class Armour(stats: String, rune: String, infusion: String) {

  def getStats: String = this.stats

  def getRune: String = this.rune

  def getInfusion: String = this.infusion

  def toJsonString: String = {
    "{\"Stats\": \"" + stats + "\"," +
    "\"Rune\": \"" + rune + "\"," +
    "\"Infusion\": \"" + infusion + "\"}"
  }

  def equals(armour: Armour): Boolean = {
    if (this.stats.equalsIgnoreCase(armour.getStats)
      && this.rune.equalsIgnoreCase(armour.getRune)
      && this.infusion.equalsIgnoreCase(armour.getInfusion)
    ) return true
    false
  }

  def equalsLite(armour: Armour): Boolean = {
    if (this.stats.equalsIgnoreCase(armour.getStats)
      && this.rune.equalsIgnoreCase(armour.getRune)
    ) return true
    false
  }

}
