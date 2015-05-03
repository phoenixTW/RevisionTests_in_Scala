package com.textData

import org.specs2.mutable.Specification

/**
 * Created by kaustavc on 4/26/15.
 */
class ResponseTest extends Specification {
  "welcome" should {
    "responds with hello text for text" in {
      Response.welcome("hmm") must equalTo("hello text")
      Response.welcome("Here I am") must equalTo("hello text")
      Response.welcome("42") must equalTo("hello text")
      Response.welcome("") must equalTo("hello text")
    }

    "responds with hey count for numbers" in {
      Response.welcome(2) must equalTo("hey count")
      Response.welcome(420) must equalTo("hey count")
      Response.welcome(0) must equalTo("hey count")
      Response.welcome(-25) must equalTo("hey count")
    }

    "responds with hey decimal for decimal numbers" in {
      Response.welcome(2.1) must equalTo("hey decimal")
      Response.welcome(420.45) must equalTo("hey decimal")
      Response.welcome(0.1) must equalTo("hey decimal")
      Response.welcome(-25.01) must equalTo("hey decimal")
    }

    "responds with hey dont count for bad calculation"
  }
}
