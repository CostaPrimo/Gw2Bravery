package UltimateBravery.src.main.ClassSpecific.TraitObjects

class Gw2Trait(position: String, id: Int){
  def getPosition: String = this.position
  def getId: Int = this.id

  def equals(gw2Trait: Gw2Trait): Boolean = {
    if (this.position.equalsIgnoreCase(gw2Trait.getPosition)
      && this.id == gw2Trait.getId
    ) return true
    false
  }
}
