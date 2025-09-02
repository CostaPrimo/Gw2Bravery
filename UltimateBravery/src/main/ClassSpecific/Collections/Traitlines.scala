package UltimateBravery.src.main.ClassSpecific.Collections

class Traitlines {

  private val traitRow: List[String] = List(
    "Top",
    "Middle",
    "Bottom"
  )

  private val guardianTraits: List[String] = List(
    "Zeal",
    "Radiance",
    "Valor",
    "Honor",
    "Virtues"
  )

  private val revenantTraits: List[String] = List(
    "Corruption",
    "Retribution",
    "Salvation",
    "Invocation",
    "Devastation",
  )

  private val warriorTraits: List[String] = List(
    "Strength",
    "Arms",
    "Defense",
    "Tactics",
    "Discipline"
  )

  private val engineerTraits: List[String] = List(
    "Explosives",
    "Firearms",
    "Inventions",
    "Alchemy",
    "Tools"
  )

  private val rangerTraits: List[String] = List(
    "Marksmanship",
    "Skirmishing",
    "Wilderness Survival",
    "Nature Magic",
    "Beastmastery"
  )

  private val thiefTraits: List[String] = List(
    "Deadly Arts",
    "Critical Strikes",
    "Shadows Arts",
    "Acrobatics",
    "Trickery"
  )

  private val elementalistTraits: List[String] = List(
    "Fire",
    "Water",
    "Earth",
    "Air",
    "Arcane"
  )

  private val mesmerTraits: List[String] = List(
    "Dueling",
    "Inspiration",
    "Illusions",
    "Chaos",
    "Domination"
  )

  private val necromancerTraits: List[String] = List(
    "Spite",
    "Curses",
    "Death Magic",
    "Blood Magic",
    "Soul Reaping"
  )

  def ultimateBravery(baseClass: String): String ={
    val classes = new Classes
    val roll = Math.round(Math.random() * 4).toInt
    baseClass match {
      case classes.GUARDIAN => guardianTraits(roll)
      case classes.WARRIOR => warriorTraits(roll)
      case classes.REVENANT => revenantTraits(roll)
      case classes.ENGINEER => engineerTraits(roll)
      case classes.RANGER => rangerTraits(roll)
      case classes.THIEF => thiefTraits(roll)
      case classes.ELEMENTALIST => elementalistTraits(roll)
      case classes.MESMER => mesmerTraits(roll)
      case classes.NECROMANCER => necromancerTraits(roll)
      case _ => "Error"
    }
  }

  def rollTraitRow: String = {
    val roll = Math.round(Math.random() * (traitRow.size - 1)).toInt
    traitRow(roll)
  }
}
