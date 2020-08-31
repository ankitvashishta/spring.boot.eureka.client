# spring.boot.eureka.client

`Microservices Service Discovery Pattern` consists of two essential parts : a discovery server & one or more discovery client(s).<br>
The discovery server : a `Eureka Server` is to be found at https://github.com/ankitvashishta/spring.boot.eureka.server

This microservice is discovery aware and gets registered with the discovery server with the help of `Eureka Client`

### Eureka Client
Eureka Client is any microservice enabled to be registered with the `Eureka Server`

For the @SpringBootApplication to be discovery-aware, we include `spring-cloud-starter-netflix-eureka-client` into our classpath.

Then we can annotate the application with either `@EnableDiscoveryClient` or `@EnableEurekaClient`.<br>
This annotation is optional if we have the `spring-cloud-starter-netflix-eureka-client` dependency on the classpath.
