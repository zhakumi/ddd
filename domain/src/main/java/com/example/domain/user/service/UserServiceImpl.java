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
public class UserServiceImpl implements UserService {

    @Resource
    private UserRepository userRepository;

    @Override
    public UserDO getById(Long id) {
       return userRepository.getById(id);

    }

    @Override
    public boolean save(UserDO userDO) {
        return userRepository.save(userDO);
    }
}
