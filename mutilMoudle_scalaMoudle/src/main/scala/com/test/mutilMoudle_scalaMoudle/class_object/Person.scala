package com.test.mutilMoudle_scalaMoudle.class_object

/**
  * Person类
  * @param name
  * @param age
  */
//主构造方法
class Person(val name:String, var age:Int) {
  var score:Double = _
  var grade:String = _

  //辅助构造方法，辅助构造方法，首先要调用主构造方法或者其他构造方法
  def this(name:String ,age:Int, score:Double){
    this(name, age)
    this.score = score
  }

  def this(name:String, age:Int, score:Double, grade:String){
    this(name, age, score)
    this.grade = grade
  }

  override def toString = s"Person($score, $grade, $name, $age)"
}

/**
  * Person类的伴生对象
  */
object Person{

  def apply(name:String, age:Int): Person ={
    new Person(name, age)
  }

  def apply(name:String, age:Int, score:Double): Person ={
    new Person(name, age,score)
  }

  def apply(name:String, age:Int, score:Double, grade:String): Person ={
    new Person(name, age, score, grade)
  }

}
