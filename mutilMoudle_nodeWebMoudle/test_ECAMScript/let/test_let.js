/**
 * 测试ES6 let 和 var的区别
 */


/**
 * ES5 有全局作用域、和函数作用域
 * ES6 有全局作用域、和函数作用域、块级作用域
 *
 * let 声明的变量只在所在的代码块类有效
 */
{
    var a = "a"
    let b = "b"
}
console.log(a)
console.log(b)  //ReferenceError: b is not defined
