package com.test.mutilMoudle_scalaMoudle

import java.lang.System._
import java.sql.{Date => SqlDate}
import java.util
import java.util.Date
import java.util.stream.Collectors

class Test_Class(private var _age:Int = 23){
  def age = _age
  def age_=(newAge: Int):Unit ={
    _age = newAge
  }
}


object sing{
  println("****************")

  def apply(name:String):String={
    name+" say hello world !!!"
  }

  def ss(): Unit ={
    println(123)
  }
}

object  ss{

  def main(args: Array[String]): Unit = {
    val clazz = new Test_Class(_age =88)
    println(clazz.age)

    println(nanoTime())

    val sqlDate = new SqlDate(new Date().getTime)
    println(sqlDate.getTime)

    println("=====================================")
    sing.ss()
    sing.ss()
    println(sing("zhangsan"))

  }
}