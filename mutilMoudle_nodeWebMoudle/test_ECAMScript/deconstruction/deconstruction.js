/**
 * 变量的解构赋值
 */


/**
 * 解构数组
 */
let [a, b, c] = [1, 2, 3];
let [foo, [[bar], baz]] = [1, [[2], 3]];
let [ , , third] = ["foo", "bar", "baz"];
let [x, , y] = [1, 2, 3];

let [head, ...tail] = [1, 2, 3, 4];
console.log(head)   // 1
console.log(tail)   //[ 2, 3, 4]


let [x1, y1, ...z1] = ['a'];
console.log(x1)     //a
console.log(y1)     //undefined
console.log(z1)     //[]

let [aa, [bb], dd] = [1, [2, 3], 4];
console.log(aa)     //1
console.log(bb)     //2
console.log(dd)     //4





/**
 * 解构集合
 */
let [xxx, yyy, zzz] = new Set(['a', 'b', 'c']);


/**
 * 解构函数返回值
 */
console.log("——————————————————函数解构——————————————————")
function* fibs() {
    let aaa = 0;
    let bbb = 1;
    while(true){
        yield aaa;
        [aaa,bbb] = [bbb,aaa+bbb]
    }
}
let [one, two, three, four] = fibs();
console.log(one)
console.log(two)
console.log(three)
console.log(four)

