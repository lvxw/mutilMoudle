package com.test.mutilMoudle_scalaMoudle.class_object

object Demo {
  def main(args: Array[String]): Unit = {
    val p1 = Person("zhangsan", 23)
    val p2 = Person("lisi", 24, 88.9)
    val p3 = Person("wangwu", 25, 99.2, "one")

    println(p1)
    println(p2)
    println(p3)
  }
}
