package UltimateBravery.src.main.Gear.Upgrades.UpgradeObjects

class Relic (name: String, ids: List[Int]){
  def getName: String = this.name

  def getIds: List[Int] = this.ids

  def containId(id: Int): Boolean = {
    this.ids.contains(id)
  }

  def equals(relic: Relic): Boolean = {
    if (this.name.equalsIgnoreCase(relic.getName)
      && relic.getIds.forall(p => this.containId(p))
    ) return true
    false
  }
}
