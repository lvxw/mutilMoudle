/**
 * 测试ES6 let 和 var的区别
 */


/**
 *if代码块的外部使用外层的tmp变量，内部使用内层的tmp变量。
 * 但是，函数f执行后，输出结果为undefined，原因在于变量提升，
 * 导致内层的tmp变量覆盖了外层的tmp变量。
 * @type {Date}
 */
var tmp = new Date();
function f() {
    console.log(tmp);
    if (false) {
        var tmp = 'hello world'; // 此处发生变量提升，覆盖外层tmp
    }
}
f()  //undefined

var tmp1 = new Date();
function f() {
    console.log(tmp1);
    if (false) {
        let tmp1 = 'hello world'; // 此处let tmp1作用域在if块级代码块中,不会发生变量提升
    }
}
f()  //undefined


/**
 * 用来计数的循环变量泄露为全局变量
 * @type {string}
 */
var s = 'hello';
for (var i = 0; i < s.length; i++) {
    console.log(s[i]);
}
console.log(i); // 5


