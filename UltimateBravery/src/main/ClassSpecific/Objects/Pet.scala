package UltimateBravery.src.main.ClassSpecific.Objects

class Pet (name: String, id: Int){
  def getName: String = this.name
  def getId: Int = this.id

  def equals(pet: Pet): Boolean = {
    if(this.name.equalsIgnoreCase(pet.getName)
      && this.id == pet.getId
    ) return true
    false
  }
}
