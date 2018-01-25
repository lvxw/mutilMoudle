package com.test.mutilMoudle_scalaMoudle

object Test_for {
  def main(args: Array[String]): Unit = {

    println("for 循环第一种方式")
    for(i <- 1 to 9){
      for(j <- 1 to i){
        print(j+"*"+i+" = "+i*j+"\t")
      }
      println()
    }

    println("for 循环第二种方式")
    for(i <- 1 to 9;j <- 1 to i){
      print(j+"*"+i+" = "+i*j+"\t")
      if(j==1){
        println()
      }
    }

    println()
    println("for 循环第三种方式")
    for{
      i <- 1 to 9
      j <- 1 to i
    }{
      print(j+"*"+i+" = "+i*j+"\t")
      if(j==1){
        println()
      }
    }

    println("遍历加判断")
    val arr = List("hadoop","","spark","storm")
    for{
      x <- arr
      if x.trim.length>0
    }{
      print(x+" ")
    }

    println("yield 测试")
    val li = List(1,2,3,4,5,6,7)

    val li_new = for{
      x <- li
      if x%2==0
    }yield{
      x*x
    }
    println(li_new)


  }
}
