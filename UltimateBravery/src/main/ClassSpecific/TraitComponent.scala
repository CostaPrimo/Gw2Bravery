package UltimateBravery.src.main.ClassSpecific

import UltimateBravery.src.main.ClassSpecific.Collections.Traitlines

class TraitComponent(baseClass: String, classRoll: String) {
  private val traitRoller = new Traitlines()

  private val traitlines = generateTraitlines

  def toJsonString: String = {
    "{" +
      "\"" + traitlines(0) + "\": " + "\"" + traitRoller.rollTraitRow + "-" + traitRoller.rollTraitRow + "-" + traitRoller.rollTraitRow + "\"," +
      "\"" + traitlines(1) + "\": " + "\"" + traitRoller.rollTraitRow + "-" + traitRoller.rollTraitRow + "-" + traitRoller.rollTraitRow + "\"," +
      "\"" + traitlines(2) + "\": " + "\"" + traitRoller.rollTraitRow + "-" + traitRoller.rollTraitRow + "-" + traitRoller.rollTraitRow + "\"" +
    "}"
  }

  private def generateTraitlines: List[String] = {
    var traitList = List[String]()
    if(classRoll != baseClass){
      traitList = classRoll :: traitList
    }

    while (traitList.size < 3) {
      val traitLine = traitRoller.ultimateBravery(baseClass)
      if(!traitList.contains(traitLine)) traitList = traitLine :: traitList
    }

    traitList
  }
}
