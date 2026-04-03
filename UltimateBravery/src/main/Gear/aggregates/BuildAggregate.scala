package UltimateBravery.src.main.Gear.aggregates

import UltimateBravery.src.main.Gear.GearObjects._
import UltimateBravery.src.main.Skills.Collections.Skill

class BuildAggregate(armourAggregate: ArmourAggregate, trinketAggregate: TrinketAggregate, traitlineAggregate: TraitlineAggregate) {

  def getArmourAggregate: ArmourAggregate = this.armourAggregate
  def getTrinketAggregate: TrinketAggregate = this.trinketAggregate
  def getTraitlineAggregate: TraitlineAggregate = this.traitlineAggregate

  var weaponA1: Weapon = null
  var weaponA2: Weapon = null
  var weaponB1: Weapon = null
  var weaponB2: Weapon = null

  var relic: String = null

  var skills: List[Skill] = null


}
