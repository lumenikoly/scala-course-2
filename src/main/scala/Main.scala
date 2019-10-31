object Main extends App {
  //1

  def partApply(f: (Int, Int) => Int, x: Int): Int => Int = ???

  //2
  def f(x: Int): Double = x.toDouble
  def g(y: Double): String = y.toString
  def fg: Int => String = f _ andThen g

  //3
  def curry(f: (Int,  Double) => String): Int => Double => String = f.curried

}

