/**
 * 测试ES6 let 和 var的区别
 */


/**
 * var命令会发生”变量提升“现象，
 * 即变量可以在声明之前使用，值为undefined
 */
console.log(foo); // 输出undefined
var foo = 2;


/**
 * let 命令不存在变量提升，任何地方必须先声明在使用
 */
console.log(bar); // 报错ReferenceError
let bar = 2;
