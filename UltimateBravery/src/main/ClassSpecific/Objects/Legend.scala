package UltimateBravery.src.main.ClassSpecific.Objects

class Legend (name: String, id: Int){
  def getName: String = this.name
  def getId: Int = this.id

  def equals(legend: Legend): Boolean = {
    if(this.name.equalsIgnoreCase(legend.getName)
      && this.id == legend.getId
    ) return true
    false
  }
}
