package com.codewars.kyu8

import org.scalatest._
import flatspec._
import matchers._

class GreeterSpec extends AnyFlatSpec with should.Matchers {

  "greet(\"Ryan\")" should
    "return Hello, Ryan how are you doing today?" in {
      val greet = Greeter.greet("Ryan")
      greet should be("Hello, Ryan how are you doing today?")
    }

  "greet(\"Shingles\")" should
    "return Hello, Shingles how are you doing today?" in {
      val greet = Greeter.greet("Shingles")
      greet should be("Hello, Shingles how are you doing today?")
    }
}
