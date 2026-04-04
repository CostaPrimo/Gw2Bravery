package UltimateBravery.src.main.Aggregates

import UltimateBravery.src.main.Gear.Armour
import org.json.JSONObject

class ArmourAggregate(helmet: Armour, shoulders: Armour, chest: Armour, gloves: Armour, leggings: Armour, boots: Armour) {
  def getHelmet: Armour = this.helmet
  def getShoulders: Armour = this.shoulders
  def getChest: Armour = this.chest
  def getGloves: Armour = this.gloves
  def getLeggings: Armour = this.leggings
  def getBoots: Armour = this.boots

  def equals(armourAggregate: ArmourAggregate): Boolean = {
    if (this.helmet.equals(armourAggregate.getHelmet)
      && this.shoulders.equals(armourAggregate.getShoulders)
      && this.chest.equals(armourAggregate.getChest)
      && this.gloves.equals(armourAggregate.getGloves)
      && this.leggings.equals(armourAggregate.getLeggings)
      && this.boots.equals(armourAggregate.getBoots)
    ) return true
    false
  }

  def equalsLite(armourAggregate: ArmourAggregate): Boolean = {
    if (this.helmet.equalsLite(armourAggregate.getHelmet)
      && this.shoulders.equalsLite(armourAggregate.getShoulders)
      && this.chest.equalsLite(armourAggregate.getChest)
      && this.gloves.equalsLite(armourAggregate.getGloves)
      && this.leggings.equalsLite(armourAggregate.getLeggings)
      && this.boots.equalsLite(armourAggregate.getBoots)
    ) return true
    false
  }

  def getJsonObject: JSONObject = {
    new JSONObject()
      .put("helmet", this.helmet.getJsonObject)
      .put("shoulders", this.shoulders.getJsonObject)
      .put("chest", this.chest.getJsonObject)
      .put("gloves", this.gloves.getJsonObject)
      .put("leggings", this.leggings.getJsonObject)
      .put("boots", this.boots.getJsonObject)
  }
}
