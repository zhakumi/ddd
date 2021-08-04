package com.example.domain.order.repository;

import com.example.domain.order.entity.OrderDO;
import com.example.domain.user.entity.UserDO;

/**
 * @Author: wangcan
 * @Date: 2021/7/14 14:32
 */
public interface OrderRepository {

    OrderDO getById(Long id);

    boolean save(OrderDO orderDO);
}
