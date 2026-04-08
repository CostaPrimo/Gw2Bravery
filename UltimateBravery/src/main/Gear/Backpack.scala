package UltimateBravery.src.main.Gear

import UltimateBravery.src.main.Gear.Upgrades.UpgradeObjects.{Infusion, Stat}
import org.json.JSONObject

class Backpack (stats: Stat, infusion1: Infusion, infusion2: Infusion){
  def getStats: Stat = this.stats
  def getInfusion1: Infusion = this.infusion1
  def getInfusion2: Infusion = this.infusion2

  def equals(backpack: Backpack): Boolean = {
    if (this.stats.equals(backpack.getStats)
      && this.getInfusion1.equals(backpack.getInfusion1)
      && this.getInfusion2.equals(backpack.getInfusion2)
    ) return true
    false
  }

  def equalsLite(backpack: Backpack): Boolean = {
    this.stats.equals(backpack.getStats)
  }

  def getJsonObject: JSONObject = {
    new JSONObject()
      .put("stats", this.stats.getJsonObject)
      .put("infusion1", if(this.infusion1 == null) null else this.infusion1.getJsonObject)
      .put("infusion2", if(this.infusion2 == null) null else this.infusion2.getJsonObject)
  }
}
