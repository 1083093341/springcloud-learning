
### 5.mypringcloud4------在上一个项目基础上，加上Hystrix断路器 ,来实现负的的熔断，降级，和服务的监控（hystrixDashboar）


myspringcloud-api： 公用模块

myspringcloud-provider-dept： 服务的提供者

myspringcloud-provider-dept2： 服务的提供者2

myspringcloud-provider-dept3： 服务的提供者3

myspringcloud-consumer-dept： 服务的消费者

myspringcloud-consumer-dept-feign：集成了Feign进行调用接口

myspringcloud-eureka-7001：eureka服务注册中心1

myspringcloud-eureka-7002：eureka服务注册中心2

myspringcloud-eureka-7003：eureka服务注册中心3

myspringcloud-provider-dept-hystrix: 集成的hystrix的服务提供者

myspringcloud-consumer-hystrix-dashboard: 服务监控hystrixDashboard


服务的熔断： 
启动3个eureka, 再启动myspringcloud-provider-dept-hystrix，再启动myspringcloud-consumer-dept
最后访问http://localhost:8080/consumer/dept/get/112   . http://localhost:8080/consumer/dept/get/1 测试

服务的降级： 
启动3个eureka, 再启动myspringcloud-provider-dept, 启动myspringcloud-consumer-dept-feign
正常测试http://localhost:8080/consumer/dept/get/1
故意关闭myspringcloud-provider-dept
再访问http://localhost:8080/consumer/dept/get/1


服务的监控：  
先启动myspringcloud-consumer-hystrix-dashboard，再启动启动3个eureka，再启动myspringcloud-provider-dept-hystrix
访问http://localhost:9001/hystrix, 在界面上输入http://localhost:8001/hystrix.stream进行查看服务的状态

