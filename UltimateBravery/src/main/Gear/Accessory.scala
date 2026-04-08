package UltimateBravery.src.main.Gear

import UltimateBravery.src.main.Gear.Upgrades.UpgradeObjects.{Infusion, Stat}
import org.json.JSONObject

class Accessory(stats: Stat, infusion: Infusion) {
  def getStats: Stat = this.stats

  def getInfusion: Infusion = this.infusion

  def toJsonString: String = {
    "{\"Stats\": \"" + this.getStats.getName + "\"," +
    "\"Infusion\": \"" + this.getInfusion.getAttribute + "\"}"
  }

  def equals(accessory: Accessory): Boolean = {
    if (this.stats.equals(accessory.getStats)
      && this.infusion.equals(accessory.getInfusion)
    ) return true
    false
  }

  def equalsLite(accessory: Accessory): Boolean = {
    this.stats.equals(accessory.getStats)
  }

  def getJsonObject: JSONObject = {
    new JSONObject()
      .put("stats", this.stats.getJsonObject)
      .put("infusion", if(this.infusion == null) null else this.infusion.getJsonObject)
  }
}
