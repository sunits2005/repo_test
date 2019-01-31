import main.scala.Util

object HelloWorld {
  def main(args: Array[String]): Unit = {
    val util=new Util
    println("Hello, world!")
    println(util.convertToUpperCase())
  }
}