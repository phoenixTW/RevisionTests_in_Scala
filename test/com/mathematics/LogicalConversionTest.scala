package com.mathematics

import org.specs2.mutable.Specification

class LogicalConversionTest extends Specification {
  "readBinary" should {
    "reads numbers as binary" in {
      LogicalConversion.readBinary(0) must equalTo(0)
      LogicalConversion.readBinary(1) must equalTo(1)
      LogicalConversion.readBinary(10) must equalTo(2)
    }

    "reads text as binary" in {
      LogicalConversion.readBinary("0") must equalTo(0)
      LogicalConversion.readBinary("1") must equalTo(1)
      LogicalConversion.readBinary("10") must equalTo(2)
      LogicalConversion.readBinary("1001") must equalTo(9)
      LogicalConversion.readBinary("11111111") must equalTo(255)
    }
  }

  "readOctal" should {
    "readOctal reads numbers as octal" in {
      LogicalConversion.readOctal(0) must equalTo(0)
      LogicalConversion.readOctal(1) must equalTo(1)
      LogicalConversion.readOctal(10) must equalTo(8)
      LogicalConversion.readOctal(1001) must equalTo(513)
      LogicalConversion.readOctal(1111111) must equalTo(299593)
    }

    "readOctal reads text as octal" in {
      LogicalConversion.readOctal("0") must equalTo(0)
      LogicalConversion.readOctal("1") must equalTo(1)
      LogicalConversion.readOctal("10") must equalTo(8)
      LogicalConversion.readOctal("1001") must equalTo(513)
      LogicalConversion.readOctal("1111111") must equalTo(299593)
    }
  }
}
