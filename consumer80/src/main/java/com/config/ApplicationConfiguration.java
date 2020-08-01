package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
  * @className ApplicationConfiguration
  * @author 季晓亮
  * @description 配置类
  * @date: 2020-08-01 14:30
  * @version: v1.0
  */
@Configuration
public class ApplicationConfiguration {
    /**
     * @methodName getTemplate
     * @author 季晓亮
     * @param []
     * @return org.springframework.web.client.RestTemplate
     * @describtion 获取RestTemplate对象
     * @data 2020-08-0114:31
     */
    @Bean
    RestTemplate getTemplate(){
        return new RestTemplate();
    }
}
