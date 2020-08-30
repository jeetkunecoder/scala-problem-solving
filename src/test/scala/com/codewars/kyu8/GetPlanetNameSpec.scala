package com.codewars.kyu8

import org.scalatest._
import flatspec._
import matchers._

class GetPlanetNameSpec extends AnyFlatSpec with should.Matchers {

  "GetPlanetName.getPlanetName" should
    "pass fixed tests" in {
    GetPlanetName.getPlanetName(2) should be("Venus")
    GetPlanetName.getPlanetName(3) should be("Earth")
    GetPlanetName.getPlanetName(5) should be("Jupiter")
  }
}
