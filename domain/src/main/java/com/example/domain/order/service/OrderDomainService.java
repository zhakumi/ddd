package com.example.domain.order.service;


import com.example.domain.order.entity.OrderDO;

/**
 * @Author: wangcan
 * @Date: 2021/7/14 17:20
 */
public interface OrderDomainService {

    boolean save(OrderDO orderDO);
}
