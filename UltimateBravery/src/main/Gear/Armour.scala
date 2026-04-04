package UltimateBravery.src.main.Gear

import UltimateBravery.src.main.Gear.Upgrades.UpgradeObjects.{Rune, Stat}
import org.json.JSONObject

class Armour(stats: Stat, rune: Rune, infusion: String) {

  def getStats: Stat = this.stats
  def getRune: Rune = this.rune
  def getInfusion: String = this.infusion

  def toJsonString: String = {
    "{\"Stats\": \"" + stats.getName + "\"," +
    "\"Rune\": \"" + rune.getName + "\"," +
    "\"Infusion\": \"" + infusion + "\"}"
  }

  def equals(armour: Armour): Boolean = {
    if (this.stats.equals(armour.getStats)
      && this.rune.equals(armour.getRune)
      && this.infusion.equalsIgnoreCase(armour.getInfusion)
    ) return true
    false
  }

  def equalsLite(armour: Armour): Boolean = {
    if (this.stats.equals(armour.getStats)
      && this.rune.equals(armour.getRune)
    ) return true
    false
  }

  def getJsonObject: JSONObject = {
    new JSONObject()
      .put("stats", this.stats.getJsonObject)
      .put("rune", this.rune.getJsonObject)
      .put("infusion", this.infusion)
  }

}
