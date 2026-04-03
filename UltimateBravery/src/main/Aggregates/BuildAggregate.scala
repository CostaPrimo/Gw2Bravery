package UltimateBravery.src.main.Aggregates

import UltimateBravery.src.main.Gear.Upgrades.UpgradeObjects.Relic

class BuildAggregate(armourAggregate: ArmourAggregate,
                     trinketAggregate: TrinketAggregate,
                     weaponAggregate: WeaponAggregate,
                     traitlineAggregate: TraitlineAggregate,
                     skillAggregate: SkillAggregate,
                     relic: Relic) {

  def getArmourAggregate: ArmourAggregate = this.armourAggregate
  def getTrinketAggregate: TrinketAggregate = this.trinketAggregate
  def getWeaponAggregate: WeaponAggregate = this.weaponAggregate
  def getTraitlineAggregate: TraitlineAggregate = this.traitlineAggregate
  def getSkillAggregate: SkillAggregate = this.skillAggregate
  def getRelic: Relic = this.relic

  def equals(buildAggregate: BuildAggregate): Boolean = {
    if(this.armourAggregate.equals(buildAggregate.getArmourAggregate)
      && this.trinketAggregate.equals(buildAggregate.getTrinketAggregate)
      && this.weaponAggregate.equals(buildAggregate.getWeaponAggregate)
      && this.traitlineAggregate.equals(buildAggregate.getTraitlineAggregate)
      && this.skillAggregate.equals(buildAggregate.getSkillAggregate)
      && this.relic.equals(buildAggregate.getRelic)
    ) return true
    false
  }

  def equalsLite(buildAggregate: BuildAggregate): Boolean = {
    if (this.armourAggregate.equalsLite(buildAggregate.getArmourAggregate)
      && this.trinketAggregate.equalsLite(buildAggregate.getTrinketAggregate)
      && this.weaponAggregate.equalsLite(buildAggregate.getWeaponAggregate)
      && this.traitlineAggregate.equals(buildAggregate.getTraitlineAggregate)
      && this.skillAggregate.equals(buildAggregate.getSkillAggregate)
      && this.relic.equals(buildAggregate.getRelic)
    ) return true
    false
  }
}
