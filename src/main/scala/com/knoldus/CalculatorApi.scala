package com.knoldus

object CalculatorApi {
  def main(args: Array[String]): Unit = {
    val calculator = new CalculatorImpl

    println("addition of 5 and 10 : " + calculator.add(5,10))

    println("subtraction of 10 from 5 : " + calculator.subtract(5,10))

    println("multiplication of 2 and 4 : " + calculator.multiply(2,4))

    println("division of 6 by 3 : " + calculator.divide(6,3))

    println(" 2^3 : " + calculator.power(2,3)) 

    println("absolute value of -3 : " + calculator.absolute(-3)) 
  
    println("modulus of 17 and 4 : " + calculator.modulus(17,4))

    println("maximum of 100 and 10 :  " + calculator.getMaximum(100,10))

    println("minimum of 100 and 10 :  " + calculator.getMinimum(100,10))


  }

}
