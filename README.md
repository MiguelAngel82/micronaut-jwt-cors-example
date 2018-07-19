# Micronaut JWT and CORS example
To execute the example:
```sh
$ ./gradle run
```
Once the app is running, if you try the /login endpoint, it seems to work as expected:
```sh
$ curl -X POST \
  http://localhost:8080/login \
  -H 'content-type: application/json' \
  -d '{
	"username": "123",
	"password": "123"
}'
```
And if this endpoint is executed from a front app, it works too.

But when the endpoint /user is executed from a front application, this error is shown:
```
Response to preflight request doesn't pass access control check: No 'Access-Control-Allow-Origin' header is present on the requested resource. Origin 'http://localhost:4200' is therefore not allowed access. The response had HTTP status code 401.
```
Even with CORS enabled as config option:
```
micronaut:
    server:
        cors:
            enabled: false
```
