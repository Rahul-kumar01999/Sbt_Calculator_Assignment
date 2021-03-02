package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class CalculatorImplTest extends AnyFlatSpec {

  val calculator = new CalculatorImpl

//Test Cases for all the combination of positive and negative numbers 

  //case for add() method

  "sum of 2 positive number " should "return positive result" in {
    assert(30 == calculator.add(15, 15))
  }

  "sum of 2 negative number " should "return negative result " in {
    assert(-30 == calculator.add(-14, -16))
  }

  "sum of positive and negative number" should "return correct ans " in {
    assert(5 == calculator.add(10, -5))
  }


  //cases for subtract() method

   "subtraction of 2 positive number " should "return correct ans " in {
    assert(20 == calculator.subtract(30, 10))
  }

  
  "subtraction of positive and negative number " should "return correct ans " in  {
    assert(20 == calculator.subtract(10, -10))
  }

  "subtraction of 2 negative number " should "return correct ans" in{
    assert(0 == calculator.subtract(-30, -30))
  }


  //cases for multiply() method

  "multipication of 2 positive number " should "return positive ans" in {
    assert(30 == calculator.multiply(3, 10))
  }

 "multipication of positive and negative number " should "return negative ans" in {
    assert(-30 == calculator.multiply(3, -10))
  }


  "multipication of 2 negative number " should "return positive ans" in  {
    assert(30 == calculator.multiply(-3, -10))
  }


  //case for divide method
   
  " division of 2 positive number " should "return positive ans " in {
    assert(10 == calculator.divide(30, 3))
  } 

 " division of 2 negative number " should "return positive ans " in {
    assert(10 == calculator.divide(-30,-3))
  }

  " division of positive and negative  number " should "return negative ans " in {
    assert(-10 == calculator.divide(-30, 3))
  }

  it should " throw ArithmeticException when second number = 0 " in {
    val result = calculator.divide(30, 0)
    assert(result == "ArithmeticException : cant divide by 0")
  }

  //cases for power method

   " power of negative number " should "return correct ans " in {
    assert(4 == calculator.power(-2, 2))
  }

  " negative power of a number " should "return correct ans " in  {
    assert(0.25 == calculator.power(2, -2))
  }

  " power of a number 0 " should " return 0 " in {
    assert(0 == calculator.power(0, 30))
  }

  " power 0 of a number " should "return 1 " in {
    assert(1 == calculator.power(30, 0))
  }

 
  //cases for absolute method

  " absolute value of a negative number " should "return positive ans " in {
    assert(30 == calculator.absolute(-30))
  }


 //cases for modulus() method

 " modulus of negative and positive number " should "return negative ans " in{
    assert(-1 == calculator.modulus(-17, 4))
  }
  
  " modulus of 2 positive number " should "return positive ans " in {
    assert(1 == calculator.modulus(11, 2))
  }

  it should " throw ArithmeticException when second number = 0" in {
    val output = calculator.modulus(10, 0)
    assert(output == "ArithmeticException : cant divide by 0")
  }


  //cases for getMaximum method

  "maximum of 2 negative number " should "return correct ans" in  {
    assert(-20 == calculator.getMaximum(-20, -30))
  }

  "maximum of positive and negative " should " return positive ans" in {
    assert(20 == calculator.getMaximum(20, -30))
  }
 
 "maximum of 2 positive number " should "return correct positive ans" in {
    assert(30 == calculator.getMaximum(10, 30))
  }

  //cases for getMinimum method

  "minimum of 2 negative number " should "return correct negative ans " in {
    assert(-20 == calculator.getMinimum(-20, -10))
  }

  "minimum of positive and negative number " should "return negative ans" in {
    assert(-30 == calculator.getMinimum(20, -30))
  }
 
 "minimum of 2 positive number " should "return correct positive ans" in {
    assert(20 == calculator.getMinimum(20, 30))
  }

}
