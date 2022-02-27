## Assignment Week #1
* [Design Flow and RESTful API List](https://github.com/NaiRoBin/assignment-java-boot-camp/wiki/Assignment-Week-%231)



## Run Command
* ./mvnw clean
* ./mvnw test
* ./mvnw clean package

* use java 11
* java -jar target/crshop-0.0.1-SNAPSHOT.jar


## Test on Browser
| Method | Url                            | Description                | Url Test                                     |Request Body|
|:-------|:-------------------------------|:---------------------------|:---------------------------------------------|:------------ |
| Get    | /api/user/{name}               | Find User By Name          | http://localhost:8080/api/user/pom           |-|
| Get    | /api/product                   | Find All Product           | http://localhost:8080/api/product/           |-|
| Get    | /api/product/{name}            | Find Product By Name       | http://localhost:8080/api/product/product001 |-|
| Get    | /api/basket/{userid}           | Find basket from userid    | http://localhost:8080/api/basket/4           |-|
| Post   | /api/basket/add                | Add Product to basket      | http://localhost:8080/api/basket/add         |{"userId":4,"productId":6,<br/>"productName":null,"amount":1,<br/>"price":150.0,"sumprice":null}|

