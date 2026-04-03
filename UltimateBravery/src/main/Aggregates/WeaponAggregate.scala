package UltimateBravery.src.main.Aggregates

import UltimateBravery.src.main.Gear.Weapon

class WeaponAggregate (weaponA1: Weapon, weaponA2: Weapon, weaponB1: Weapon, weaponB2: Weapon){
  def getWeaponA1: Weapon = this.weaponA1
  def getWeaponA2: Weapon = this.weaponA2
  def getWeaponB1: Weapon = this.weaponB1
  def getWeaponB2: Weapon = this.weaponB2

  def equals(weaponAggregate: WeaponAggregate): Boolean =  {
    if(this.weaponA1.equals(weaponAggregate.getWeaponA1)
    && this.weaponA2.equals(weaponAggregate.getWeaponA2)
    && this.weaponB1.equals(weaponAggregate.getWeaponB1)
    && this.weaponB2.equals(weaponAggregate.getWeaponB2)
    ) return true
    false
  }

  def equalsLite(weaponAggregate: WeaponAggregate): Boolean = {
    if (this.weaponA1.equalsLite(weaponAggregate.getWeaponA1)
      && this.weaponA2.equalsLite(weaponAggregate.getWeaponA2)
      && this.weaponB1.equalsLite(weaponAggregate.getWeaponB1)
      && this.weaponB2.equalsLite(weaponAggregate.getWeaponB2)
    ) return true
    false
  }
}
