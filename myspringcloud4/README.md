
### mypringcloud4------在myspringcloud3基础上加上Feign ,Feign融合了Ribbon技术，所以也支持负载均衡。


myspringcloud-api： 公用模块

myspringcloud-provider-dept： 服务的提供者

myspringcloud-provider-dept2： 服务的提供者2

myspringcloud-provider-dept3： 服务的提供者3

myspringcloud-consumer-dept： 服务的消费者

myspringcloud-consumer-dept-feign：集成了Feign进行接口调用

myspringcloud-eureka-7001：eureka服务注册中心1

myspringcloud-eureka-7002：eureka服务注册中心2

myspringcloud-eureka-7003：eureka服务注册中心3


运行方式：依次启动三个eureka,再启动三个服务提供者，最后启动myspringcloud-consumer-dept-feign
通过消费者访问http://localhost:8080/consumer/dept/list,观察返回的数据来源不同说明负载均衡成功 
