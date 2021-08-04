package com.example.infrastructure.user.po;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Author: wangcan
 * @Date: 2021/7/14 14:40
 */
@Data
@TableName("test_user")
public class UserPO {
    private Long id;
    private String name;
    private Integer amount;
}
