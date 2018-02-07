/**
 * 变量的解构赋值,使用默认值
 */

/**
 * 对象解构赋值
 */


/**
 *函数方法和属性解构
 */
let { log, sin, cos,PI } = Math;
console.log(cos(PI/3))


/**
 * 数组对象解构
 * @type {[number,number,number,number,number,number,number,number,number,number]}
 */
let arr = [1, 2, 3,4,5,6,7,8,9,10];
let {0 : first, [arr.length - 1] : last} = arr;
console.log(first)
console.log(last)
