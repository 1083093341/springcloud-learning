

## springcloud-learning，一个学习springcloud的项目，会慢慢完成。

每一个mypringcloudxxx都是一个单独的项目，请拿出来单独运行。
mypringcloud2项目是在mypringcloud1上面做增加操作，mypringcloud3项目是在mypringcloud2做增加操作 ......


#### 1.mypringcloud1------用微服务搭建的最基本的项目模块，用rest方式来调用微服务

#### 2.mypringcloud2------在上一个项目基础上，用Eureka做服务注册与发现，并且用了Eureka项目来做集群操作

#### 3.mypringcloud3------在上一个项目基础上，用Ribbon负载均衡做负载均衡

#### 4.mypringcloud4------在上一个项目基础上，加上Feign ,Feign融合了Ribbon技术，所以也支持负载均衡。