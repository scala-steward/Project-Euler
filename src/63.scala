package net.tisue.euler
import Euler._

// How many n-digit positive integers exist which are also an nth power?

class Problem63 extends Problem(63, "49") {
  def solve = {
    def solutions(n:Int):Stream[BigInt] =
      Stream.from(1).map(BigInt(_).pow(n)).dropWhile(_.toString.size < n).takeWhile(_.toString.size == n)
    (1 to 25).flatMap(solutions(_)).size
  }
}
