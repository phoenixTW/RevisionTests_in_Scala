package com.mathematics

class LogicalConversion {
  def readBinary(decimalValue: Any) = {
    val inDecimal = decimalValue.toString.toInt
    Integer.toBinaryString(inDecimal).toInt
  }
}
