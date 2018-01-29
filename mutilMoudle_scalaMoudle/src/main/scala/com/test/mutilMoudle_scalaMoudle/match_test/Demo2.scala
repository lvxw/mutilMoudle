package com.test.mutilMoudle_scalaMoudle.match_test

sealed abstract class Expr
case class Var(name: String) extends Expr
case class Number(num: Double) extends Expr
case class UnOp(operator: String, arg: Expr) extends Expr
case class BinOp(operator: String,left: Expr, right: Expr) extends Expr

object Demo2 {

  def describe(e: Expr): String = e match {
     case Number(_) => "a number"
     case Var(_) => "a variable"
   }
  
  def main(args: Array[String]): Unit = {
    println(describe(new Var("zhangsan")))
  }
}
