/**
 * 测试ES6 constant
 */

/**
 * const的作用域和let一样
 */
if (true) {
    console.log(MAX);   //ReferenceError: MAX is not defined
    const MAX = 5;
}
