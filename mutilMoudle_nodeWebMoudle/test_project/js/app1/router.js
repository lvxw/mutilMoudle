function route(pathname,response){
    console.log('pathname:' + pathname)
    response.writeHead(200,{'content-Type':'text/plain'});
    response.end("Request for " + pathname + " received.");
}

exports.route=route;