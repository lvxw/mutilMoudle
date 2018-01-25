package com.test.mutilMoudle_scalaMoudle

/**
  * 可变参数函数
  */
object Test_Function3 {

  def printCourses(courses:String*): Unit ={
    courses.foreach(x => println(x))
  }

  def main(args: Array[String]): Unit = {
    printCourses("hadoop","scala","java")
    println()
    printCourses("hadoop","scala")

    val arr = Array("111","222")
    printCourses(arr:_*)
  }
}
