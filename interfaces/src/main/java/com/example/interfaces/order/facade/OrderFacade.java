package com.example.interfaces.order.facade;

import com.example.api.OrderAppService;
import com.example.dto.OrderDTO;
import com.example.interfaces.order.vo.OrderVO;
import javax.annotation.Resource;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wangcan
 * @Date: 2021/7/15 14:36
 */
@RestController
public class OrderFacade {

    @Resource
    private OrderAppService orderAppService;


    @GetMapping("/order/getById")
    public OrderVO getById(@RequestParam Long id) {
        // dto 2 vo
        OrderDTO orderDTO = orderAppService.getById(id);
        if (orderDTO == null) {
            return null;
        }
        OrderVO vo = new OrderVO();
        vo.setId(orderDTO.getId());
        vo.setCode(orderDTO.getCode());
        vo.setAmount(orderDTO.getAmount());
        vo.setUserId(orderDTO.getUserId());
        return vo;
    }

    @PostMapping("/order/save")
    public boolean save(@RequestBody @Valid OrderDTO orderDTO) {
        return orderAppService.save(orderDTO);
    }
}
