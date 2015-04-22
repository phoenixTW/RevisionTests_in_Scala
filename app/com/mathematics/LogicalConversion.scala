package com.mathematics

class LogicalConversion {
  def readBinary(decimalValue: Int) = {
    Integer.toBinaryString(decimalValue).toInt
  }
}
