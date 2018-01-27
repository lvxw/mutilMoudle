package com.test.mutilMoudle_scalaMoudle

import scala.collection.mutable.ArrayBuffer

/**
  * 数组
  */
object Test_Array {
  def main(args: Array[String]): Unit = {
    val arr = Array(1,2,3,4)
    arr(0)=5
    arr.foreach(println)
    println()

    val arr2 = new Array[Int](5)
    arr2(0)=1
    arr2.foreach(println)

    println()
    val arr3=Array(10,"hello",true,23.5)
    val one = arr3(0)
    println(one)

    println()
    val buffer = ArrayBuffer("hello")
    buffer+=("word")
    buffer+=("123")
    buffer++=Array("12","123")
    buffer.foreach(println)
    val array = buffer.toArray
    array.foreach(println(_))
    println(array.mkString("<","\t",">"))
    println(array)
  }
}
