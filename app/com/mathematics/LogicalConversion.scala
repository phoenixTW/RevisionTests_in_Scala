package com.mathematics

object LogicalConversion {

  def readBinary(inBinary: Any) = {
    val intOfInBinary = getIntRepresentation(inBinary)
    val numberOfBits = intOfInBinary.toString.toCharArray.length
    convertDecimalToBinary(intOfInBinary, numberOfBits)
  }

  private def convertDecimalToBinary(intOfInBinary: Int, numberOfBits: Int): Int = {
    var toDecimal = 0
    var inBinary = intOfInBinary
    for (counter <- 0 to (numberOfBits - 1)) {
      val bit = inBinary % 10
      val radix: Int = Math.pow(2, counter.toDouble).toInt

      toDecimal += bit * radix
      inBinary /= 10
    }

    toDecimal
  }

  private def getIntRepresentation(inBinary: Any): Int = inBinary match {
    case inBinary: Int => inBinary
    case inBinary: String => inBinary.toInt
    case _ => 0
  }
}