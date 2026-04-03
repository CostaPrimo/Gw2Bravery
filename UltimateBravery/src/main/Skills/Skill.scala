package UltimateBravery.src.main.Skills

class Skill(name: String, id: Int, className: String){
  def getName: String = this.name
  def getId: Int = this.id
  def getClassName: String = this.className

  def equals(skill: Skill): Boolean = {
    if(this.name.equalsIgnoreCase(skill.getName)
      && this.id == skill.getId
      && this.className.equalsIgnoreCase(skill.getClassName)
    ) return true
    false
  }
}
