package UltimateBravery.src.main

import UltimateBravery.src.main.ClassSpecific.Classes
import UltimateBravery.src.main.Components.{ArmourComponent, SkillsComponent, TraitComponent, TrinketComponent, WeaponComponent}
import UltimateBravery.src.main.FoodUtility.{Food, Utility}
import UltimateBravery.src.main.Gear.Upgrades.Relics

class Build(chosenClass: String) {
  private val classes = new Classes

  private var classRoll: String = classes.ultimateBravery
  private var baseClass: String = classes.getBaseClass(classRoll)

  private var weapons: WeaponComponent = null
  private var traits: TraitComponent = null
  private var skills: SkillsComponent = null

  private val armour = new ArmourComponent
  private val trinkets = new TrinketComponent

  private val food = new Food().ultimateBravery
  private val utility = new Utility().ultimateBravery
  private val relic = new Relics().ultimateBravery

  private val keybinds = new Keybinds().ultimateBravery

  def iAmBrave(): String = {
    rollClass()
    toJsonString
    // println(toJsonString)
    // println("---SUIT UP AND HEAD TO BATTLE!---")
  }

  def iAmLessBrave(): String = {
    rollClass()
    toSimpleJsonString
    // println(toSimpleJsonString)
    // println("---SUIT UP AND HEAD TO BATTLE!---")
  }

  def iAmCorePvPBrave(): String = {
    rollPvPClass()
    toPvPJsonString
  }

  private def rollClass(): Unit = {
    if(classes.getAllClasses.contains(chosenClass)) {
      classRoll = chosenClass
    } else {
      classRoll = classes.ultimateBravery
    }
    rollClassBuild(classRoll)
  }

  private def rollPvPClass(): Unit = {
    classRoll = classes.coreBravery
    rollClassBuild(classRoll)
  }

  private def rollClassBuild(classToRollFor: String): Unit = {
    baseClass = classes.getBaseClass(classRoll)
    weapons = new WeaponComponent(baseClass, classRoll).generateWeapons()
    traits = new TraitComponent(baseClass, classRoll)
    skills = new SkillsComponent(baseClass, classRoll)
  }

  private def toJsonString: String = {
    "{\n" +
      "\"Class\": \"" + classRoll + "\",\n" +
      "\"Traits\": " + traits.toJsonString + ",\n" +
      "\"Skills\": " + skills.toJsonString + ",\n" +
      "\"Armour\": " + armour.toJsonString + ",\n" +
      "\"Weapons\": " + weapons.toJsonString + ",\n" +
      "\"Trinkets\": " + trinkets.toJsonString + ",\n" +
      "\"Relic\":  \"" + relic + "\",\n" +
      "\"Food\": \"" + food + "\",\n" +
      "\"Utility\": \"" + utility + "\",\n" +
      "\"Keybinds\": \"" + getKeybindString + "\"\n" +
    "}"
  }

  private def toSimpleJsonString: String = {
    "{\n" +
      "\"Class\": \"" + classRoll + "\",\n" +
      "\"Traits\": " + traits.toJsonString + ",\n" +
      "\"Skills\": " + skills.toJsonString + ",\n" +
      "\"Armour\": " + armour.toSimpleJsonString + ",\n" +
      "\"Weapons\": " + weapons.toSimpleJsonString + ",\n" +
      "\"Trinkets\": " + trinkets.toSimpleJsonString + ",\n" +
      "\"Relic\":  \"" + relic + "\",\n" +
      "\"Food\": \"" + food + "\",\n" +
      "\"Utility\": \"" + utility + "\",\n" +
      "\"Keybinds\": \"" + getKeybindString + "\"\n" +
    "}"
  }

  private def toPvPJsonString: String = {
    "{\n" +
      "\"Class\": \"" + classRoll + "\",\n" +
      "\"Traits\": " + traits.toJsonString + ",\n" +
      "\"Skills\": " + skills.toJsonString + ",\n" +
      "\"Weapons\": " + weapons.toPvpJsonString + ",\n" +
      "\"Amulet\": " + armour.toPvPJsonString + ",\n" +
      "\"Relic\":  \"" + relic + "\"\n" +
    "}"
  }

  private def getKeybindString: String = {
    var keyString = " "
    for(key <- keybinds){
      keyString = keyString + key + "  "
    }
    keyString
  }

}
