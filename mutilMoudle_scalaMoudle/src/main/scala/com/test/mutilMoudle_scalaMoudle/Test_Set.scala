package com.test.mutilMoudle_scalaMoudle

import scala.collection.mutable
/**
  * 数组
  */
object Test_Set {
  def main(args: Array[String]): Unit = {
    var set = Set(1,2,3,4,1,2,1,2,5,-6)
    println(set)

    println("*********************")
    set+=111
    println("***"+set)


    val maxRes = set.maxBy(Math.abs(_))
    println(maxRes)

    println("***********************************")
    val set2 = mutable.Set[Int]()
    set2+=1
    set2++=List(1,2,3)
    println(set2)
  }
}
