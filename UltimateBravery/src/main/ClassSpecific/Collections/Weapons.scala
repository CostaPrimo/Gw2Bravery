package UltimateBravery.src.main.ClassSpecific.Collections

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

  private val SCEPTER: (String, String) = ("Scepter", MAIN)
  private val FOCUS: (String, String) = ("Focus", OFF)
  private val SHIELD: (String, String) = ("Shield", OFF)
  private val TORCH: (String, String) = ("Torch", OFF)
  private val WARHORN: (String, String) = ("Warhorn", OFF)
  private val GREATSWORD: (String, String) = ("Greatsword", BOTH)
  private val HAMMER: (String, String) = ("Hammer", BOTH)
  private val LONGBOW: (String, String) = ("Longbow", BOTH)
  private val RIFLE: (String, String) = ("Rifle", BOTH)
  private val SHORT_BOW: (String, String) = ("Short Bow", BOTH)
  private val STAFF: (String, String) = ("Staff", BOTH)

  private val guardianWeapons: List[(String, String)] = List(
    (MACE, MAIN),
    (SWORD, MAIN),
    SCEPTER,
    FOCUS,
    SHIELD,
    TORCH,
    GREATSWORD,
    HAMMER,
    STAFF,
    LONGBOW,
    (AXE, MAIN),
    (SWORD, OFF),
    (PISTOL, MAIN),
    (PISTOL, OFF)
  )

  private val warriorWeapons: List[(String, String)] = List(
    (AXE, MAIN),
    (AXE, OFF),
    (MACE, MAIN),
    (MACE, OFF),
    (SWORD, MAIN),
    (SWORD, OFF),
    SHIELD,
    WARHORN,
    GREATSWORD,
    HAMMER,
    LONGBOW,
    RIFLE,
    TORCH,
    (DAGGER, MAIN),
    (DAGGER, OFF),
    (PISTOL, OFF),
    STAFF
  )

  private val revenantWeapons: List[(String, String)] = List(
    (AXE, OFF),
    (MACE, MAIN),
    (SWORD, MAIN),
    (SWORD, OFF),
    HAMMER,
    STAFF,
    SHIELD,
    SHORT_BOW,
    GREATSWORD,
    SCEPTER,
  )

  private val rangerWeapons: List[(String, String)] = List(
    (AXE, MAIN),
    (AXE, OFF),
    (DAGGER, OFF),
    (SWORD, MAIN),
    TORCH,
    WARHORN,
    GREATSWORD,
    LONGBOW,
    SHORT_BOW,
    STAFF,
    (DAGGER, MAIN),
    HAMMER,
    (MACE, MAIN),
    (MACE, OFF),
  )

  private val engineerWeapons: List[(String, String)] = List(
    (PISTOL, MAIN),
    (PISTOL, OFF),
    SHIELD,
    RIFLE,
    HAMMER,
    (SWORD, MAIN),
    (MACE, MAIN),
    SHORT_BOW
  )

  private val thiefWeapons: List[(String, String)] = List(
    (DAGGER, MAIN),
    (DAGGER, OFF),
    (PISTOL, MAIN),
    (PISTOL, OFF),
    (SWORD, MAIN),
    SHORT_BOW,
    STAFF,
    RIFLE,
    SCEPTER,
    (AXE, MAIN)
  )

  private val elementalistWeapons: List[(String, String)] = List(
    (DAGGER, MAIN),
    (DAGGER, OFF),
    SCEPTER,
    FOCUS,
    STAFF,
    WARHORN,
    (SWORD, MAIN),
    HAMMER,
    (PISTOL, MAIN)
  )

  private val mesmerWeapons: List[(String, String)] = List(
    (PISTOL, OFF),
    (SWORD, MAIN),
    (SWORD, OFF),
    SCEPTER,
    FOCUS,
    TORCH,
    GREATSWORD,
    STAFF,
    SHIELD,
    (AXE, MAIN),
    (DAGGER, MAIN),
    RIFLE
  )

  private val necromancerWeapons: List[(String, String)] = List(
    (AXE, MAIN),
    (DAGGER, MAIN),
    (DAGGER, OFF),
    SCEPTER,
    FOCUS,
    WARHORN,
    STAFF,
    GREATSWORD,
    TORCH,
    (PISTOL, MAIN),
    (SWORD, MAIN),
    (SWORD, OFF)
  )

  private val weaponLists: List[(List[(String, String)], String)] = List(
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

  def ultimateBravery(baseClass: String): (String, String) = {
    val allWeapons = getWeaponList(baseClass)
    if (allWeapons.isEmpty) ("error", "error")
    else {
      val roll = Math.round(Math.random() * (allWeapons.length - 1)).toInt
      allWeapons(roll)
    }
  }

  private def getWeaponList(baseClass: String): List[(String, String)] = {
    for(weaponList <- weaponLists) {
      if(weaponList._2 == baseClass) return weaponList._1
    }
    List()
  }
}
