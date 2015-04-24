package com.textData

import org.specs2.mutable.Specification

/**
 * Created by kaustavc on 4/24/15.
 */
class ConversionTest extends Specification {
  "reverseText" should {
    "reverses given text" in {
      Conversion.reverseText("hello.") must equalTo(".olleh")
    }

    "reverses given text with spaces for same text" in {
      Conversion.reverseText("hello. hello.") must equalTo(".olleh .olleh")
    }

    "reverses different words with spaces" in {
      Conversion.reverseText("hello. ola") must equalTo("alo .olleh")
    }
  }

  "tidyText" should {
    "removes extra spaces between words" in {
      Conversion.tidyText("The  world    is a very    wide space.  ") must equalTo("The world is a very wide space.")
    }
  }

  "reverseWords" should {
    "reverses words in sentance" in {
      Conversion.reverseWords("The world is a very wide space. Or is it not?") must equalTo("ehT dlrow si a yrev ediw .ecaps rO si ti ?ton")
    }
  }
}
