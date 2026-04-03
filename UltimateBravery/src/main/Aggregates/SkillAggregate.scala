package UltimateBravery.src.main.Aggregates

import UltimateBravery.src.main.Skills.Skill

class SkillAggregate (healSkill: Skill, utilitySkill1: Skill, utilitySkill2: Skill, utilitySkill3: Skill, eliteSkill: Skill){
  def getHealSkill: Skill = this.healSkill
  def getUtilitySkill1: Skill = this.utilitySkill1
  def getUtilitySkill2: Skill = this.utilitySkill2
  def getUtilitySkill3: Skill = this.utilitySkill3
  def getEliteSkill: Skill = this.eliteSkill

  def equals(skillAggregate: SkillAggregate): Boolean = {
    if(this.healSkill.equals(skillAggregate.getHealSkill)
      && this.utilitySkill1.equals(skillAggregate.getUtilitySkill1)
      && this.utilitySkill2.equals(skillAggregate.getUtilitySkill2)
      && this.utilitySkill3.equals(skillAggregate.getUtilitySkill3)
      && this.eliteSkill.equals(skillAggregate.getEliteSkill)
    ) return true
    false
  }
}
