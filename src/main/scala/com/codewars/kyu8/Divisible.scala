package com.codewars.kyu8

object Divisible {
  def isDivisible(n: Int, x: Int, y: Int): Boolean = {
    n % x == 0 && n % y == 0
  }
}
