package UltimateBravery.src.main.Gear.aggregates

import UltimateBravery.src.main.Gear.Pieces._
import UltimateBravery.src.main.Skills.Collections.Skill

class BuildAggregate(armourAggregate: ArmourAggregate, trinketAggregate: TrinketAggregate) {

  def getArmourAggregate: ArmourAggregate = this.armourAggregate
  def getTrinketAggregate: TrinketAggregate = this.trinketAggregate

  var weaponA1: Weapon = null
  var weaponA2: Weapon = null
  var weaponB1: Weapon = null
  var weaponB2: Weapon = null

  var relic: String = null

  var traitLine1: (Int, List[(String, Int)]) = null
  var traitLine2: (Int, List[(String, Int)]) = null
  var traitLine3: (Int, List[(String, Int)]) = null

  var skills: List[Skill] = null


}
