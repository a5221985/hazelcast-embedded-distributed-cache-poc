# Running the POC #
## Windows ##
1. Open `cmd`
2. Run following command:
```
.\mvnw spring-boot:run
```
3. Open another `cmd`
4. Run the following command in the second `cmd`:
```
$env:SERVER_PORT = 8081; .\mvnw spring-boot:run
``` 
5. Run the following `curl` command to test that response is cached and returned quickly for the second call:
```
curl http://localhost:8080/books/123
```
6. Run the following `curl` command to test that caching works across multiple instances
```
curl http://localhost:8081/books/123
```