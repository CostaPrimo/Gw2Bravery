package UltimateBravery.src.main.Gear

import UltimateBravery.src.main.Gear.Upgrades.UpgradeObjects.{Infusion, Rune, Stat}
import org.json.JSONObject

class Armour(stats: Stat, rune: Rune, infusion: Infusion) {

  def getStats: Stat = this.stats
  def getRune: Rune = this.rune
  def getInfusion: Infusion = this.infusion

  def toJsonString: String = {
    "{\"Stats\": \"" + stats.getName + "\"," +
    "\"Rune\": \"" + rune.getName + "\"," +
    "\"Infusion\": \"" + infusion.getAttribute + "\"}"
  }

  def equals(armour: Armour): Boolean = {
    if (this.stats.equals(armour.getStats)
      && this.rune.equals(armour.getRune)
      && this.infusion.equals(armour.getInfusion)
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
      .put("rune", if(this.rune == null) null else this.rune.getJsonObject)
      .put("infusion", if(this.infusion == null) null else this.infusion.getJsonObject)
  }

}
