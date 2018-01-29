package com.test.mutilMoudle_scalaMoudle.match_test

import java.io.FileNotFoundException

object MatchDemo {

  def exceptionProcess(e:Exception):Unit={
     e match {
       case e1:NullPointerException => throw new RuntimeException("空指针异常")
       case e2:ArithmeticException => throw  new RuntimeException("算术异常")
       case e3:FileNotFoundException => throw new RuntimeException("文件未找到异常")
     }
  }

  /**
    * 类型匹配
    * @param e
    */
  def exceptionProcess2(e:Exception):Unit= e match {
    case e1:NullPointerException => throw new RuntimeException("空指针异常")
    case e2:ArithmeticException => throw  new RuntimeException("算术异常")
    case e3:FileNotFoundException => throw new RuntimeException("文件未找到异常")
  }

  /**
    * 值匹配
    * @param value
    * @return
    */
  def matchValue(value:Int): String= value match {
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
    case 4 => "four"
    case v => v+""
  }

  def matchTuple(x:(Int, Int)):Unit = x match {
    case (a, b) if a == b => println(s"${a} is equal ${b}")
    case (a, b) => println(s"${a} is not equal ${b}")
  }


  def main(args: Array[String]): Unit = {
//    try {
//      val res = 1 / 0
//    } catch {
//      case e:Exception => exceptionProcess2(e)
//    }

    println(matchValue(5))

    matchTuple((4,5))

  }

}
