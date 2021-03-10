package com.knoldus

import scala.annotation.tailrec

object ListOperationsDemo extends App {

  /**
   * Get the last element of a list with its index
   *
   * @return A tuple of (index, last element)
   * @throws Exception if list is empty
   */
  @tailrec def getLast[T](inputList: List[T], index: Int = 0: Int): (Int, T) = inputList match {
    case element :: Nil => index -> element
    case element :: listTail => getLast(listTail, index + 1)
    case _ => throw new Exception("No last element exists")
  }



  /**
   * Generates table for each element in the list
   *
   * @return A List of Lists with first 10 multiples for each corresponding element in input list.
   *
   */
  def tableList(inputList: List[Int]): List[List[Int]] =
    inputList.map(element => (0 to 10).toList.map(element * _))

  print(tableList(List(2,10,7)))
}