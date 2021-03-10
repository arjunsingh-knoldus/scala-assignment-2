package com.knoldus

import org.scalatest.refspec.RefSpec

class StackTest extends RefSpec {

  object `A Stack` {
    object `when empty` {
      val myTestStack = Stack()
      def `should have length 0` {
        assert(myTestStack.length == 0 && myTestStack.isEmpty)
      }

      def `should produce Exception when accessing the top` {
        assertThrows[Exception] {
          myTestStack.top
        }
        assertThrows[Exception] {
          myTestStack.pop()
        }
      }
    }
    object `when having elements` {
      val myTestStack = Stack(1,2)
      def `should return the length`: Unit = {
        assert(myTestStack.length == 2)
      }
      def `should return last element when accessing the top`: Unit = {
        assert(myTestStack.top == 2)
      }
      object `when popped` {
        val myTestStack = Stack(1,2)
        val poppedOutput = myTestStack.pop()
        def `should return last element when popped`: Unit = {
          assert( poppedOutput == 2)
        }
        def `should remove the element from stack and decrease the size`: Unit = {
          assert(myTestStack.length == 1)
        }
      }
      object `when pushed` {
        val myTestStack = Stack(1,2)
        myTestStack.push(3)
        def `should increase the stack size`: Unit ={
          assert(myTestStack.length == 3)
        }
        def `should update the top most element`: Unit = {
          assert(myTestStack.top == 3)
        }
      }

    }
  }
}