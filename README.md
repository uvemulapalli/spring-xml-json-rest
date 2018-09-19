# README #

This is project explains the perfect way of handling the following scenario.

* Read/ process ONLY XML input
* Ability to respond with both XML and JSON types.

### What is this repository for? ###

* This project is written with Spring 3.x configuration.
* Version 1.0

### How do I test this ? ###

* Install/ configure postman for submitting REST requests.
* Since the artifact type is WAR, you can easily deploy this to tomcat after buildiong it via maven.
* In postman, under Headers section - set the 'Content-Type' as 'application/xml'.
* Following sample requests are provided to you under the assumption that your tomcat runs on the port 8080.
* To get a JSON response, please use this URI to submit a request - http://localhost:8080/basic-spring-rest/electronic-tune/1.json
* To get a XML response, please use this URI to submit a request - http://localhost:8080/basic-spring-rest/electronic-tune/1.xml