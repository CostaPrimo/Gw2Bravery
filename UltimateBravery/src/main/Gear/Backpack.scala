package UltimateBravery.src.main.Gear

import UltimateBravery.src.main.Gear.Upgrades.UpgradeObjects.Stat

class Backpack (stats: Stat, infusion1: String, infusion2: String){
  def getStats: Stat = this.stats
  def getInfusion1: String = this.infusion1
  def getInfusion2: String = this.infusion2

  def equals(backpack: Backpack): Boolean = {
    if (this.stats.equals(backpack.getStats)
      && this.getInfusion1.equalsIgnoreCase(backpack.getInfusion1)
      && this.getInfusion2.equalsIgnoreCase(backpack.getInfusion2)
    ) return true
    false
  }

  def equalsLite(backpack: Backpack): Boolean = {
    this.stats.equals(backpack.getStats)
  }
}
