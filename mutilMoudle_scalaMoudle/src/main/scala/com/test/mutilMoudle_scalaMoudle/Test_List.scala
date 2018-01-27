package com.test.mutilMoudle_scalaMoudle

import scala.collection.mutable.ListBuffer

/**
  * 数组
  */
object Test_List {
  def main(args: Array[String]): Unit = {
    val li = 1::2::3::Nil
    val li2 = 1::2::3::Nil

    val li3=li:::li2
    println(li3)

    val liBuf1 = ListBuffer[Int]()
    liBuf1++=Array(1,2,3)
    liBuf1.foreach(println(_))

    val list = liBuf1.toList
    println(list.isEmpty)

    println("*****************************")
    val li4 = List(2,9,3,4,5,1,6,3,5,10)

    val map = li4.groupBy(x => x%2)
    println(map)


    val sorted = li4.sortBy(x => x)
    println(sorted)

    val ints = li4.sortWith((a,b) => a>b)
    println(ints)

    println("*********************************")
    val li5 = List(1,2,3,4,5,6,7,8,9,10)
    val reduce = li5.reduce((x,y) => {
      println(s"${x},${y}")
      x+y
    })
    val reduce2 = li5.reduce(_+_)
    println(reduce2)

    println("*******************************")
    li5.reduceRight((x,y) =>{
      println(s"${x},${y}")
      x+y
    })


    println("*************************")
    val li6 = List(1,2,3,4,5)
    val foldRes = li6.fold(10)((x,y) =>{
      println(s"${x},${y}")
      x+y
    })
    println(foldRes)

    println("***************************")
    val foldRig = li6.foldRight(10)((x,y) =>{
      println(s"${x},${y}")
      x+y
    })
    println(foldRig)

    println("*****************************")
    val zipIndex = li6.zipWithIndex.map(x => (x._2,x._1))
    println(zipIndex)
  }
}
