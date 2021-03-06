package com.mathematics.series

import com.mathematics.exception.NegativeValueException

/**
 * Created by kaustavc on 4/22/15.
 */
class Fibonacci(firstValue: Int, secondValue: Int) {

  def calculate(term: Int): Int = {
    if (term < 0) throw new NegativeValueException()

    var first = firstValue
    var second = secondValue

    if (term == 1) return firstValue
    if (term == 2) return secondValue

    var counter = term - 2
    var fibonacciValue = 0

    while (counter != 0){
      fibonacciValue += firstValue + secondValue
      first = second
      second = fibonacciValue
      counter-= 1
    }

    fibonacciValue
  }

}
