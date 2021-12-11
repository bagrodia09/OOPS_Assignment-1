package com.knoldus.TraitQueue

trait QTrait {
  def enqueue(list: List[Int], input: Int): List[Int]
  def dequeue(list: List[Int]): List[Int] = {
    if(list.isEmpty)
      List()
    else
      list.tail
  }
}
