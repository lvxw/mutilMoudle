let mysql = require('mysql');
let connection = mysql.createConnection({
    host:'192.168.15.99',
    user:'root',
    password:'hadoop',
    database:'sagacious'
});

connection.connect()

connection.query('select * from stat_oc_duplication_deliver',function (err, results, fields) {
    console.log(results[0])
    connection.destroy()
})



