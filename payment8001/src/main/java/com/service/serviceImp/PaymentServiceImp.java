package com.service.serviceImp;

import com.dao.PaymentMapper;
import com.entity.Payment;
import com.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
  * @className PaymentServiceImp
  * @author 季晓亮
  * @description
  * @date: 2020-08-01 13:04
  * @version: v1.0
  */
@Service
public class PaymentServiceImp implements PaymentService {
    @Autowired
    PaymentMapper paymentMapper;
    @Override
    public Integer insertPayment(Payment payment) {
        return paymentMapper.insertPayment(payment);
    }

    @Override
    public Payment getPaymentById(Integer id) {
        return paymentMapper.getPaymentById(id);
    }
}
