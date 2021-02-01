package com.scala.tour

object HigherOrderFunctions extends App {

  override def main(args: Array[String]): Unit = {
    val salaries: Seq[Int] = Seq(20000, 70000, 40000)
    val doubleSalary: Int => Int = (x: Int) => x * 2
    val salaries1 = salaries.map(doubleSalary)

    // Using anonymous function
    val salaries2 = salaries.map(x => x * 2)

    // Idiomatic
    val salaries3 = salaries.map(_ * 2)
  }

  case class WeeklyWeatherForecast(temperatures: Seq[Double]) {
    private def convertCtoF(temp: Double) = temp * 1.8 + 32
    def forecastInFahrenheit: Seq[Double] = temperatures.map(convertCtoF)
  }
}
