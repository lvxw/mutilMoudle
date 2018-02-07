/**
 * 测试ES6 constant
 */

/**
 * const实际上保证的，并不是变量的值不得改动，
 * 而是变量指向的那个内存地址不得改动
 * @type {{}}
 */
const foo = {};
foo.prop = 123;
foo.prop =456
foo.other = "hello"
// foo={}  //TypeError: Assignment to constant variable.


/**
 * Object.freeze方法,将对象冻结，修改对象值无效
 * @type {Object}
 */
const foo2 = Object.freeze({});
foo2.prop = 123;
console.log(foo2)


console.log(new Function('return this')())