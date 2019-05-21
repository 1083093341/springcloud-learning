
#### mypringcloud2------用Eureka做服务注册与发现，并且用了Eureka项目来做集群操作


myspringcloud-api： 公用模块

myspringcloud-provider-dept： 服务的提供者

myspringcloud-consumer-dept： 服务的消费者

myspringcloud-eureka-7001：eureka服务注册中心1

myspringcloud-eureka-7002：eureka服务注册中心2

myspringcloud-eureka-7003：eureka服务注册中心3


运行方式：依次启动三个eureka, 再启动服务的提供者向三个注册中心注册自己。 

分别访问 http://eureka7002.com:7002/eureka/ 

http://eureka7003.com:7003/eureka/

http://eureka7001.com:7001/eureka/

查看是否注册成功


说明：
由于只有一台机器 我在hosts文件中添加了地址映射
127.0.0.1   eureka7001.com      
127.0.0.1   eureka7002.com      
127.0.0.1   eureka7003.com      
