package UltimateBravery

import UltimateBravery.src.main.{ApiHelpers, Build, BuildV2}
import UltimateBravery.src.main.ClassSpecific.Classes
import com.sun.net.httpserver.{HttpExchange, HttpHandler, HttpServer}
import org.json.{JSONArray, JSONObject}

import java.io.OutputStream
import java.net.{InetSocketAddress, URI, URLEncoder}
import java.net.http.{HttpClient, HttpRequest, HttpResponse}

object Backend {

  private val CLASSES = new Classes

  def main(args: Array[String]): Unit = {
    val server: HttpServer = HttpServer.create(new InetSocketAddress(8080), 0)
    server.createContext("/ultimatebravery/simple", new SimpleHandler())
    server.createContext("/v2/ultimatebravery", new ComplexHandlerV2())
    server.createContext("/ultimatebravery/pvp", new PvPHandler())
    server.createContext("/apitest", new ApiHandler())
    server.setExecutor(null)
    server.start()

    println("Server Started")
  }

  class ApiHandler extends HttpHandler {
    private val ApiHelpers: ApiHelpers = new ApiHelpers

    override def handle(exchange: HttpExchange): Unit = {
      println("Received api request")

      val query = exchange.getRequestURI.getQuery
      val apiKey = extractQueryParamFromQueryParams(query, "apikey")
      val character = extractQueryParamFromQueryParams(query, "character")

      val charName = URLEncoder.encode(character, "UTF-8")

      val auth = String.format("Bearer %s", apiKey)
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
        val body = ApiHelpers.convertCharacterObjectToAggregates(new JSONObject(response.body()))

        closeExchangeWithStatusAndBody(exchange, 200, body.getJsonObject.toString)
      } catch {
        case e: Exception =>
          e.printStackTrace()
          closeExchangeWithStatusAndBody(exchange, 500, e.getMessage)
      }
    }
  }

  class SimpleHandler extends HttpHandler {
    override def handle(exchange: HttpExchange): Unit = {
      println("Received request")
      val query = exchange.getRequestURI.getQuery
      val chosenClass = extractQueryParamFromQueryParams(query, "class")
      val build = new Build(chosenClass)
      val response = build.iAmLessBrave()
      closeExchangeWithStatusAndBody(exchange, 200, response)
    }
  }

  class PvPHandler extends HttpHandler {
    override def handle(exchange: HttpExchange): Unit = {
      println("Received request")
      val build = new Build("random")
      val response = build.iAmCorePvPBrave()
      closeExchangeWithStatusAndBody(exchange, 200, response)
    }
  }

  class ComplexHandlerV2 extends HttpHandler {
    override def handle(exchange: HttpExchange): Unit = {
      println("Received request")
      val query = exchange.getRequestURI.getQuery
      val chosenClass = extractQueryParamFromQueryParams(query, "class")
      var classRoll = ""

      if (CLASSES.getAllClasses.contains(chosenClass)) {
        classRoll = chosenClass
      } else {
        classRoll = CLASSES.ultimateBravery
      }

      val build = new BuildV2(classRoll)
      val response = build.getJsonObject.toString
      closeExchangeWithStatusAndBody(exchange, 200, response)
    }
  }

  private def closeExchangeWithStatusAndBody(exchange: HttpExchange, status: Int, responseBody: String): Unit = {
    exchange.getResponseHeaders.set("Access-Control-Allow-Origin", "*")
    exchange.sendResponseHeaders(status, responseBody.length)
    val os: OutputStream = exchange.getResponseBody
    os.write(responseBody.getBytes)
    os.close()
  }

  private def extractQueryParamFromQueryParams(query: String, param: String): String = {
    val queryParams = query.split("&")
    for (i <- queryParams) {
      val queryDef = i.split("=")
      if (queryDef(0).toLowerCase.equalsIgnoreCase(param)) {
        return queryDef(1).capitalize
      }
    }
    ""
  }
}
