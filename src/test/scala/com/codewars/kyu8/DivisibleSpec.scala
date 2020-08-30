package com.codewars.kyu8

import org.scalatest._
import flatspec._
import matchers._

class DivisibleSpec extends AnyFlatSpec with should.Matchers {

  "isDivisible(3, 3, 4)" should
    "return false" in {
    Divisible.isDivisible(3, 3, 4) should be(false)
  }

  "isDivisible(12, 3, 4)" should
    "return true" in {
    Divisible.isDivisible(12, 3, 4) should be(true)
  }
}
