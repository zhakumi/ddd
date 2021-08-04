package com.example.application.order.service;

import com.example.api.OrderAppService;
import com.example.application.order.command.OrderSaveCmdExe;
import com.example.application.order.command.query.OrderQryExe;
import com.example.application.user.event.UserEventListener;
import com.example.domain.order.entity.OrderDO;
import com.example.domain.user.entity.UserDO;
import com.example.dto.OrderDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @Author: wangcan
 * @Date: 2021/7/14 14:27 查询走exe 保存走domain服务
 */
@Service
public class OrderAppServiceImpl implements OrderAppService {

    @Resource
    private OrderQryExe orderQryExe;
    @Resource
    private OrderSaveCmdExe orderSaveCmdExe;

    @Resource
    private UserEventListener userEventListener;

    @Override
    public OrderDTO getById(Long id) {
        OrderDO orderDO = orderQryExe.getById(id);
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setId(orderDO.getId());
        orderDTO.setCode(orderDO.getCode());
        orderDTO.setUserId(orderDO.getUserId());
        orderDTO.setAmount(orderDO.getAmount());
        return orderDTO;
    }

    @Override
    public boolean save(OrderDTO orderDO) {
        // 访问领域层保存数据
        orderSaveCmdExe.save(orderDO);
        // 订单保存成功后 通过eventbus 访问 用户微服务 或者用户领域 修改用户上的消费总金额 最终一致性原则
        UserDO event = new UserDO();
        event.setId(orderDO.getUserId());
        event.setAmount(orderDO.getAmount());
        userEventListener.post(event);
        return true;
    }
}
