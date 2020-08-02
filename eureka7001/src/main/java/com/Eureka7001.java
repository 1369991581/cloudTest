package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
  * @className Eureka
  * @author 季晓亮
  * @description
  * @date: 2020-08-01 20:30
  * @version: v1.0
  */
@SpringBootApplication
@EnableEurekaServer
public class Eureka7001 {
    public static void main(String[] args) {
        SpringApplication.run(Eureka7001.class, args);
    }
}
