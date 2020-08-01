package com.service;

import com.entity.Payment;

/**
  * @className PaymentService
  * @author 季晓亮
  * @description 
  * @date: 2020-08-01 13:03
  * @version: v1.0
  */
public interface PaymentService {

    Integer insertPayment(Payment payment);

    Payment getPaymentById(Integer id);
}
