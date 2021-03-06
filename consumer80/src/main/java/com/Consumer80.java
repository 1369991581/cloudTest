package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
  * @className Consumer80
  * @author 季晓亮
  * @description
  * @date: 2020-08-01 14:20
  * @version: v1.0
  */
@SpringBootApplication
@EnableEurekaClient
public class Consumer80 {
    public static void main(String[] args) {
        SpringApplication.run(Consumer80.class, args);
    }
}
