package UltimateBravery

import UltimateBravery.src.main.{Build, BuildV2}
import UltimateBravery.src.main.ClassSpecific.Classes
import com.sun.net.httpserver.{HttpExchange, HttpHandler, HttpServer}
import org.json.JSONArray

import java.io.OutputStream
import java.net.{InetSocketAddress, URI, URLEncoder}
import java.net.http.{HttpClient, HttpRequest, HttpResponse}

object Backend {

  private val CLASSES = new Classes

  def main(args: Array[String]): Unit = {
    val server: HttpServer = HttpServer.create(new InetSocketAddress(8080), 0)
    server.createContext("/ultimatebravery/simple", new SimpleHandler())
    server.createContext("/v2/ultimatebravery/complex", new ComplexHandlerV2())
    server.createContext("/ultimatebravery/pvp", new PvPHandler())
    server.createContext("/apitest", new ApiHandler())
    server.setExecutor(null)
    server.start()

    println("Server Started")
  }

  class ApiHandler extends HttpHandler {
    override def handle(exchange: HttpExchange): Unit = {
      println("Received api request")
      val api_key = ""
      val charName = URLEncoder.encode("", "UTF-8")

      val auth = String.format("Bearer %s", api_key)
      val path = String.format("https://api.guildwars2.com/v2/characters?id=%s", charName)
      // https://api.guildwars2.com/v2/characters/%s/skills
      // https://api.guildwars2.com/v2/characters/%s/specializations
      val client: HttpClient = HttpClient.newHttpClient()

      try {
        val request: HttpRequest = HttpRequest.newBuilder()
          .GET()
          .uri(URI.create(path))
          .header("Authorization", auth)
          .build()
        println("Sending request")
        val response = client.send(request, HttpResponse.BodyHandlers.ofString())
        val body: JSONArray = new JSONArray(response.body())
      } catch {
        case e: Exception => println(e)
      }

      exchange.getResponseHeaders.set("Access-Control-Allow-Origin", "*")
      exchange.sendResponseHeaders(200, "OK".length)
      val os: OutputStream = exchange.getResponseBody
      os.write("OK".getBytes())
      os.close()
    }
  }

  class SimpleHandler extends HttpHandler {
    override def handle(exchange: HttpExchange): Unit = {
      println("Received request")
      val query = exchange.getRequestURI.getQuery
      val chosenClass = extractClassFromQueryParams(query)
      val build = new Build(chosenClass)
      val response = build.iAmLessBrave()
      exchange.getResponseHeaders.set("Access-Control-Allow-Origin", "*")
      exchange.sendResponseHeaders(200, response.length)
      val os: OutputStream = exchange.getResponseBody
      os.write(response.getBytes)
      os.close()
    }
  }

  class PvPHandler extends HttpHandler {
    override def handle(exchange: HttpExchange): Unit = {
      println("Received request")
      val build = new Build("random")
      val response = build.iAmCorePvPBrave()
      exchange.getResponseHeaders.set("Access-Control-Allow-Origin", "*")
      exchange.sendResponseHeaders(200, response.length)
      val os: OutputStream = exchange.getResponseBody
      os.write(response.getBytes)
      os.close()
    }
  }

  class ComplexHandlerV2 extends HttpHandler {
    override def handle(exchange: HttpExchange): Unit = {
      println("Received request")
      val query = exchange.getRequestURI.getQuery
      val chosenClass = extractClassFromQueryParams(query)
      var classRoll = ""

      if (CLASSES.getAllClasses.contains(chosenClass)) {
        classRoll = chosenClass
      } else {
        classRoll = CLASSES.ultimateBravery
      }

      val build = new BuildV2(classRoll)
      val response = build.getJsonObject.toString
      exchange.getResponseHeaders.set("Access-Control-Allow-Origin", "*")
      exchange.sendResponseHeaders(200, response.length)
      val os: OutputStream = exchange.getResponseBody
      os.write(response.getBytes)
      os.close()
    }
  }



  def extractClassFromQueryParams(query: String): String = {
    val queryParams = query.split("&")
    for (i <- queryParams) {
      val queryDef = i.split("=")
      if (queryDef(0).toLowerCase == "class") {
        return queryDef(1).capitalize
      }
    }
    ""
  }
}
