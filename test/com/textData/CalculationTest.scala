package com.textData

import org.specs2.mutable.Specification

/**
 * Created by kaustavc on 4/24/15.
 */
class CalculationTest extends Specification {
  "getVowelCount" should {
    "gives the count of vowels" in {
      Calculation.getVowelCount("morning") must equalTo(2)
      Calculation.getVowelCount("cooling") must equalTo(3)
      Calculation.getVowelCount("i am") must equalTo(2)
    }

    "gets the count of vowels with capital letters" in {
      Calculation.getVowelCount("Owl") must equalTo(1)
      Calculation.getVowelCount("cOOling") must equalTo(3)
      Calculation.getVowelCount("I am not") must equalTo(3)
    }
  }
}
