let express = require('express');
let app = express();

app.get('/',function (req,res) {
    res.send('Hello world')
});

app.get('/a',function (req,res) {
    res.send('Hello a')
});

app.listen(8080,function () {
    var port = this.address().port
    console.log("应用实例，访问地址为 http://localhost:%s", port)
})