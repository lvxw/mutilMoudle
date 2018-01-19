module.exports={
    xxx:function(req,res,next) {
        if (req.url === "/xxx") {
            res.send('xxx')
        } else {
            next();
        }
    },
    yyy:function(req,res,next) {
        if (req.url === "/yyy") {
            res.send('yyy')
        } else {
            next();
        }
    }
};