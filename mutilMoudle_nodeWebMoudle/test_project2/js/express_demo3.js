let express = require('express');
let app = express();

app.use(express.static('public'));

app.get('/', function (req, res) {
    res.send('Hello World');
})


app.listen(8081,function () {
    var port = this.address().port
    console.log("应用实例，访问地址为 http://localhost:%s", port)
})