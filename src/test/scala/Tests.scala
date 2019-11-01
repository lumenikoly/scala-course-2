import org.scalatest.FunSuite

class Tests extends FunSuite {
  test("Main.fg") {
    assert(Main.fg(5) === "5.0")
  }
  test("Main.curry") {
    def f(x:Int, y: Double): String = x+y.toString
    val curryF = Main.curry(f)
    assert(curryF(5)(5.0) === "55.0")
  }
  test("Main.partApply") {
    def f(x: Int, y: Int): Int = x+y
    val partyApply = Main.partApply(f, 5)
    assert(partyApply(5) === 10 )
  }
}
//cменить на java 1.8?