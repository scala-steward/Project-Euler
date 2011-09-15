package net.tisue.euler
import Primes._

class Problem204 extends Problem(204, "2944730") {
  def solve = {
    val ps = primes.takeWhile(_ < 100)
    def count(n: Long, p: Int): Int =
      if(n * p > 1000000000L) 0
      else 1 + ps.dropWhile(_ < p).map(count(n * p, _)).sum
    count(1, 1)
  }
}
