package com.knoldus


class CalculatorImpl {
  
  // add two number
  def add(firstNumber: Int, secondNumber: Int): Int = firstNumber + secondNumber

  // subtract secondNumber from firstNumber
  def subtract(firstNumber: Int, secondNumber: Int): Int = firstNumber - secondNumber

  // multiplies two number
  def multiply(firstNumber: Int, secondNumber: Int): Long = firstNumber * secondNumber

  // division of number
  def divide(firstNumber: Int, secondNumber: Int): Any = {
    if (secondNumber== 0) {
      "ArithmeticException : cant divide by 0"

    } else
     firstNumber / secondNumber
  }

  // calculate power of a number
  def power(number: Int, power: Int): Double = math.pow(number, power)
  
  // calculate absolute value of a number
  def absolute(number: Int): Int = math.abs(number)

  // calculate modulus
  def modulus(firstNumber: Int, secondNumber: Int): Any =
    {
      if (secondNumber == 0) {
        "ArithmeticException : cant divide by 0"

      } else
        firstNumber % secondNumber
    }

 // maximum of two
  def getMaximum(firstNumber: Int, secondNumber: Int): Int = {
    if (firstNumber > secondNumber) firstNumber
    else secondNumber
  }

  // minimum of two
  def getMinimum(firstNumber: Int, secondNumber: Int): Int = {
    if (firstNumber < secondNumber) firstNumber
    else secondNumber
  }

}


