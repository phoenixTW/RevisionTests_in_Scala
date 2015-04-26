package com.textData

/**
 * Created by kaustavc on 4/24/15.
 */
object Conversion {
  def reverseWords(context: String): String = {
    val words = context.split(" ")
    words.map(word => reverseText(word)).mkString(" ")
  }

  def tidyText(context: String): String = {
    val words = context.split(" ").filter(word  => word != "")
    words.mkString(" ")
  }

  def reverseText(context: String) = {
    context.reverse
  }
}
