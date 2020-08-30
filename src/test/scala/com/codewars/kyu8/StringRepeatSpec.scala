package com.codewars.kyu8

import org.scalatest._
import flatspec._
import matchers._

class StringRepeatSpec extends AnyFlatSpec with should.Matchers {

  "repeatStr method given counter is 3 and String *" should
    "return the String ***" in {
      assert(StringRepeat.repeatStr(3, "*") == "***")
    }

  "repeatStr method given counter is 2 and String is hello" should
    "return the String hellohello" in {
      StringRepeat.repeatStr(2, "hello") should be("hellohello")
    }
}
