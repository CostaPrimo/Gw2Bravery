package UltimateBravery.src.main.Gear

import UltimateBravery.src.main.Gear.Upgrades.UpgradeObjects.Stat
import org.json.JSONObject

class Ring(stats: Stat, infusion1: String, infusion2: String, infusion3: String) {

  def getStats: Stat = this.stats
  def getInfusion1: String = this.infusion1
  def getInfusion2: String = this.infusion2
  def getInfusion3: String = this.infusion3

  def toJsonString: String = {
    "{\"Stats\": \"" + this.getStats.getName + "\"," +
    "\"Infusion1\": \"" + this.getInfusion1 + "\"," +
    "\"Infusion2\": \"" + this.getInfusion2 + "\"," +
    "\"Infusion3\": \"" + this.getInfusion3 + "\"}"
  }

  def equals(ring: Ring): Boolean = {
    if (this.stats.equals(ring.getStats)
      && this.infusion1.equalsIgnoreCase(ring.getInfusion1)
      && this.infusion2.equalsIgnoreCase(ring.getInfusion2)
      && this.infusion3.equalsIgnoreCase(ring.getInfusion3)
    ) return true
    false
  }

  def equalsLite(ring: Ring): Boolean = {
    this.stats.equals(ring.getStats)
  }

  def getJsonObject: JSONObject = {
    new JSONObject()
      .put("stats", this.stats.getJsonObject)
      .put("infusion1", this.infusion1)
      .put("infusion2", this.infusion2)
      .put("infusion3", this.infusion3)
  }
}
