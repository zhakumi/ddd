package com.example.application.order.command.query;

import com.example.domain.order.entity.OrderDO;
import com.example.domain.order.repository.OrderRepository;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 * @Author: wangcan
 * @Date: 2021/8/4 15:16
 */
@Component
public class OrderQryExe {

    @Resource
    private OrderRepository orderRepository;


    public OrderDO getById(Long id) {
        // 直接访问基础设施层 获取数据
        return orderRepository.getById(id);
    }
}
