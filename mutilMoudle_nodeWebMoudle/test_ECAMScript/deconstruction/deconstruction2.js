/**
 * 变量的解构赋值,使用默认值
 */


let [foo = true] = [];
console.log(foo)        //true

let [x, y = 'b'] = ['a'];
console.log(x)      //a
console.log(y)      //b

let [x1, y1 = 'b'] = ['a', undefined];
console.log(x1)      //a
console.log(y1)      //b

