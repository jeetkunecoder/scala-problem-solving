package com.library.training

object SumDigitNumbers extends App {

  // Using sum
  val a = "123".map(_.asDigit).sum
  println(a)

  // Using fold
  val b = 123.toString.map(_.asDigit).fold(0)(_ + _)
  println(b)

  // Taking the base in consideration
  def sumDigits(x: BigInt, base: Int = 10): BigInt = {
    x.toString(base).map(_.asDigit).sum
  }

  sumDigits(0)                                // => 0
  sumDigits(0, 2)                       // => 0
  sumDigits(0, 16)                      // => 0
  sumDigits(1234)                             // => 10
  sumDigits(0xfe)                             // => 11
  sumDigits(0xfe, 16)                   // => 29
  sumDigits(0xf0e, 16)                  // => 162
  sumDigits(BigInt("12345678901234567890"))   // => 90
}
