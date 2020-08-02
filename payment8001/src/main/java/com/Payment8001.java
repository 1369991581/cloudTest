package com;


import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
  * @className Payment8001
  * @author 季晓亮
  * @description 
  * @date: 2020-08-01 12:12
  * @version: v1.0
  */
@SpringBootApplication
@MapperScan("com.dao")
@EnableEurekaClient
public class Payment8001 {

    public static void main(String[] args) {
        SpringApplication.run(Payment8001.class, args);
    }

}
