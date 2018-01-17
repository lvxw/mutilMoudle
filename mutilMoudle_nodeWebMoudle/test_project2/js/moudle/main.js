// var hello = require('./hello');
// hello.say();

let Hello = require('./hello2');

let hello = new Hello();

hello.setName('zhangsan');

hello.sayHello();