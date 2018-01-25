package com.test.mutilMoudle_scalaMoudle

object Test_Function {

  def max(x:Int, y:Int)= if(x>y) x else y
  val max2 = max _

  val max3 = max2

  def max4 =max _

  def main(args: Array[String]): Unit = {
    println(max(8,5))
    println(max2)
    println(max3)
    println(max3(2,3))
    println(max4(11,22))
  }
}
