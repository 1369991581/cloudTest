package com.controller;

import com.entity.CommonResult;
import com.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
  * @className ConsumerController
  * @author 季晓亮
  * @description 
  * @date: 2020-08-01 14:27
  * @version: v1.0
  */
@RestController
@RequestMapping()
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;
    /**
     * 这里应该写入配置文件
     */
    final String URL = "http://localhost:8001";

    /**
     * @methodName insertPayment
     * @author 季晓亮
     * @param [payment]
     * @return com.entity.CommonResult
     * @describtion
     * @data 2020-08-0115:29
     */
    @RequestMapping("/consumer/insert")
    public CommonResult insertPayment(@RequestBody Payment payment){
        return  restTemplate.postForObject(URL+"/insert", payment, CommonResult.class);
    }

    /**
     * @methodName getPayment
     * @author 季晓亮
     * @param [id]
     * @return com.entity.CommonResult
     * @describtion
     * @data 2020-08-0115:28
     */
    @RequestMapping("/consumer/get/{id}")
    public CommonResult getPayment(@PathVariable Integer id){
        return restTemplate.getForObject(URL+"/get/"+id,CommonResult.class);
    }
}
