package com.knoldus

/**
 * FIFO (First IN FIRST OUT) a.k.a. com.knoldus.Queue implementation using List
 *
 * @tparam T type of elements to be stored in com.knoldus.Queue
 */
class Queue[T] {
  private var elementList: List[T] = List()

  /**
   * Checks if com.knoldus.Queue is empty.
   *
   * @return boolean true if com.knoldus.Queue is empty, false otherwise
   */
  def isEmpty: Boolean = elementList.isEmpty

  /** @return length of the com.knoldus.Queue */
  def length: Int = elementList.length

  /**
   * Enqueue Operation. Adds New Element to the com.knoldus.Queue
   *
   * @param element The element to be added to the com.knoldus.Queue
   */
  def pushBack(element: T): Unit = elementList = elementList :+ element

  /**
   * Returns first element of the queue
   *
   * @throws NoSuchElementException if the queue is empty.
   */
  def front: Any = elementList.head

  /**
   * Returns last element of the queue
   *
   * @throws NoSuchElementException if the queue is empty.
   */
  def back: Any = elementList.last

  /**
   * Dequeue Operation. Removes the first element and returns it.
   *
   * @throws NoSuchElementException if the queue is empty.
   */
  def popFront() = {
    val frontElement = front
    elementList = elementList.tail
    frontElement
  }

  /** Alias for pushBack */
  def enqueue(element: T) = pushBack(element)

  /** Alias for popFront */
  def dequeue() = popFront

  /** Alias for front */
  def peek() = front

}

object Queue {
  def apply[T](initializerList: T*): Queue[T] = {
    val newQueue = new Queue[T]
    initializerList.foreach(newQueue.pushBack(_))
    newQueue
  }
}