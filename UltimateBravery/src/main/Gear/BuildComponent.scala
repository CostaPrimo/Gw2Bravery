package UltimateBravery.src.main.Gear

import UltimateBravery.src.main.Gear.Pieces.{Accessory, Armour, Ring, Weapon}

class BuildComponent {
  var shoes: Armour = null
  var leggings: Armour = null
  var gloves: Armour = null
  var chest: Armour = null
  var shoulders: Armour = null
  var helmet: Armour = null
  var ring1: Ring = null
  var ring2: Ring = null
  var backpack: Backpack = null
  var amulet: String = null
  var accessory1: Accessory = null
  var accessory2: Accessory = null

  var weaponA1: Weapon = null
  var weaponA2: Weapon = null
  var weaponB1: Weapon = null
  var weaponB2: Weapon = null

  var relic: String = null

  var traitLine1: (Int, List[(String, Int)]) = null
  var traitLine2: (Int, List[(String, Int)]) = null
  var traitLine3: (Int, List[(String, Int)]) = null


}
