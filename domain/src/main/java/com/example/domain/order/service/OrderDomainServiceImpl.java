package com.example.domain.order.service;

import com.example.domain.order.entity.OrderDO;
import com.example.domain.order.repository.OrderRepository;
import com.example.domain.user.entity.UserDO;
import com.example.domain.user.repository.UserRepository;
import com.example.domain.user.service.UserDomainService;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @Author: wangcan
 * @Date: 2021/7/14 14:27
 */
@Service
public class OrderDomainServiceImpl implements OrderDomainService {

    @Resource
    private OrderRepository orderRepository;

    @Override
    public boolean save(OrderDO orderDO) {
        return orderRepository.save(orderDO);
    }
}
