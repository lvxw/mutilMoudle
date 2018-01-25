package com.test.mutilMoudle_scalaMoudle

/**
  * 匿名函数
  */
object Test_Function4 {

  def greeting(name: String,f:(String)=> Unit): Unit ={
    f(name)
  }

  val ss =(name:String)=>println(name+",早。。。。。")
  def dd = (name:String)=>println(name+",早。。。。。")

  def hh(name:String): Unit ={
    println("hah")
  }


  def main(args: Array[String]): Unit = {
//    greeting("王总",(name:String)=>println(name+",早。。。。。"))
//    greeting("小张",(name:String)=>println(name+",早呀"))
    greeting("小张",ss)
    greeting("小张",dd)
    greeting("小张",hh _)
    greeting("小张",hh)

    //开发中的写法
    greeting("lisi",x => println(x))
    greeting("lisi",println(_))
    greeting("lisi",println)
  }
}
