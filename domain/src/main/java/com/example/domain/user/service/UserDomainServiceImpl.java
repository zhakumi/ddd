package com.example.domain.user.service;

import com.example.domain.user.entity.UserDO;
import com.example.domain.user.repository.UserRepository;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @Author: wangcan
 * @Date: 2021/7/14 14:27
 */
@Service
public class UserDomainServiceImpl implements UserDomainService {

    @Resource
    private UserRepository userRepository;

    @Override
    public boolean save(UserDO userDO) {
        // 领域层业务逻辑处理 金额默认0
        userDO.setAmount(0);
        return userRepository.save(userDO);
    }

    @Override
    public boolean update(UserDO userDO) {
        return userRepository.update(userDO);
    }
}
