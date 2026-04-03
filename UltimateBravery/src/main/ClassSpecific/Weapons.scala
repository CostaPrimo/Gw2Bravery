package UltimateBravery.src.main.ClassSpecific

import UltimateBravery.src.main.ClassSpecific.Objects.WeaponBase

class Weapons {

  private val classes = new Classes

  val MAIN = "Main"
  val OFF = "Off"
  val BOTH = "Both"

  private val AXE = "Axe"
  private val SWORD = "Sword"
  private val DAGGER = "Dagger"
  private val PISTOL = "Pistol"
  private val MACE = "Mace"

  private val AXE_MAIN: WeaponBase = new WeaponBase(AXE, MAIN)
  private val AXE_OFF: WeaponBase = new WeaponBase(AXE, OFF)
  private val DAGGER_MAIN: WeaponBase = new WeaponBase(DAGGER, MAIN)
  private val DAGGER_OFF: WeaponBase = new WeaponBase(DAGGER, OFF)
  private val SWORD_MAIN: WeaponBase = new WeaponBase(SWORD, MAIN)
  private val SWORD_OFF: WeaponBase = new WeaponBase(SWORD, OFF)
  private val PISTOL_MAIN: WeaponBase = new WeaponBase(PISTOL, MAIN)
  private val PISTOL_OFF: WeaponBase = new WeaponBase(PISTOL, OFF)
  private val MACE_MAIN: WeaponBase = new WeaponBase(MACE, MAIN)
  private val MACE_OFF: WeaponBase = new WeaponBase(MACE, OFF)
  private val SCEPTER: WeaponBase = new WeaponBase("Scepter", MAIN)
  private val FOCUS: WeaponBase = new WeaponBase("Focus", OFF)
  private val SHIELD: WeaponBase = new WeaponBase("Shield", OFF)
  private val TORCH: WeaponBase = new WeaponBase("Torch", OFF)
  private val WARHORN: WeaponBase= new WeaponBase("Warhorn", OFF)
  private val GREATSWORD: WeaponBase = new WeaponBase("Greatsword", BOTH)
  private val HAMMER: WeaponBase = new WeaponBase("Hammer", BOTH)
  private val LONGBOW: WeaponBase = new WeaponBase("Longbow", BOTH)
  private val RIFLE: WeaponBase = new WeaponBase("Rifle", BOTH)
  private val SHORT_BOW: WeaponBase = new WeaponBase("Short Bow", BOTH)
  private val STAFF: WeaponBase = new WeaponBase("Staff", BOTH)

  private val guardianWeapons: List[WeaponBase] = List(
    MACE_MAIN,
    SWORD_MAIN,
    SCEPTER,
    FOCUS,
    SHIELD,
    TORCH,
    GREATSWORD,
    HAMMER,
    STAFF,
    LONGBOW,
    AXE_MAIN,
    SWORD_OFF,
    PISTOL_MAIN,
    PISTOL_OFF
  )

  private val warriorWeapons: List[WeaponBase] = List(
    AXE_MAIN,
    AXE_OFF,
    MACE_MAIN,
    MACE_OFF,
    SWORD_MAIN,
    SWORD_OFF,
    SHIELD,
    WARHORN,
    GREATSWORD,
    HAMMER,
    LONGBOW,
    RIFLE,
    TORCH,
    DAGGER_MAIN,
    DAGGER_OFF,
    PISTOL_OFF,
    STAFF
  )

  private val revenantWeapons: List[WeaponBase] = List(
    AXE_OFF,
    MACE_MAIN,
    SWORD_MAIN,
    SWORD_OFF,
    HAMMER,
    STAFF,
    SHIELD,
    SHORT_BOW,
    GREATSWORD,
    SCEPTER,
  )

  private val rangerWeapons: List[WeaponBase] = List(
    AXE_MAIN,
    AXE_OFF,
    DAGGER_OFF,
    SWORD_MAIN,
    TORCH,
    WARHORN,
    GREATSWORD,
    LONGBOW,
    SHORT_BOW,
    STAFF,
    DAGGER_MAIN,
    HAMMER,
    MACE_MAIN,
    MACE_OFF,
  )

  private val engineerWeapons: List[WeaponBase] = List(
    PISTOL_MAIN,
    PISTOL_OFF,
    SHIELD,
    RIFLE,
    HAMMER,
    SWORD_MAIN,
    MACE_MAIN,
    SHORT_BOW
  )

  private val thiefWeapons: List[WeaponBase] = List(
    DAGGER_MAIN,
    DAGGER_OFF,
    PISTOL_MAIN,
    PISTOL_OFF,
    SWORD_MAIN,
    SHORT_BOW,
    STAFF,
    RIFLE,
    SCEPTER,
    AXE_MAIN
  )

  private val elementalistWeapons: List[WeaponBase] = List(
    DAGGER_MAIN,
    DAGGER_OFF,
    SCEPTER,
    FOCUS,
    STAFF,
    WARHORN,
    SWORD_MAIN,
    HAMMER,
    PISTOL_MAIN
  )

  private val mesmerWeapons: List[WeaponBase] = List(
    PISTOL_OFF,
    SWORD_MAIN,
    SWORD_OFF,
    SCEPTER,
    FOCUS,
    TORCH,
    GREATSWORD,
    STAFF,
    SHIELD,
    AXE_MAIN,
    DAGGER_MAIN,
    RIFLE
  )

  private val necromancerWeapons: List[WeaponBase] = List(
    AXE_MAIN,
    DAGGER_MAIN,
    DAGGER_OFF,
    SCEPTER,
    FOCUS,
    WARHORN,
    STAFF,
    GREATSWORD,
    TORCH,
    PISTOL_MAIN,
    SWORD_MAIN,
    SWORD_OFF
  )

  private val weaponLists: List[(List[WeaponBase], String)] = List(
    (warriorWeapons, classes.WARRIOR),
    (guardianWeapons, classes.GUARDIAN),
    (revenantWeapons, classes.REVENANT),
    (rangerWeapons, classes.RANGER),
    (engineerWeapons, classes.ENGINEER),
    (thiefWeapons, classes.THIEF),
    (mesmerWeapons, classes.MESMER),
    (necromancerWeapons, classes.NECROMANCER),
    (elementalistWeapons, classes.ELEMENTALIST)
  )

  def ultimateBravery(baseClass: String): WeaponBase = {
    val allWeapons = getWeaponList(baseClass)
    if (allWeapons.isEmpty) new WeaponBase("error", "error")
    else {
      val roll = Math.round(Math.random() * (allWeapons.length - 1)).toInt
      allWeapons(roll)
    }
  }

  private def getWeaponList(baseClass: String): List[WeaponBase] = {
    for(weaponList <- weaponLists) {
      if(weaponList._2 == baseClass) return weaponList._1
    }
    List()
  }
}
