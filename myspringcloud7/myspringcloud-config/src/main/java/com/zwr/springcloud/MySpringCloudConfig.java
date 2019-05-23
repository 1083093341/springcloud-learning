package com.zwr.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MySpringCloudConfig {

    public static void main(String[] args)
    {
        SpringApplication.run(MySpringCloudConfig.class, args);
    }
}
