package com.example.interfaces.order.vo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import lombok.Data;

/**
 * @Author: wangcan
 * @Date: 2021/7/14 14:07
 */
@Data
public class OrderVO {

    private Long id;
    private String code;
    private Long userId;
    private Integer amount;
}
