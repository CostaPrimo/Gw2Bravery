package UltimateBravery.src.main.Gear.Upgrades.UpgradeObjects

import org.json.{JSONArray, JSONObject}

class Sigil(name: String, ids: List[Int]) {
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

  def getJsonObject: JSONObject = {
    new JSONObject()
      .put("name", this.name)
      .put("ids", new JSONArray(this.ids.toArray))
  }
}
