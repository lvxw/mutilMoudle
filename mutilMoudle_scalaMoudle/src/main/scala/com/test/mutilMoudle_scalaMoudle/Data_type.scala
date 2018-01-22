package com.test.mutilMoudle_scalaMoudle

/**
  * scala 有14种类数据类型：
  *   Byte          8位有符号补码整数。数值区间为 -128 到 127
  *   Char          16位无符号Unicode字符, 区间值为 U+0000 到 U+FFFF
  *   Boolean       true或false
  *   Short         16位有符号补码整数。数值区间为 -32768 到 32767
  *   Int           32位有符号补码整数。数值区间为 -2147483648 到 2147483647
  *   Long          64位有符号补码整数。数值区间为 -9223372036854775808 到 9223372036854775807
  *   Float         32位IEEE754单精度浮点数
  *   Double        64位IEEE754单精度浮点数
  *   String        字符序列
  *   Unit          表示无值，和其他语言中void等同。用作不返回任何结果的方法的结果类型。Unit只有一个实例值，写成()。
  *   Null          null 或空引用
  *   Nothing       Nothing类型在Scala的类层级的最低端；它是任何其他类型的子类型。
  *   Any           Any是所有其他类的超类
  *   AnyRef        AnyRef类是Scala里所有引用类(reference class)的基类
  *
  */
object Data_type {
  def main(args: Array[String]): Unit = {
    val str = """hello world
hello world
hello world
      """
    print(str)
  }
}
