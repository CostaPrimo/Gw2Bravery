package UltimateBravery.src.main.ClassSpecific.Collections

class TraitObject(id: Int, column1Ids: List[(String, Int)], column2Ids: List[(String, Int)], column3Ids: List[(String, Int)]) {
  def getId: Int = this.id
  def getColumn1Ids: List[(String, Int)] = this.column1Ids
  def getColumn2Ids: List[(String, Int)] = this.column2Ids
  def getColumn3Ids: List[(String, Int)] = this.column3Ids
}
