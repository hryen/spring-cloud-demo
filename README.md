# Spring Cloud Study Project


- Service registration and discovery: Eureka
- Load balancing: Spring Cloud LoadBalancer
- Circuit Breakers: Spring Cloud Circuit Breaker Resilience4J
- Declarative web service client: Spring Cloud OpenFeign


- 服务注册和发现：Eureka
- 负载均衡：Spring Cloud LoadBalancer
- 服务熔断：Spring Cloud Circuit Breaker Resilience4J
- 服务客户端：Spring Cloud OpenFeign


验证负载均衡时，可以通过指定不同端口来启动多个 ServiceTestApplication


```
java -jar service_test-0.0.1-SNAPSHOT.jar --server.port=8801
java -jar service_test-0.0.1-SNAPSHOT.jar --server.port=8802
```
