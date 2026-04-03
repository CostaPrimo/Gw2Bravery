package UltimateBravery.src.main.Gear.Upgrades.UpgradeObjects

class Stat (name: String, ids: List[Int]){
  def getName: String = this.name

  def getIds: List[Int] = this.ids

  def containId(id: Int): Boolean = {
    this.ids.contains(id)
  }

  def equals(stat: Stat): Boolean = {
    if (this.name.equalsIgnoreCase(stat.getName)
      && stat.getIds.forall(p => this.containId(p))
    ) return true
    false
  }
}
