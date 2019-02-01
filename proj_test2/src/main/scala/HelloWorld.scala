import main.scala.Util

object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")
    val util=new Util
    println(util.convertToUpperCase("sunit"))
  }
}