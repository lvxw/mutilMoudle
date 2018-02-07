/**
 * 测试ES6 let 和 var的区别
 */


/**
 * 此处var i 为全局变量；
 * 所有数组a的成员里面的i，指向的都是同一个i
 * @type {Array}
 */
let a = [];
for (var i = 0; i < 10; i++) {
    a[i] = function () {
        console.log(i);
    };
}
a[6]();


/**
 * 此处let j 为局部变量；
 * 当前的j只在本轮循环有效，每一次循环的i其实都是一个新的变量
 * @type {Array}
 */
let b = [];
for (let j = 0; j < 10; j++) {
    b[j] = function () {
        console.log(j);
    };
}
b[6]();


/**
 * for循环还有一个特别之处，设置循环变量的那部分是一个父作用域，
 * 而循环体内部是一个单独的子作用域。
 */
for (let i = 0; i < 3; i++) {
    let i = 'abc';
    console.log(i);
}