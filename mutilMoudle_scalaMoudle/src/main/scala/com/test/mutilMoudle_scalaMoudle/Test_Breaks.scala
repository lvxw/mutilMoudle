package com.test.mutilMoudle_scalaMoudle

import scala.util.control.Breaks

object Test_Breaks {
  def main(args: Array[String]): Unit = {
    val nulList=List(1,2,3,4,5,6,7,8,9)

    val loop = new Breaks()
    loop.breakable(
      for(item <- nulList){
        if(5 == item){
          loop.break()
        }
        println(s"value is ${item}")
      }
    )
  }
}
