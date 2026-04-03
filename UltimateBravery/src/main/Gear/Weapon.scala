package UltimateBravery.src.main.Gear

import UltimateBravery.src.main.ClassSpecific.Weapons
import UltimateBravery.src.main.Gear.Upgrades.{Infusions, Sigils, Stats}

class Weapon(weapon: (String, String), weapons: Weapons, statRoller: Stats, sigilRoller: Sigils, infusionRoller: Infusions) {
  private val stats = statRoller.ultimateBravery
  private val sigil1 = sigilRoller.ultimateBravery
  private val sigil2 = sigilRoller.ultimateBravery
  private val pvpSigil1 = sigilRoller.pvpBrave
  private val pvpSigil2 = sigilRoller.pvpBrave
  private val infusion1 = infusionRoller.ultimateBravery
  private val infusion2 = infusionRoller.ultimateBravery

  def toJsonString: String = {
    if(weapon._2 == weapons.BOTH) {
      "{" +
        "\"Weapon\": \"" + weapon._1 + "\"," +
        "\"Stats\": \"" + stats + "\"," +
        "\"Sigil1\": \"" + sigil1 + "\"," +
        "\"Sigil2\": \"" + sigil2 + "\"," +
        "\"Infusion1\": \"" + infusion1 + "\"," +
        "\"Infusion2\": \"" + infusion2 + "\"" +
      "}"
    } else {
      "{" +
        "\"Weapon\": \"" + weapon._1 + "\"," +
        "\"Stats\": \"" + stats + "\"," +
        "\"Sigil\": \"" + sigil1 + "\"," +
        "\"Infusion\": \"" + infusion1 + "\"" +
      "}"
    }
  }

  def getStat: String = {
    this.stats
  }

  def getSigil1: String = {
    this.sigil1
  }

  def getSigil2: String = {
    this.sigil2
  }

  def getPvPSigil1: String = {
    this.pvpSigil1
  }

  def getPvPSigil2: String = {
    this.pvpSigil2
  }

  def getWeapon: String = {
    this.weapon._1
  }
}
