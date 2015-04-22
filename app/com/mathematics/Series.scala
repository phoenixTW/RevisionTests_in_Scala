package com.mathematics
import series.Fibonacci
import com.mathematics.exception.DoubleNumberException

class Series {
  def fibonacci(term: Any): Int = {
    if (term.equals(null)) throw new NullPointerException
    if (term.isInstanceOf[Double]) throw new DoubleNumberException

    val fibo = new Fibonacci(0, 1)
    fibo.calculate(term.asInstanceOf[Int])
  }
}
