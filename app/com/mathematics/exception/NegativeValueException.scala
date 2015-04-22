package com.mathematics.exception

/**
 * Created by kaustavc on 4/22/15.
 */
class NegativeValueException(message: String) extends Exception{
  override getMessage(){ message }
}
