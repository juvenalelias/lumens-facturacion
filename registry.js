var requestify     = require("requestify");

const API_GATEWAY = "172.24.101.92:30506";	
const apiGatewayUrl = "http://" + API_GATEWAY + "/apps";
console.log("Registering lumens-facturacion" + apiGatewayUrl);
requestify.request(apiGatewayUrl, {
    method: "POST",
    body: {
        "appName": "lumens-facturacion",
        "hostName": "172.24.101.91",
        "port": 32382,
        "service": "/lumens-facturacion-service",
        "method": "GET"
    },
    headers: {
        'Content-Type': 'application/json'
    }
}).then(function (response) {
    console.log("Service registered successfully to " + apiGatewayUrl);
}).fail(function (response) {
    console.log("Fail register to " + apiGatewayUrl + " " + response);
});
