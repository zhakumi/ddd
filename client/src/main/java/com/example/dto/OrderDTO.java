package com.example.dto;

import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * @Author: wangcan
 * @Date: 2021/7/14 14:07
 */
@Data
public class OrderDTO {

    @NotNull
    private Long id;
    @NotNull
    private String code;
    @NotNull
    private Long userId;
    @NotNull
    private Integer amount;
}
