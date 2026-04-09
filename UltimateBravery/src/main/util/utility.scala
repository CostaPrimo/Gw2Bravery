package UltimateBravery.src.main.util

import org.json.JSONObject

object utility {

  def rollRandomIndex(size: Int): Int = {
    Math.round(Math.random() * (size-1)).toInt
  }

  def getValueIfKeyExists(jsonObject: JSONObject, key: String): JSONObject = {
    if(jsonObject.has(key)) jsonObject.getJSONObject(key)
    else new JSONObject()
  }
}
