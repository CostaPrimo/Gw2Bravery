package UltimateBravery.src.main.Gear.Upgrades.UpgradeObjects

import org.json.{JSONArray, JSONObject}

class Infusion (attribute: String, ids: List[Int]) {
  def getAttribute: String = this.attribute
  def getIds: List[Int] = this.ids

  def containId(id: Int): Boolean = {
    this.ids.contains(id)
  }

  def equals(infusion: Infusion): Boolean = {
    if(this.attribute.equalsIgnoreCase(infusion.getAttribute)
    && infusion.getIds.forall(id => this.containId(id))
    ) return true
    false
  }

  def getJsonObject: JSONObject = {
    new JSONObject()
      .put("attribute", this.attribute)
      .put("ids", new JSONArray(this.ids.toArray))
  }
}
