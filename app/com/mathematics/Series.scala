package com.mathematics
import series.Fibonacci

class Series {
  def fibonacci(term: Any): Int = {
    if (term.equals(null)) throw new NullPointerException

    val fibo = new Fibonacci(0, 1)
    fibo.calculate(term.asInstanceOf[Int])
  }
}
