package practice

import scala.annotation.tailrec

class Library {
  def last[T](list:List[T]): T = list.last

  @tailrec
  final def lastRecursive[T](list: List[T]): T = list match {
    case h :: Nil  => h
    case _ :: tail => lastRecursive(tail)
    case _         => throw new NoSuchElementException
  }
}
