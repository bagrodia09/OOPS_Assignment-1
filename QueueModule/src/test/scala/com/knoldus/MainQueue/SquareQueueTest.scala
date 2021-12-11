package com.knoldus.MainQueue

import org.scalatest.flatspec.AnyFlatSpec

class SquareQueueTest extends AnyFlatSpec {

  val squareQueue = new SquareQueue

  "It" should "return correct output when enqueue" in {
    val list = List(1,2,3)
    val input = 12
    val expected = List(1,4,9,144)
    val result = squareQueue.enqueue(list, input)
    assertResult(expected)(result)
  }
  "It" should "return only enqueue elements" in {
    val list = List()
    val input = 10
    val expected = List(100)
    val result = squareQueue.enqueue(list, input)
    assertResult(expected)(result)
  }
  "It" should "return the correct output when dequeue elements" in {
    val list = List(1,2,3,4)
    val expected = List(2,3,4)
    val result = squareQueue.dequeue(list)
    assertResult(expected)(result)
  }
  "It" should "return blank list when dequeue and list is empty" in {
    val list = List()
    val expected = List()
    val result = squareQueue.dequeue(list)
    assertResult(expected)(result)
  }
  "It" should "return blank list when dequeue " in {
    val list = List(1)
    val expected = List()
    val result = squareQueue.dequeue(list)
    assertResult(expected)(result)
  }

}
