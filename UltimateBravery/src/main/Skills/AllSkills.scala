package UltimateBravery.src.main.Skills

import UltimateBravery.src.main.ClassSpecific.Classes
import UltimateBravery.src.main.util.utility.rollRandomIndex

class AllSkills {

  private val CLASSES: Classes = new Classes

  private val healSkills: HealSkills = new HealSkills
  private val utilitySkills: UtilitySkills = new UtilitySkills
  private val eliteSkills: EliteSkills = new EliteSkills

  def ultimateBraveryHeal(classRoll: String): Skill = {
    ultimateBravery(classRoll, healSkills.healSkillListsV2)
  }

  def ultimateBraveryUtility(classRoll: String): Skill = {
    ultimateBravery(classRoll, utilitySkills.utilitySkillListsV2)
  }

  def ultimateBraveryElite(classRoll: String): Skill = {
    ultimateBravery(classRoll, eliteSkills.eliteSkillListsV2)
  }

  private def ultimateBravery(classRoll: String, skillLists: List[(List[Skill], String)]): Skill = {
    val baseClass = CLASSES.getBaseClass(classRoll)
    val skillList = filterSkills(getSkillList(baseClass, skillLists), baseClass, classRoll)
    if (skillList.isEmpty) new Skill("Error", -1, "Error")
    else {
      val roll = rollRandomIndex(skillList.size)
      skillList(roll)
    }
  }

  private def getSkillList(baseClass: String, skillCollection: List[(List[Skill], String)]): List[Skill] = {
    for (skillList <- skillCollection) {
      if (skillList._2.equalsIgnoreCase(baseClass)) return skillList._1
    }
    List()
  }

  private def filterSkills(skillList: List[Skill], baseClass: String, chosenClass: String): List[Skill] = {
    var newList: List[Skill] = List()
    for (skill <- skillList) {
      if (skill.getClassName.equalsIgnoreCase(baseClass) || skill.getClassName.equalsIgnoreCase(chosenClass)) newList = skill :: newList
    }
    newList
  }

}
