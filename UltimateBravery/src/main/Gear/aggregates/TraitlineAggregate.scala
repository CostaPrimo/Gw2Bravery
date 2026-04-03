package UltimateBravery.src.main.Gear.aggregates

import UltimateBravery.src.main.ClassSpecific.Objects.Traitline

class TraitlineAggregate(traitline1: Traitline, traitline2: Traitline, traitline3: Traitline) {
  def getTraitline1: Traitline = this.traitline1
  def getTraitline2: Traitline = this.traitline2
  def getTraitline3: Traitline = this.traitline3

  def equals(traitlineAggregate: TraitlineAggregate): Boolean = {
    if(this.traitline1.equals(traitlineAggregate.getTraitline1)
      && this.traitline2.equals(traitlineAggregate.getTraitline2)
      && this.traitline3.equals(traitlineAggregate.getTraitline3)
    ) return true
    false
  }

}
