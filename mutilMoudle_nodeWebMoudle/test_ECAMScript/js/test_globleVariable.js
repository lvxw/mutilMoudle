console.log(__filename);
console.log(__dirname);


setTimeout(function(){
    console.log('test setTimeout')
},2000);

// setInterval(function(){
//     console.log('test setInterval')
// },1000);

process.on('exit',function () {
    console.log("test process.on('exit')")
})

process.stdout.write('test process.stdout.write'+"\n")

//读取参数
console.log('参数的个数为：'+process.argv.length)
console.log('参数是：'+process.argv[2])

console.log('平台系统：'+process.platform)
console.log('CPU架构：'+process.arch)

console.log('当前路径：'+process.cwd())



