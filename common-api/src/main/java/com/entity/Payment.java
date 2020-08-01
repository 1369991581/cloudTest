package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
  * @className Payment
  * @author 季晓亮
  * @description 订单类
  * @date: 2020-08-01 12:21
  * @version: v1.0
  */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Payment {
    /**
     * 用户序号
     */
    Integer id;

    /**
     * 订单流水
     */
    String serial;
}
