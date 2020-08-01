package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
  * @className CommonResult
  * @author 季晓亮
  * @description JSON封装类
  * @date: 2020-08-01 12:25
  * @version: v1.0
  */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CommonResult<T> {

    /**
     * 返回数字码
     */
    private Integer code;

    /**
     * 返回信息
     */
    private String massage;

    /**
     * 实体数据
     */
    private T data;

    /**
     * @methodName ComminResult
     * @author 季晓亮
     * @param Integer code, String massage
     * @return void
     * @describtion 部分参数的构造函数，全参和无参已自动生成
     * @data 2020-08-01 12:29
     */
    public CommonResult(Integer code, String massage){
        this(code, massage, null);
    }

}
