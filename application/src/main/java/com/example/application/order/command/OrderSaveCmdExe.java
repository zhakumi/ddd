package com.example.application.order.command;

import com.example.domain.order.entity.OrderDO;
import com.example.domain.order.service.OrderDomainService;
import com.example.dto.OrderDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 * @Author: wangcan
 * @Date: 2021/8/4 15:27
 */
@Component
public class OrderSaveCmdExe {

    @Resource
    private OrderDomainService orderDomainService;

    public boolean save(OrderDTO orderDTO) {
        // dto 2 do
        OrderDO orderDO = new OrderDO();
        orderDO.setCode(orderDTO.getCode());
        orderDO.setAmount(orderDTO.getAmount());
        orderDO.setUserId(orderDTO.getUserId());
        return orderDomainService.save(orderDO);
    }
}
