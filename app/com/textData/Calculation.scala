package com.textData

/**
 * Created by kaustavc on 4/24/15.
 */
object Calculation {
  def getVowelCount(context: String) : Int = {
    val vowels: Array[Char] = Array('a', 'e', 'i', 'o', 'u')
    var numberOfVowel = 0

    context.toCharArray.foreach(letter => {
      if(vowels.indexOf(letter.toLower) >= 0) numberOfVowel += 1
    })

    numberOfVowel
  }

}
