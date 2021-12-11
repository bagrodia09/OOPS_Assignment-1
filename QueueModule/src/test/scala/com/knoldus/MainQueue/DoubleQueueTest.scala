package com.knoldus.MainQueue

import org.scalatest.flatspec.AnyFlatSpec

class DoubleQueueTest extends AnyFlatSpec {

  val doubleQueue = new DoubleQueue

  "It" should "return only enqueue elements" in {
    val list = List()
    val input = 32
    val expected = List(64)
    val result = doubleQueue.enqueue(list, input)
    assertResult(expected)(result)
  }

  "It" should "return correct output when enqueue" in {
    val list = List(1,2,3)
    val input = 12
    val expected = List(2,4,6,24)
    val result = doubleQueue.enqueue(list, input)
    assertResult(expected)(result)
  }

  "It" should "return the correct output when dequeue" in {
    val list = List(1,2,3,4)
    val expected = List(2,3,4)
    val result = doubleQueue.dequeue(list)
    assertResult(expected)(result)
  }
  "It" should "return blank list when dequeue and list is empty" in {
    val list = List()
    val expected = List()
    val result = doubleQueue.dequeue(list)
    assertResult(expected)(result)
  }
  "It" should "return blank list when dequeue" in {
    val list = List(1)
    val expected = List()
    val result = doubleQueue.dequeue(list)
    assertResult(expected)(result)
  }


}
