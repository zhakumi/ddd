package com.example.api;


import com.example.dto.OrderDTO;

/**
 * @Author: wangcan
 * @Date: 2021/7/14 17:20
 *
 */
public interface OrderAppService {

    OrderDTO getById(Long id);

    boolean save(OrderDTO orderDO);
}
