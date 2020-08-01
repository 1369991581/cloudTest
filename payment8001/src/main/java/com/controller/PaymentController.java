package com.controller;

import com.entity.CommonResult;
import com.entity.Payment;
import com.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
  * @className PaymentController
  * @author 季晓亮
  * @description
  * @date: 2020-08-01 13:01
  * @version: v1.0
  */
@RestController
@RequestMapping()
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @RequestMapping("/insert")
    public CommonResult insertPayment(@RequestBody Payment payment){
        int result = paymentService.insertPayment(payment);
        if(result > 0){
            return new CommonResult(200, "success", result);
        }
        return new CommonResult(444, "fail", null);

    }

    @RequestMapping("/get/{id}")
    public CommonResult getPayment(@PathVariable Integer id){
        Payment result = paymentService.getPaymentById(id);
        if(result != null){
            return new CommonResult(200, "success", result);
        }
        return new CommonResult(444, "fail", null);
    }

    /**
     *  @RequestMapping("/get")
     *   public CommonResult getPayment(@RequestBody Integer id){
     *      Payment result = paymentService.getPaymentById(id);
     *      return new CommonResult(200, "success", result);
     *   }
     */
}
