package com.example.domain.order.entity;

import lombok.Data;

/**
 * @Author: wangcan
 * @Date: 2021/7/14 14:11
 */
@Data
public class OrderDO {

    private Long id;
    private String code;
    private Integer amount;
    private Long userId;
}
