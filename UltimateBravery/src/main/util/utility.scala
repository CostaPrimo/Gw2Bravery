package UltimateBravery.src.main.util

object utility {

  def checkNull(obj: Object, toReturn: Object): Object = {
    if (obj == null) null
    else toReturn
  }

  def rollRandomIndex(size: Int): Int = {
    Math.round(Math.random() * (size-1)).toInt
  }
}
