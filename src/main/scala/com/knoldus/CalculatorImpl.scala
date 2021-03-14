// Copyright (C) 2011-2012 the original author or authors.
// See the LICENCE.txt file distributed with this work for additional
// information regarding copyright ownership.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.knoldus

class CalculatorImpl{

  // add two number
  def add(firstNumber: Int, secondNumber: Int): Int ={
    firstNumber + secondNumber
  }

  // subtract secondNumber from firstNumber
  def subtract(firstNumber: Int, secondNumber: Int): Int ={
    firstNumber - secondNumber
  }

  // multiplies two number
  def multiply(firstNumber: Int, secondNumber: Int): Long ={
    firstNumber * secondNumber
  }

  // division of number
  def divide(firstNumber: Int, secondNumber: Int): Any = {
    if(secondNumber== 0){
      "ArithmeticException : cannot divide by 0"
    }
     else{
     firstNumber / secondNumber
    }
  }

  // calculate power of a number
  def power(number: Int, power: Int): Double ={
    math.pow(number, power)
  }
  // calculate absolute value of a number
  def absolute(number: Int): Int ={
    math.abs(number)
  }

  // calculate modulus
  def modulus(firstNumber: Int, secondNumber: Int): Any =
    {
      if(secondNumber == 0){
        "ArithmeticException : cannot divide by 0"
      }
        else{
        firstNumber % secondNumber
      }
    }

 // maximum of two
  def getMaximum(firstNumber: Int, secondNumber: Int): Int = {
    if(firstNumber > secondNumber){
      firstNumber
    }
    else{
      secondNumber
    }
  }

  // minimum of two
  def getMinimum(firstNumber: Int, secondNumber: Int): Int = {
    if(firstNumber < secondNumber){
       firstNumber
    }
    else{
      secondNumber
    }
  }

}


