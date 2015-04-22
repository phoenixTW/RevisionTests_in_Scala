package com.mathematics

import org.specs2.mutable.Specification

class LogicalConversionTest extends Specification {
  val logicalCoversion = new LogicalConversion()

  "readBinary" should {
    "reads numbers as binary" in {
      logicalCoversion.readBinary(0) must equalTo(0)
      logicalCoversion.readBinary(1) must equalTo(1)
      logicalCoversion.readBinary(2) must equalTo(10)
      logicalCoversion.readBinary(9) must equalTo(1001)
      logicalCoversion.readBinary(255) must equalTo(11111111)
    }
  }
}
