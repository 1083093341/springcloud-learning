
### mypringcloud3------在myspringcloud2基础上加上客户端的Ribbon负载均衡，三个服务提供者提供相同的服务，全部注册进eureka集群中


myspringcloud-api： 公用模块

myspringcloud-provider-dept： 服务的提供者

myspringcloud-provider-dept2： 服务的提供者2

myspringcloud-provider-dept3： 服务的提供者3

myspringcloud-consumer-dept： 服务的消费者

myspringcloud-eureka-7001：eureka服务注册中心1

myspringcloud-eureka-7002：eureka服务注册中心2

myspringcloud-eureka-7003：eureka服务注册中心3


运行方式：依次启动三个eureka,再启动三个服务提供者，最后启动服务的消费者
通过消费者访问http://localhost:8080/consumer/dept/list, 
观察返回的数据来源不同说明负载均衡成功 



说明：
由于只有一台机器 我在hosts文件中添加了地址映射

127.0.0.1   eureka7001.com      
127.0.0.1   eureka7002.com      
127.0.0.1   eureka7003.com      
