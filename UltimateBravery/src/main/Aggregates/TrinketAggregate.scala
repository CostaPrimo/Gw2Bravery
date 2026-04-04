package UltimateBravery.src.main.Aggregates

import UltimateBravery.src.main.Gear.{Accessory, Backpack, Ring}
import org.json.JSONObject

class TrinketAggregate(amulet: String, backpack: Backpack, ring1: Ring, ring2: Ring, accessory1: Accessory, accessory2: Accessory) {
  def getAmulet: String = this.amulet
  def getBackpack: Backpack = this.backpack
  def getRing1: Ring = this.ring1
  def getRing2: Ring = this.ring2
  def getAccessory1: Accessory = this.accessory1
  def getAccessory2: Accessory = this.accessory2

  def equals(trinketAggregate: TrinketAggregate): Boolean = {
    if (this.amulet.equalsIgnoreCase(trinketAggregate.getAmulet)
      && this.backpack.equals(trinketAggregate.getBackpack)
      && this.ring1.equals(trinketAggregate.getRing1)
      && this.ring2.equals(trinketAggregate.getRing2)
      && this.accessory1.equals(trinketAggregate.getAccessory1)
      && this.accessory2.equals(trinketAggregate.getAccessory2)
    ) return true
    false
  }

  def equalsLite(trinketAggregate: TrinketAggregate): Boolean = {
    if (this.amulet.equalsIgnoreCase(trinketAggregate.getAmulet)
      && this.backpack.equalsLite(trinketAggregate.getBackpack)
      && this.ring1.equalsLite(trinketAggregate.getRing1)
      && this.ring2.equalsLite(trinketAggregate.getRing2)
      && this.accessory1.equalsLite(trinketAggregate.getAccessory1)
      && this.accessory2.equalsLite(trinketAggregate.getAccessory2)
    ) return true
    false
  }

  def getJsonObject: JSONObject = {
    new JSONObject()
      .put("amulet", this.amulet)
      .put("backpack", this.backpack.getJsonObject)
      .put("ring1", this.ring1.getJsonObject)
      .put("ring2", this.ring2.getJsonObject)
      .put("accessory1", this.accessory1.getJsonObject)
      .put("accessory2", this.accessory2.getJsonObject)
  }
}
