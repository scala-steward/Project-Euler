package net.tisue.euler
import Euler._

// What is the sum of the digits of the number 2^1000?

class Problem16 extends Problem(16, "1366") {
  val powersOfTwo = Stream.iterate(BigInt(1))(_ * 2)
  def solve = powersOfTwo(1000).digits.sum
}
