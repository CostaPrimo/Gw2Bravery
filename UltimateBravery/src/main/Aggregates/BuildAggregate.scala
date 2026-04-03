package UltimateBravery.src.main.Aggregates

import UltimateBravery.src.main.Gear.GearObjects._
import UltimateBravery.src.main.Gear.Upgrades.UpgradeObjects.Relic
import UltimateBravery.src.main.Gear.Weapon
import UltimateBravery.src.main.Skills.Skill

class BuildAggregate(armourAggregate: ArmourAggregate,
                     trinketAggregate: TrinketAggregate,
                     traitlineAggregate: TraitlineAggregate,
                     relic: Relic,
                     skillAggregate: SkillAggregate) {

  def getArmourAggregate: ArmourAggregate = this.armourAggregate
  def getTrinketAggregate: TrinketAggregate = this.trinketAggregate
  def getTraitlineAggregate: TraitlineAggregate = this.traitlineAggregate
  def getRelic: Relic = this.relic
  def getSkillAggregate: SkillAggregate = this.skillAggregate

  var weaponA1: Weapon = null
  var weaponA2: Weapon = null
  var weaponB1: Weapon = null
  var weaponB2: Weapon = null
}
