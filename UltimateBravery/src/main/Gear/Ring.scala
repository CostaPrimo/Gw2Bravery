package UltimateBravery.src.main.Gear

import UltimateBravery.src.main.Gear.Upgrades.UpgradeObjects.{Infusion, Stat}
import org.json.JSONObject

class Ring(stats: Stat, infusion1: Infusion, infusion2: Infusion, infusion3: Infusion) {

  def getStats: Stat = this.stats
  def getInfusion1: Infusion = this.infusion1
  def getInfusion2: Infusion = this.infusion2
  def getInfusion3: Infusion = this.infusion3

  def toJsonString: String = {
    "{\"Stats\": \"" + this.getStats.getName + "\"," +
    "\"Infusion1\": \"" + this.getInfusion1.getAttribute + "\"," +
    "\"Infusion2\": \"" + this.getInfusion2.getAttribute + "\"," +
    "\"Infusion3\": \"" + this.getInfusion3.getAttribute + "\"}"
  }

  def equals(ring: Ring): Boolean = {
    if (this.stats.equals(ring.getStats)
      && this.infusion1.equals(ring.getInfusion1)
      && this.infusion2.equals(ring.getInfusion2)
      && this.infusion3.equals(ring.getInfusion3)
    ) return true
    false
  }

  def equalsLite(ring: Ring): Boolean = {
    this.stats.equals(ring.getStats)
  }

  def getJsonObject: JSONObject = {
    new JSONObject()
      .put("stats", this.stats.getJsonObject)
      .put("infusion1", if(this.infusion1 == null) null else this.infusion1.getJsonObject)
      .put("infusion2", if(this.infusion2 == null) null else this.infusion2.getJsonObject)
      .put("infusion3", if(this.infusion3 == null) null else this.infusion3.getJsonObject)
  }
}
