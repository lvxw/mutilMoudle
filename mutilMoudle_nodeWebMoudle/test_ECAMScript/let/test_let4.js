/**
 * 测试ES6 let 和 var的区别
 */


var tmp = 123
if(true){
    tmp = "hello"
}

/**
 * 在代码块内，使用let命令声明变量之前，该变量都是不可用的。
 * 这在语法上，称为“暂时性死区”
 * @type {number}
 */
var tmp2 = 123
if(true){
    //此处tmp2绑定在块级作用域类，必须先声明，在使用
    tmp2 = "hello" //ReferenceError: tmp2 is not defined
    let tmp2
}


