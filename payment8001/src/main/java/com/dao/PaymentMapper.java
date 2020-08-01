package com.dao;

import com.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
  * @className PaymentMapper
  * @author 季晓亮
  * @description
  * @date: 2020-08-01 12:33
  * @version: v1.0
  */
@Mapper
public interface PaymentMapper {

    Integer insertPayment(Payment payment);

    Payment getPaymentById(Integer id);

}
