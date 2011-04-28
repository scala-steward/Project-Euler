package net.tisue.euler
import Euler._
import Primes._

// What is the smallest odd composite that cannot be written as the sum of a prime and twice a
// square?

class Problem46 extends Problem(46, "5777") {
  def solve = {
    def square(n: Int) = n * n
    def isSquare(n: Int) = n == square(math.round(math.sqrt(n)).toInt)
    def hasSolution(n: Int) =
      primes.takeWhile(_ < n).exists{p => val diff = n - p;
                                     diff % 2 == 0 && isSquare(diff / 2)}
    Stream.from(3,2).find(n => !isSievedPrime(n) && !hasSolution(n)).get
  }
}