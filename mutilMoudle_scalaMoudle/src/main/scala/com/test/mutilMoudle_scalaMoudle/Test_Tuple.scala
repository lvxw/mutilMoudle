package com.test.mutilMoudle_scalaMoudle

import scala.collection.mutable.ListBuffer

/**
  * 数组
  */
object Test_Tuple {
  def main(args: Array[String]): Unit = {
    val arr = Array(1,2.2,3,"helo")
    println(arr(3).asInstanceOf[String])

    println()
    val t1 = (1,23.5,"spark")
    println(t1._3)

    println()
    val t2 = (1,2)
    val swapRes = t2.swap
    println(swapRes)
  }
}
