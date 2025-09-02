package UltimateBravery

import UltimateBravery.src.main.Build
import com.sun.net.httpserver.{HttpExchange, HttpHandler, HttpServer}

import java.io.OutputStream
import java.net.InetSocketAddress

object Backend {

  def main(args: Array[String]): Unit = {

    val server: HttpServer = HttpServer.create(new InetSocketAddress(8080), 0)
    server.createContext("/ultimatebravery/simple", new SimpleHandler())
    server.createContext("/ultimatebravery/complex", new ComplexHandler())
    server.createContext("/ultimatebravery/pvp", new PvPHandler())
    server.setExecutor(null)
    server.start()

    println("Server Started")
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

  class ComplexHandler extends HttpHandler {
    override def handle(exchange: HttpExchange): Unit = {
      println("Received request")
      val query = exchange.getRequestURI.getQuery
      val chosenClass = extractClassFromQueryParams(query)
      val build = new Build(chosenClass)
      val response = build.iAmBrave()
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
