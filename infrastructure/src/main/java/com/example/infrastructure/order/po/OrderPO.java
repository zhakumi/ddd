package com.example.infrastructure.order.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author: wangcan
 * @Date: 2021/7/14 14:07
 */
@Data
@TableName("test_order")
public class OrderPO {

    private Long id;
    private String code;
    private Long userId;
    private Integer amount;
}
