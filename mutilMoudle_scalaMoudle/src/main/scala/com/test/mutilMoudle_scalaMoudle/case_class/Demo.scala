package com.test.mutilMoudle_scalaMoudle.case_class

object Demo {
  def main(args: Array[String]): Unit = {
    val person = Person("zhangsan", 23)

    person match {
      case Person(name, age) => println(name,age)
    }
  }
}
