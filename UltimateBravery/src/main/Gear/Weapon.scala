package UltimateBravery.src.main.Gear

import UltimateBravery.src.main.ClassSpecific.Objects.WeaponBase
import UltimateBravery.src.main.ClassSpecific.Weapons
import UltimateBravery.src.main.Gear.Upgrades.UpgradeObjects.{Infusion, Sigil, Stat}
import UltimateBravery.src.main.Gear.Upgrades.Sigils
import org.json.JSONObject

class Weapon(stats: Stat, sigil1: Sigil, sigil2: Sigil, infusion1: Infusion, infusion2: Infusion, weaponBase: WeaponBase) {

  private val WEAPONS: Weapons = new Weapons
  private val SIGILS: Sigils = new Sigils
  private val pvpSigil1 = SIGILS.pvpBrave
  private val pvpSigil2 = SIGILS.pvpBrave

  def getPvPSigil1: String = this.pvpSigil1
  def getPvPSigil2: String = this.pvpSigil2

  def getStats: Stat = this.stats
  def getSigil1: Sigil = this.sigil1
  def getSigil2: Sigil = this.sigil2
  def getInfusion1: Infusion = this.infusion1
  def getInfusion2: Infusion = this.infusion2
  def getWeaponBase: WeaponBase = this.weaponBase

  def toJsonString: String = {
    if(weaponBase.getHanding == WEAPONS.BOTH) {
      "{" +
        "\"Weapon\": \"" + weaponBase.getName + "\"," +
        "\"Stats\": \"" + stats.getName + "\"," +
        "\"Sigil1\": \"" + sigil1.getName + "\"," +
        "\"Sigil2\": \"" + sigil2.getName + "\"," +
        "\"Infusion1\": \"" + infusion1.getAttribute + "\"," +
        "\"Infusion2\": \"" + infusion2.getAttribute + "\"" +
      "}"
    } else {
      "{" +
        "\"Weapon\": \"" + weaponBase.getName + "\"," +
        "\"Stats\": \"" + stats.getName + "\"," +
        "\"Sigil\": \"" + sigil1.getName + "\"," +
        "\"Infusion\": \"" + infusion1.getAttribute + "\"" +
      "}"
    }
  }

  def equals(weapon: Weapon): Boolean = {
    if(equalsLite(weapon)
      && this.infusion1.equals(weapon.getInfusion1)
      && this.infusion2.equals(weapon.getInfusion2)
    ) return true
    false
  }

  def equalsLite(weapon: Weapon): Boolean = {
    if (this.weaponBase.equals(weapon.getWeaponBase)
      && this.stats.equals(weapon.getStats)
      && this.sigil1.equals(weapon.getSigil1)
      && this.sigil2.equals(weapon.getSigil2)
    ) return true
    false
  }

  def getJsonObject: JSONObject = {
    new JSONObject()
      .put("stats", this.stats.getJsonObject)
      .put("sigil1", if(sigil1 == null) { null } else { this.sigil1.getJsonObject })
      .put("sigil2", if(sigil2 == null) { null } else { this.sigil2.getJsonObject })
      .put("infusion1", if(infusion1 == null) { null } else { this.infusion1.getJsonObject })
      .put("infusion2", if(infusion2 == null) { null } else { this.infusion2.getJsonObject })
      .put("weapon", if(this.weaponBase == null) null else this.weaponBase.getJsonObject)
  }
}
