package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class ListOpnTest extends AnyFlatSpec {

  "Last element for List(1,2,3,4,5,6)" should "be 6" in {
    assert(ListOperationsDemo.getLast(List(1, 2, 3, 4, 5, 6))._2 == 6)
  }
  "Last element index for List(1,2,3,4,5,6)" should "be 5" in {
    assert(ListOperationsDemo.getLast(List(1, 2, 3, 4, 5, 6))._1 == 5)
  }

  "Accessing last element of empty list" should " throw Exception" in {
    assertThrows[Exception] {
      ListOperationsDemo.getLast(List())
    }
  }

  "tableList " should "return table of all elements in List(2,10,7)" in {
    val expectedOutput = List(List(0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20), List(0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100), List(0, 7, 14, 21, 28, 35, 42, 49, 56, 63, 70))
    assert(ListOperationsDemo.tableList(List(2, 10, 7)) == expectedOutput)
  }


}
