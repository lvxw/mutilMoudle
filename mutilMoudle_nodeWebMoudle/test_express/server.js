var express = require('express');
var favicon = require('serve-favicon');
var app = new express();
var foo = require('./routes/foo.js');
app.set('port',3000);

app.use(foo.xxx);
app.use(foo.yyy);

app.use(function (req, res, next) { console.log('Time:',
    Date.now()); next();});

app.use(function (req, res,next) {
    console.log(req.url);
    if('/aaa'===req.url){
        res.send('hello aaa')
    }
    next()
});

app.use('/bbb',function (req, res) {
    console.log(req.url);
    res.send('hello bbb')
});

app.get('/',function (req,res) {
    res.send('this is root')
})

app.get('/about',function (req,res) {
    res.send('this is aboult');
})

app.use(favicon(__dirname + '/favicon.ico'));

app.use(function (req,res,next) {
    res.status(404)
    res.send('404 - Not Found')
})



app.listen(app.get('port'),function () {
    console.log(process.env.PORT)
    console.log('visit: http://localhost:3000')
})