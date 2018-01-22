package com.test.mutilMoudle_scalaMoudle

object Test_Function {

  /**
    * 普通函数
    * @param x
    * @param y
    * @return
    */
  def test(x:Int, y:Int): Int ={
    x+y
  }

  /**
    * 匿名函数
    * @return
    */
  def test2 = (x:Int, y:Int) => x + y


  /**
    * 高阶函数——参数为函数
    * @param f
    * @return
    */
  def test3(f:(Any)=>String):String = {
    f(4)
  }


  def sum(f:Int=>Int):(Int,Int)=>Int={
    def sumF(a:Int,b:Int):Int=
      if(a>b) 0
      else f(a)+sumF(a+1,b)
    sumF
  }

}
