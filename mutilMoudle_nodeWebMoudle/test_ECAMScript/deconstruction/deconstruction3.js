/**
 * 变量的解构赋值,使用默认值
 */


/**
 * 对象的解构赋值
 */
let {two,one} = {one:1,two:2}
console.log(one)
console.log(two)

let obj = { first: 'hello', last: 'world' };
let { first: f, last: l } = obj;
console.log(f)
console.log(l)


let obj2 = {
    p: [
        'haha',
        { y: 'haihai' }
    ]
};
let {p:[a,{y:b}]} = obj2
console.log(a)
console.log(b)

const node = {
    loc: {
        start: {
            line: 1,
            column: 5
        }
    }
};
let {loc:{start:{line,column}}} = node
console.log(line)
console.log(column)

let obj3 = {};
let arr = [];
({ foo: obj3.prop, bar: arr[0] } = { foo: 123, bar: true });    //{}不可以在一行的开头
console.log(obj3)
console.log(arr)
