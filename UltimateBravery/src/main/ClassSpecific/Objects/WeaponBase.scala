package UltimateBravery.src.main.ClassSpecific.Objects

class WeaponBase (name: String, handing: String){
  def getName: String = this.name
  def getHanding: String = this.handing

  def equals(weaponBase: WeaponBase): Boolean = {
    if(this.name.equalsIgnoreCase(weaponBase.getName)
      && this.handing.equalsIgnoreCase(weaponBase.getHanding)
    ) return true
    false
  }
}
