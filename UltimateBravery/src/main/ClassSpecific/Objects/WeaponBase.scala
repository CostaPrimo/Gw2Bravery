package UltimateBravery.src.main.ClassSpecific.Objects

import org.json.{JSONArray, JSONObject}

class WeaponBase (name: String, handing: String, ids: List[Int]){
  def getName: String = this.name
  def getHanding: String = this.handing
  def getIds: List[Int] = this.ids

  def containsId(id: Int): Boolean = {
    this.ids.contains(id)
  }

  def equals(weaponBase: WeaponBase): Boolean = {
    if(this.name.equalsIgnoreCase(weaponBase.getName)
      && this.handing.equalsIgnoreCase(weaponBase.getHanding)
      && weaponBase.getIds.forall(id => this.containsId(id))
    ) return true
    false
  }

  def getJsonObject: JSONObject = {
    new JSONObject()
      .put("name", this.name)
      .put("handing", this.handing)
      .put("ids", new JSONArray(this.ids.toArray))
  }
}
