package com.example.application.order.command.query;

import com.example.domain.user.entity.UserDO;
import com.example.domain.user.repository.UserRepository;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 * @Author: wangcan
 * @Date: 2021/8/4 15:16
 */
@Component
public class UserQryExe {

    @Resource
    private UserRepository userRepository;


    public UserDO getById(Long id) {
        // 直接访问基础设施层 获取数据
        return userRepository.getById(id);
    }
}
