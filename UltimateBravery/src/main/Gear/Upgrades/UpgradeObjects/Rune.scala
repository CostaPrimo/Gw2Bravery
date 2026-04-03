package UltimateBravery.src.main.Gear.Upgrades.UpgradeObjects

class Rune (name: String, ids: List[Int]){
  def getName: String = this.name

  def getIds: List[Int] = this.ids

  def containId(id: Int): Boolean = {
    this.ids.contains(id)
  }

  def equals(sigil: Sigil): Boolean = {
    if (this.name.equalsIgnoreCase(sigil.getName)
      && sigil.getIds.forall(p => this.containId(p))
    ) return true
    false
  }
}
