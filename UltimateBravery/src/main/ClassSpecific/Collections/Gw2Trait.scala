package UltimateBravery.src.main.ClassSpecific.Collections

class Gw2Trait(position: String, id: Int){
  def getPosition: String = this.position
  def getId: Int = this.id

  def equals(gw2Trait: Gw2Trait): Boolean = {
    if (this.position.equalsIgnoreCase(gw2Trait.position)
      && this.id == gw2Trait.id
    ) return true
    false
  }
}
