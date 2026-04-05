package UltimateBravery.src.main.Components

import UltimateBravery.src.main.ClassSpecific.Objects.Traitline
import UltimateBravery.src.main.ClassSpecific.Traitlines

class TraitComponent(baseClass: String, classRoll: String) {
  private val traitRoller = new Traitlines()

  private val traitlines = generateTraitlines

  def toJsonString: String = {
    val line1 = traitlines(0)
    val line2 = traitlines(1)
    val line3 = traitlines(2)

    "{" +
      "\"" + line1.getName + "\": " + "\"" + line1.getAdeptTraits.head.getPosition + "-" + line1.getMasterTraits.head.getPosition + "-" + line1.getGrandmasterTraits.head.getPosition + "\"," +
      "\"" + line2.getName + "\": " + "\"" + line2.getAdeptTraits.head.getPosition + "-" + line2.getMasterTraits.head.getPosition + "-" + line2.getGrandmasterTraits.head.getPosition + "\"," +
      "\"" + line3.getName + "\": " + "\"" + line3.getAdeptTraits.head.getPosition + "-" + line3.getMasterTraits.head.getPosition + "-" + line3.getGrandmasterTraits.head.getPosition + "\"" +
    "}"
  }

  private def generateTraitlines: List[Traitline] = {
    var traitList = List[Traitline](traitRoller.eliteUltimateBravery(classRoll))

    while (traitList.size < 3) {
      val traitlineIds = traitList.map(tl => tl.getId)
      val traitLine = traitRoller.ultimateBraveryV2(baseClass)
      if(!traitlineIds.contains(traitLine.getId)) traitList = traitLine :: traitList
    }
    traitList
  }
}
