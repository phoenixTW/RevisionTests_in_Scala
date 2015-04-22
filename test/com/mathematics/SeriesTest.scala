package com.mathematics

import com.mathematics.exception.NegativeValueException
import com.mathematics.exception.DoubleNumberException
import org.specs2.mutable.Specification

/**
 * Created by kaustavc on 4/21/15.
 */
class SeriesTest extends Specification {
  val series = new Series()
  "Fibonacci" should {
    "finds nth fibonacci number" in {
      series.fibonacci(1) must equalTo(0)
      series.fibonacci(2) must equalTo(1)
      series.fibonacci(3) must equalTo(1)
      series.fibonacci(5) must equalTo(3)
    }

    "throw NullPointerException for a null value" in {
      series.fibonacci(null) must (throwA[NullPointerException])
    }

    "throw NegativeValueException for a null value" in {
      series.fibonacci(-1) must (throwA[NegativeValueException])
      series.fibonacci(-5) must (throwA[NegativeValueException])
    }

    "should throw DecimalNumberException for decimal numbers" in {
      series.fibonacci(-0.5) must (throwA[DoubleNumberException])
      series.fibonacci(5.85) must (throwA[DoubleNumberException])
    }
  }
}
