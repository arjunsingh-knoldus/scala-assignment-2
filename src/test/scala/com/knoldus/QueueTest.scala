package com.knoldus

import org.scalatest.refspec.RefSpec

class QueueTest extends RefSpec {

  object `A Queue` {
    object `when empty` {
      val myTestQueue= Queue()
      def `should have length 0` {
        assert(myTestQueue.length == 0 && myTestQueue.isEmpty)
      }

      object `should produce Exception when accessing the` {
        def `front` {
          assertThrows[Exception] {
            myTestQueue.front
          }
        }
        def `back` {
          assertThrows[Exception] {
            myTestQueue.back
          }
        }
        def `dequeue (popping front)` {
          assertThrows[Exception] {
            myTestQueue.popFront()
          }
        }
      }
    }
    object `when having elements` {
      val myTestQueue = Queue(1,2)
      def `should return the length`: Unit = {
        assert(myTestQueue.length == 2)
      }
      def `should return first element when accessing the front`: Unit = {
        assert(myTestQueue.front == 1)
      }
      def `should return last element when accessing the back`: Unit = {
        assert(myTestQueue.back == 2)
      }
      object `when dequeuing ` {
        val myTestQueue = Queue(1,2)
        val dequeOutput = myTestQueue.dequeue()
        def `should return first element when dequeuing`: Unit = {
          assert(dequeOutput == 1)
        }
        def `should remove the element from queue and decrease the size`: Unit = {
          assert(myTestQueue.length == 1)
        }
      }
      object `when enqueuing` {
        val myTestQueue = Queue(1,2)
        myTestQueue.enqueue(3)
        def `should increase the queue size`: Unit ={
          assert(myTestQueue.length == 3)
        }
        def `should update the last element`: Unit = {
          assert(myTestQueue.back == 3)
        }
        def `keep first element unchanged`: Unit = {
          assert(myTestQueue.front == 1)
        }
      }
    }

  }
}