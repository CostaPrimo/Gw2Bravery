package UltimateBravery.src.main.Gear

import UltimateBravery.src.main.Gear.Upgrades.UpgradeObjects.Stat
import org.json.JSONObject

class Accessory(stats: Stat, infusion: String) {
  def getStats: Stat = this.stats
  def getInfusion: String = this.infusion

  def toJsonString: String = {
    "{\"Stats\": \"" + this.getStats.getName + "\"," +
    "\"Infusion\": \"" + this.getInfusion + "\"}"
  }

  def equals(accessory: Accessory): Boolean = {
    if (this.stats.equals(accessory.getStats)
      && this.infusion.equalsIgnoreCase(accessory.getInfusion)
    ) return true
    false
  }

  def equalsLite(accessory: Accessory): Boolean = {
    this.stats.equals(accessory.getStats)
  }

  def getJsonObject: JSONObject = {
    new JSONObject()
      .put("stats", this.stats.getJsonObject)
      .put("infusion", this.infusion)
  }
}
