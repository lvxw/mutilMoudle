/**
 * 测试ES6 let 和 var的区别
 */


function fun1(){
    var a = 10
    var a = 10
}
fun1()


/**
 *let不允许在相同作用域内，重复声明同一个变量。
 */
function fun2(){
    let b = 10
    var b = 10
}
fun2()

