//引入events模块
let events = require('events');
//创建EventEmitter对象
let eventEmitter = new events.EventEmitter();

//创建处理事件
let connectHandler = function connected(){
    console.log("连接成功!")
    for(let i=0;i<1000;i++){
        console.log(i)
    }
}

//绑定connection事件
eventEmitter.on('connection',connectHandler);
//触发事件
eventEmitter.emit('connection')

console.log("程序执行完毕。");


