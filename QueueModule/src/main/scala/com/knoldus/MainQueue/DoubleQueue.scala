package com.knoldus.MainQueue

import com.knoldus.TraitQueue.QTrait

class DoubleQueue extends QTrait {

  def enqueue(list: List[Int], input: Int): List[Int] = {
    val updated = list :+ input
    updated.map(_*2)
  }

}
