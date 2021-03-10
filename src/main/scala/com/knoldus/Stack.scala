package com.knoldus

//import scala.collection.mutable.ListBuffer

/**
 * LIFO (last in first out) a.k.a. com.knoldus.Stack implementation using List
 *
 * @tparam T type of elements to be stored in com.knoldus.Stack
 */
class Stack[T]{
  private var elementList: List[T] = List()

  /**
   * Checks if stack is empty.
   *
   * @return boolean true if stack is empty, false otherwise
   */
  def isEmpty: Boolean = elementList.isEmpty

  /** Returns length of the stack */
  def length: Int = elementList.length

  /**
   * Push New Element Into the com.knoldus.Stack
   *
   * @param element The element to be added to the stack
   */
  def push(element: T): Unit = elementList = elementList :+ element

  /**
   * Returns Top of the stack
   * @return top element from the stack
   * @throws NoSuchElementException If the stack is empty.
   * */
  def top: Any = elementList.last

  /** Alias for top */
  def peek() = top

  /**
   * Removes the top element from stack and returns it
   *
   * @return top element from the stack
   * @throws NoSuchElementException If the stack is empty.
   */
  def pop() = {
    val topElement = top
    elementList = elementList.init
    topElement
  }

}

object Stack{
  def apply[T](initializerList: T*): Stack[T] = {
    val newStack = new Stack[T]
    initializerList.foreach(newStack.push(_))
    newStack
  }
}
