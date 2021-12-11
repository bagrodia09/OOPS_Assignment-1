package com.knoldus.MainQueue

import com.knoldus.TraitQueue.QTrait

class SquareQueue extends QTrait  {

  def enqueue(list: List[Int], input: Int): List[Int] = {
    val updated = list :+ input
    updated.map(in=>in*in)
  }
}
