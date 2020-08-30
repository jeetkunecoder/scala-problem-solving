package com.codewars.kyu8

object GetPlanetName {

  val solarSystem = Array("Sun", "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
  def getPlanetName(i: Int): String = {
    solarSystem(i)
  }
}
