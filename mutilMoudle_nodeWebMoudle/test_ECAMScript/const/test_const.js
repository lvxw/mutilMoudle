/**
 * 测试ES6 constant
 */


/**
 * const声明一个只读的常量。一旦声明，常量的值就不能改变
 * @type {number}
 */
const a = 1
a = 2       //TypeError: Assignment to constant variable.
const b;    //SyntaxError: Missing initializer in const declaration