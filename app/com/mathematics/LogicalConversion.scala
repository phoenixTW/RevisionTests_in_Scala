package com.mathematics

object LogicalConversion {
  def readOctal(inOctal: Int) = {
    val intOfInBinary = getIntRepresentation(inOctal)
    val numberOfBits = intOfInBinary.toString.toCharArray.length
    convertToDecimal(intOfInBinary, numberOfBits, 8)
  }
  
  def readBinary(inBinary: Any) = {
    val intOfInBinary = getIntRepresentation(inBinary)
    val numberOfBits = intOfInBinary.toString.toCharArray.length
    convertToDecimal(intOfInBinary, numberOfBits, 2)
  }

  private def convertToDecimal(intOfRep: Int, numberOfBits: Int, base: Int): Int = {
    var toDecimal = 0
    var inRep = intOfRep
    for (counter <- 0 to (numberOfBits - 1)) {
      val bit = inRep % 10
      val radix: Int = Math.pow(base, counter.toDouble).toInt

      toDecimal += bit * radix
      inRep /= 10
    }

    toDecimal
  }

  private def getIntRepresentation(inBinary: Any): Int = inBinary match {
    case inBinary: Int => inBinary
    case inBinary: String => inBinary.toInt
    case _ => 0
  }
}