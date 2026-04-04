package UltimateBravery.src.main.ClassSpecific.Objects

import org.json.{JSONArray, JSONObject}

class Traitline(name: String, id: Int, adeptTraits: List[Gw2Trait], masterTraits: List[Gw2Trait], grandmasterTraits: List[Gw2Trait]) {
  def getName: String = this.name
  def getId: Int = this.id
  def getAdeptTraits: List[Gw2Trait] = this.adeptTraits
  def getMasterTraits: List[Gw2Trait] = this.masterTraits
  def getGrandmasterTraits: List[Gw2Trait] = this.grandmasterTraits

  def getJsonObject: JSONObject = {
    new JSONObject()
      .put("name", this.name)
      .put("id", this.id)
      .put("adeptTrait", new JSONObject(this.adeptTraits.head))
      .put("masterTrait", new JSONObject(this.masterTraits.head))
      .put("grandmasterTrait", new JSONObject(this.grandmasterTraits.head))
  }

  def equals(traitline: Traitline): Boolean = {
    if (this.name.equals(traitline.getName)
      && this.id == traitline.getId
      && traitRowEquals(this.adeptTraits, traitline.getAdeptTraits)
      && traitRowEquals(this.masterTraits, traitline.getMasterTraits)
      && traitRowEquals(this.grandmasterTraits, traitline.getGrandmasterTraits)
    ) return true
    false
  }

  private def traitRowEquals(traitColumn: List[Gw2Trait], traitColumnExt: List[Gw2Trait]): Boolean = {
    if (traitColumn.size != traitColumnExt.size) return false

    val idSet: Set[Int] = (traitColumn.map(t => t.getId) ::: traitColumnExt.map(tx => tx.getId)).toSet
    if (idSet.size != traitColumn.size) return false

    true
  }
}
