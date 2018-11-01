This demo is of microservices using spring boot

We code in 1 microservice AccountService 
and deploy them using Eureka/Zuul/Zipkin

It consists of 5 modules

Account-service -->Your Business microservice (Note the dependencies for zipkin and sleuth also note the sampler method and sleuth properties in yml file)
Discovery-service -->Registry your services are registerd with Eureka server
gateway-service -->Creates the proxy (ZUUL proxy) for your services(Note the dependencies for zipkin and sleuth also note the sampler method and sleuth properties in yml file)
zipkin-service -->https://github.com/openzipkin/zipkin download zipkin server here
run java -jar zipkinxxx.jar
invoke http://localhost:9411/zipkin

Writedown the required classes and interfaces refering to the sample project

Note the varoius annotations @SpringbootApplication @RestController etc


While running Run in the following order (port nos. and all configurations in application.yml files)
	discovery-service (runs on port 8761)
	gateway-service (runs on port 8765)
	account-service (runs on port 2222) 
	

The services should be invoked using port to which gateway-service listens (8765 in this case)
The url patterns are mentioned in application.yml of gateway-service project.

The dicovery-service can be invoked using the port to which it listens(8761 in this case)


Sample URLS :

http://localhost:8765/account/accounts
http://localhost:8765/account/accounts/222222