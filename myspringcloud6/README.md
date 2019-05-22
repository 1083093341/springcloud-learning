
### 6.mypringcloud6------在上一个项目基础上，加上zuul路由网关


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

myspringcloud-zuul-gateway:zuul路由网关

运行：
启动3个eureka, 再启动myspringcloud-provider-dept，再启动myspringcloud-consumer-dept



两种方式访问：



可以在配置文件中配置忽略这种访问方式
不用路由：http://localhost:8001/dept/get/2


启动路由： http://myzuul.com:9500/dept-service/dept/get/2

myzuul.com 127.0.0.1 HOSTS路径映射。




