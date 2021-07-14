package com.example.domain.repository;

import com.example.domain.entity.UserDO;

/**
 * @Author: wangcan
 * @Date: 2021/7/14 14:32
 */
public interface UserRepository {

    UserDO getById(Long id);

    boolean save(UserDO userDO);
}
