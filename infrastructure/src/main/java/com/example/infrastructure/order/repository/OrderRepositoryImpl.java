package com.example.infrastructure.order.repository;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.domain.order.entity.OrderDO;
import com.example.domain.order.repository.OrderRepository;
import com.example.domain.user.entity.UserDO;
import com.example.domain.user.repository.UserRepository;
import com.example.infrastructure.order.mapper.OrderMapper;
import com.example.infrastructure.order.po.OrderPO;
import com.example.infrastructure.user.mapper.UserMapper;
import com.example.infrastructure.user.po.UserPO;
import org.springframework.stereotype.Service;

/**
 * @Author: wangcan
 * @Date: 2021/7/14 14:47
 */
@Service
public class OrderRepositoryImpl extends ServiceImpl<OrderMapper, OrderPO> implements
    OrderRepository {

    @Override
    public OrderDO getById(Long id) {
        // po 2 do
        OrderPO po = super.getById(id);
        OrderDO orderDO = new OrderDO();
        orderDO.setId(po.getId());
        orderDO.setCode(po.getCode());
        orderDO.setAmount(po.getAmount());
        orderDO.setUserId(po.getUserId());
        return orderDO;
    }

    @Override
    public boolean save(OrderDO orderDO) {
        // do 2 po
        OrderPO po = new OrderPO();
        po.setCode(orderDO.getCode());
        po.setUserId(orderDO.getUserId());
        po.setAmount(orderDO.getAmount());
        return super.save(po);
    }
}
