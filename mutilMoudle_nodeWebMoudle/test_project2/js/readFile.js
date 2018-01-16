let fs = require('fs')

/**
 * 同步读取文件
 */
function syncRead(){
    let data = fs.readFileSync('../files/a');
    console.log(data.toString());
}

/**
 * 异步读取文件
 */
function asyncRead() {
    fs.readFile('../files/a',function(err,data){
        if(err){
            console.log(err);
        }else{
            console.log(data.toString());
        }
    });
    console.log("程序执行结束!");
}


syncRead()
asyncRead()




