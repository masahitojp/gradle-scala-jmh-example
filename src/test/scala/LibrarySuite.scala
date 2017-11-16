package practice
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

@RunWith(classOf[JUnitRunner])
class LibrarySuite extends FunSuite {
  test("last should return last one of List") {
    assert(new Library().last(List(1, 2, 3)) === 3)
  }

  test("lastRecursive should return last one of List") {
    assert(new Library().lastRecursive(List(1, 2, 3)) === 3)
  }
}
