package UltimateBravery.src.main.Components

import UltimateBravery.src.main.ClassSpecific.Classes
import UltimateBravery.src.main.Skills.{EliteSkills, HealSkills, UtilitySkills}

class SkillsComponent(baseClass: String, classRoll: String) {
  private val classes = new Classes()

  private val healGenerator = new HealSkills()
  private val utilityGenerator = new UtilitySkills()
  private val eliteGenerator = new EliteSkills()

  private val healSkill = healGenerator.ultimateBravery(classRoll)
  private val utilitySkills = rollUtilitySkills
  private val eliteSkill = eliteGenerator.ultimateBravery(classRoll)

  def toJsonString: String = {
    if(baseClass == classes.REVENANT) {
      "{" +
        "\"Stance 1\": \"" + utilitySkills(0) + "\"," +
        "\"Stance 2\": \"" + utilitySkills(1) + "\"" +
      "}"
    } else {
      "{" +
        "\"Heal Skill\": \"" + healSkill + "\"," +
        "\"Utility Skill1\": \"" + utilitySkills(0) + "\"," +
        "\"Utility Skill2\": \"" + utilitySkills(1) + "\"," +
        "\"Utility Skill3\": \"" + utilitySkills(2) + "\"," +
        "\"Elite Skill\": \"" + eliteSkill + "\"" +
      "}"
    }
  }

  private def rollUtilitySkills: List[String] = {
    var rolledSKills: List[String] = List()
    while (rolledSKills.length < 3) {
      val skill = utilityGenerator.ultimateBravery(classRoll)
      if(!rolledSKills.contains(skill)) {
        rolledSKills = skill :: rolledSKills
      }
    }
    rolledSKills
  }
}
