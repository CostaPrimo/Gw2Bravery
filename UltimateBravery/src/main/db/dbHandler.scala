package UltimateBravery.src.main.db

import org.json.JSONObject

import java.sql.DriverManager
import java.sql.SQLException


class dbHandler {
  private val URL = "jdbc:sqlite:builds.db"

  def init(): Unit = {
    try {
      val conn = DriverManager.getConnection(URL)
      try if (conn != null) {
        val sql = "CREATE TABLE IF NOT EXISTS random_builds(id INTEGER PRIMARY KEY, json text NOT NULL);"
        val stmt = conn.createStatement()
        stmt.execute(sql)
      }
      catch {
        case e: SQLException => e.printStackTrace()
      } finally if (conn != null) conn.close()
    }
  }

  def saveBuild(build:JSONObject): Int = {
    try {
      val conn = DriverManager.getConnection(URL)
      try if (conn != null) {
        val sql = "INSERT INTO random_builds(json) VALUES(?)"
        val stmt = conn.prepareStatement(sql)
        stmt.setString(1, build.toString)
        stmt.executeUpdate()

        val sql2 = "SELECT last_insert_rowid() AS id"
        val stmt2 = conn.createStatement()
        val id = stmt2.executeQuery(sql2)

        return id.getInt("id")
      } catch {
        case e: SQLException =>
          e.printStackTrace
      } finally if (conn != null) conn.close()
    }
    -1
  }

  def getBuild(id: Int): JSONObject = {
    try {
      val conn = DriverManager.getConnection(URL)
      try if (conn != null) {
        val sql = "SELECT json FROM random_builds WHERE id = ?"
        val stmt = conn.prepareStatement(sql)
        stmt.setInt(1, id)
        val resultSet = stmt.executeQuery()
        new JSONObject(resultSet.getString("json"))
      } catch {
        case e: SQLException =>
          e.printStackTrace
          new JSONObject()
      } finally if (conn != null) conn.close()
    }
    new JSONObject()
  }
}
