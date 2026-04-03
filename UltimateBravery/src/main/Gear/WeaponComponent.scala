package UltimateBravery.src.main.Gear

import UltimateBravery.src.main.ClassSpecific.Collections.Weapons
import UltimateBravery.src.main.Gear.GearObjects.Weapon
import UltimateBravery.src.main.Gear.Upgrades.{Infusions, Sigils, Stats}

import scala.collection.mutable

class WeaponComponent(baseClass: String, classRoll: String) {
  private val sigilRoller = new Sigils()
  private val statRoller = new Stats()
  private val infusionRoller = new Infusions()
  private val weaponsRoller = new Weapons()

  private var weapon1: (Weapon, Boolean) = (null, false)
  private var weapon2: (Weapon, Boolean) = (null, false)
  private var weapon3: (Weapon, Boolean) = (null, false)
  private var weapon4: (Weapon, Boolean) = (null, false)

  def generateWeapons(): WeaponComponent = {
    while (!weapon1._2 || !weapon2._2 || !weapon3._2 || !weapon4._2) {
      val weapon = weaponsRoller.ultimateBravery(baseClass)
      val toAdd = new Weapon(weapon, weaponsRoller, statRoller, sigilRoller, infusionRoller)
      placeWeapon(toAdd, weapon._2)
    }
    this
  }

  def toJsonString: String = {
    val sb = new mutable.StringBuilder()

    sb.append("{")
      sb.append("\"Weaponset 1\": ")
      sb.append("{")
        sb.append("\"Mainhand\": " + weapon1._1.toJsonString)
        if(weapon2._1 != null) {
          sb.append(",")
          sb.append("\"Offhand\": " + weapon2._1.toJsonString)
        }
      sb.append("},")
      sb.append("\"Weaponset 2\": ")
      sb.append("{")
        sb.append("\"Mainhand\": " + weapon3._1.toJsonString)
        if(weapon4._1 != null) {
          sb.append(",")
          sb.append("\"Offhand\": " + weapon4._1.toJsonString)
        }
      sb.append("}")
    sb.append("}")

    sb.result()
  }

  def toSimpleJsonString: String = {
    val sb = new mutable.StringBuilder()
    sb.append("{")
      sb.append("\"Weapons\": " + simpleJsonWeapons)
      sb.append(",")
      sb.append("\"Stats\": \"" + weapon1._1.getStat + "\"")
      sb.append(",")
      sb.append("\"Sigil1\": \"" + weapon1._1.getSigil1 + "\"")
      sb.append(",")
      if(weapon2._1 != null) {
        sb.append("\"Sigil2\": \"" + weapon2._1.getSigil1 + "\"")
      } else {
        sb.append("\"Sigil2\": \"" + weapon1._1.getSigil2 + "\"")
      }
      sb.append(",")
      sb.append("\"Sigil3\": \"" + weapon3._1.getSigil1 + "\"")
      sb.append(",")
      if (weapon4._1 != null) {
        sb.append("\"Sigil4\": \"" + weapon4._1.getSigil1 + "\"")
      } else {
        sb.append("\"Sigil4\": \"" + weapon3._1.getSigil2 + "\"")
      }
    sb.append("}")
    sb.result()
  }

  def toPvpJsonString: String = {
    val sb = new mutable.StringBuilder()
    sb.append("{")
    sb.append("\"Weapons\": " + simpleJsonWeapons)
    sb.append(",")
    sb.append("\"Sigil1\": \"" + weapon1._1.getPvPSigil1 + "\"")
    sb.append(",")
    if (weapon2._1 != null) {
      sb.append("\"Sigil2\": \"" + weapon2._1.getPvPSigil1 + "\"")
    } else {
      sb.append("\"Sigil2\": \"" + weapon1._1.getPvPSigil2 + "\"")
    }
    sb.append(",")
    sb.append("\"Sigil3\": \"" + weapon3._1.getPvPSigil1 + "\"")
    sb.append(",")
    if (weapon4._1 != null) {
      sb.append("\"Sigil4\": \"" + weapon4._1.getPvPSigil1 + "\"")
    } else {
      sb.append("\"Sigil4\": \"" + weapon3._1.getPvPSigil2 + "\"")
    }
    sb.append("}")
    sb.result()
  }

  private def simpleJsonWeapons: String = {
    val sb = new mutable.StringBuilder()
    sb.append("{")
    sb.append("\"Weaponset 1\": ")
      sb.append("{")
      sb.append("\"Mainhand\": \"" + weapon1._1.getWeapon + "\"")
    if (weapon2._1 != null) {
      sb.append(",")
      sb.append("\"Offhand\": \"" + weapon2._1.getWeapon + "\"")
    }
    sb.append("},")
    sb.append("\"Weaponset 2\": ")
      sb.append("{")
      sb.append("\"Mainhand\": \"" + weapon3._1.getWeapon + "\"")
    if (weapon4._1 != null) {
      sb.append(",")
      sb.append("\"Offhand\": \"" + weapon4._1.getWeapon + "\"")
    }
    sb.append("}")
    sb.append("}")

    sb.result()
  }

  private def placeWeapon(weapon: Weapon, hand: String): Unit = {
    if (hand == weaponsRoller.OFF && (!weapon2._2 || !weapon4._2)) {
      if (!weapon2._2) weapon2 = (weapon, true)
      else weapon4 = (weapon, true)
    } else if (hand == weaponsRoller.MAIN && (!weapon1._2 || !weapon3._2)) {
      if (!weapon1._2) weapon1 = (weapon, true)
      else weapon3 = (weapon, true)
    } else if (hand == weaponsRoller.BOTH && ((!weapon1._2 && !weapon2._2) || (!weapon3._2 && !weapon4._2))) {
      if (!weapon1._2 && !weapon2._2) {
        weapon1 = (weapon, true)
        weapon2 = (null, true)
      } else {
        weapon3 = (weapon, true)
        weapon4 = (null, true)
      }
    }
  }

}
