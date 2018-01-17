let http = require('http');
let url = require('url');
let router = require('./router');
function start(route) {
    function onRequest(request,response) {
        let pathname = url.parse(request.url).pathname;
        route(pathname,response)
    }

    http.createServer(onRequest).listen(80)
    console.log('server has started....')
}

exports.start=start;