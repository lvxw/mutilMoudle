
var express = require('express');
var bodyParser = require('body-parser');
var app = express();

var urlencodedParser = bodyParser.urlencoded({ extended: false })
app.use(express.static('public'));

app.get('/index.html', function (req, res) {
    console.log(__dirname)
    res.sendFile( __dirname + "/" + "index.html" );
})

app.post('/process_post', urlencodedParser, function (req, res) {

    var response = {
        "first_name2":req.body.first_name2,
        "last_name2":req.body.last_name2
    };
    console.log(response);
    res.end(JSON.stringify(response));
})


var server = app.listen(8081, function () {

    var port = server.address().port

    console.log("应用实例，访问地址为 http://localhost:%s", port)

})
