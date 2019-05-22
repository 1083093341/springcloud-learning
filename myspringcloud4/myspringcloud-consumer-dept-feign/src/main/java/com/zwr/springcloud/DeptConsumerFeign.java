package com.zwr.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 微服务的消费者
 */

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.zwr.springcloud"})
public class DeptConsumerFeign {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeign.class, args);
    }
}
