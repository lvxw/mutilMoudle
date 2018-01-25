package com.test.mutilMoudle_scalaMoudle

/**
  * 默认参数函数
  */
object Test_Function2 {

  def sayHello(name:String,msg:String="Hi,..."): Unit ={
    println(s"${name} ${msg}")
  }

  def main(args: Array[String]): Unit = {
    sayHello("zhangsan")
    sayHello("lisi","Good morning...")
    sayHello(msg = "goog afternoon...",name = "wangwu")
  }
}
