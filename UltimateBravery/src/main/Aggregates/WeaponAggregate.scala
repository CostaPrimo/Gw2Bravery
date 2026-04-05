package UltimateBravery.src.main.Aggregates

import UltimateBravery.src.main.Gear.Weapon
import org.json.JSONObject

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

  def getJsonObject: JSONObject = {
    new JSONObject()
      .put("weaponset 1", new JSONObject()
        .put("mainHand", if(this.weaponA1 == null) null else this.weaponA1.getJsonObject)
        .put("offHand", if(this.weaponA2 == null) null else this.weaponA2.getJsonObject)
      )
      .put("weaponset 2", new JSONObject()
        .put("mainHand", if(this.weaponB1 == null) null else this.weaponB1.getJsonObject)
        .put("offHand", if(this.weaponB2 == null) null else this.weaponB2.getJsonObject)
      )
  }
}
