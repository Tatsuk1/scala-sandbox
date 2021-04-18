package function

object Run {
  def main(args:Array[String]):Unit = {
    val x = new Rational(1,2)

    val y = new Rational(2,3)

    println(y * y)
    println(y * 2)

  }
}
