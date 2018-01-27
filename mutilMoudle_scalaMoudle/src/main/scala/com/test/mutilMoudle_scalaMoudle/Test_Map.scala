package com.test.mutilMoudle_scalaMoudle

/**
  * 数组
  */
object Test_Map {
  def main(args: Array[String]): Unit = {
    val map = Map((1,2),3 -> 4 )
    println(map)

    println(map(1))
    println(map.get(3))

    for((key,value) <- map){
      println(s"${key} <- ${value}")
    }
  }
}
