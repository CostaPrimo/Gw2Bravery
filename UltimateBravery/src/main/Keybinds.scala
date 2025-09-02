package UltimateBravery.src.main

class Keybinds {
  var keys: List[String] = List(
    "1",
    "2",
    "3",
    "4",
    "5",
    "6",
    "7",
    "8",
    "9",
    "0",
    "F1",
    "F2",
    "F3",
    "F4",
    "F5",
    "F6",
    "F7",
    "F8",
    "F9",
    "F10",
    "F11",
    "F12",
    "Tab",
    "Space",
    "Q",
    "W",
    "E",
    "R",
    "T",
    "Y",
    "U",
    "I",
    "O",
    "P",
    "A",
    "S",
    "D",
    "F",
    "G",
    "H",
    "J",
    "K",
    "L",
    "Z",
    "X",
    "C",
    "V",
    "B",
    "N",
    "M",
    "Num1",
    "Num2",
    "Num3",
    "Num4",
    "Num5",
    "Num6",
    "Num7",
    "Num8",
    "Num9",
    "Num0"
  )

  def ultimateBravery: List[String] = {
    var rolledKeys: List[String] = List()

    while (rolledKeys.length < 16) {
      val roll = Math.round(Math.random() * (keys.size - 1)).toInt
      if (!rolledKeys.contains(keys(roll))) rolledKeys = keys(roll) :: rolledKeys
    }
    rolledKeys
  }

}
