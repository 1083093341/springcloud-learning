
### 7.mypringcloud7------添加springcloudConfig


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

myspringcloud-config: configServer端，与GitHub打交道

myspringcloud-config-client: 通过myspringcloud-config获取配置文件

运行1：

在GitHub新建一个myspirngcloud-config仓库(https://github.com/1083093341/myspirngcloud-config)
上传application.yml, 启动myspringcloud-config

使用不同的URL来测试环境切换
http://127.0.0.1:3000/application-dev.yml

http://127.0.0.1:3000/application-test.yml
 
 
运行2：

启动启动myspringcloud-config和myspringcloud-config-client
1.修改myspirngcloud-config中的myspringcloud-config-client.yml文件
2.重启服务器来访问 http://localhost:$(port)/config 来测试配置是否修改成功



