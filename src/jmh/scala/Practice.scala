package practice
import org.openjdk.jmh.annotations.Benchmark

class Practice {

  private def test: List[Int] = (1 to 100000).toList
  @Benchmark
  def useLastJmh() = {
    new Library().last(test)
  }

  @Benchmark
  def useLastRecursiveJmh() = {
    new Library().lastRecursive(test)
  }

}
