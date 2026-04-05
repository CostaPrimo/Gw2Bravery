package UltimateBravery.src.main.Aggregates

import UltimateBravery.src.main.ClassSpecific.Objects.Traitline
import org.json.JSONObject

class TraitlineAggregate(traitline1: Traitline, traitline2: Traitline, traitline3: Traitline) {
  def getTraitline1: Traitline = this.traitline1
  def getTraitline2: Traitline = this.traitline2
  def getTraitline3: Traitline = this.traitline3

  def equals(traitlineAggregate: TraitlineAggregate): Boolean = {
    if(
      (this.traitline1.equals(traitlineAggregate.getTraitline1)
        || this.traitline1.equals(traitlineAggregate.getTraitline2)
        || this.traitline1.equals(traitlineAggregate.getTraitline3))
      && (this.traitline2.equals(traitlineAggregate.getTraitline2)
        || this.traitline2.equals(traitlineAggregate.getTraitline1)
        || this.traitline2.equals(traitlineAggregate.getTraitline3))
      && (this.traitline3.equals(traitlineAggregate.getTraitline3)
        || this.traitline3.equals(traitlineAggregate.getTraitline1)
        || this.traitline3.equals(traitlineAggregate.getTraitline2))
    ) return true
    false
  }

  def getJsonObject: JSONObject = {
    new JSONObject()
      .put("traitline1", this.traitline1.getJsonObject)
      .put("traitline2", this.traitline2.getJsonObject)
      .put("traitline3", this.traitline3.getJsonObject)
  }
}
