package UltimateBravery.src.main.FoodUtility

class Utility {
  private val utilities: List[String] = List(
    "Toxic Sharpening Stones",
    "Bountiful Sharpening Stones",
    "Superior Sharpening Stones",
    "Magnanimous Sharpening Stones",
    "Corsair Sharpening Stones",
    "Furious Sharpening Stones",
    "Holographic Super Cheese",
    "Toxic Focusing Crystal",
    "Bountiful Tuning Crystal",
    "Master Tuning Crystal",
    "Magnanimous Tuning Crystal",
    "Holographic Super Apple",
    "Furious Tuning Crystal",
    "Corsair Tuning Crystal",
    "Potent Lucent Oil",
    "Toxic Maintenance Oil",
    "Enhanced Lucent Oil",
    "Master Maintenance Oil",
    "Magnanimous Maintenance Oil",
    "Corsair Maintenance Oil",
    "Furious Maintenance Oil",
    "Holographic Super Drumstick",
    "Sharpening Skull",
    "Flask of Pumpkin Oil",
    "Lump of Crystallized Nougat",
    "Writ of Masterful Strength",
    "Writ of Masterful Accuracy",
    "Writ of Masterful Malice",
    "Writ of Masterful Speed",
    "Potion Of Karka Toughness"
  )

  private val slayingPotions: List[String] = List(
    "Powerful Potion of Branded Slaying",
    "Powerful Potion of Centaur Slaying",
    "Powerful Potion of Demon Slaying",
    "Powerful Potion of Destroyer Slaying",
    "Powerful Potion of Dredge Slaying",
    "Powerful Potion of Elemental Slaying",
    "Powerful Potion of Flame Legion Slaying",
    "Extended Potion of Ghost Slaying",
    "Powerful Potion of Grawl Slaying",
    "Powerful Potion of Halloween Slaying",
    "Powerful Potion of Ice Brood Slaying",
    "Powerful Potion of Inquest Slaying",
    "Powerful Potion of Krait Slaying",
    "Powerful Potion of Modrem Slaying",
    "Powerful Potion of Nightmare Court Slaying",
    "Powerful Potion of Ogre Slaying",
    "Powerful Potion of Outlaw Slaying",
    "Powerful Potion of Slaying Scarlet's Armies",
    "Powerful Potion of Sons of Svanir Slaying",
    "Powerful Potion of Undead Slaying"
  )

  def ultimateBravery: String = {
    val roll = Math.round(Math.random() * (utilities.length - 1)).toInt
    utilities(roll)
  }

}
