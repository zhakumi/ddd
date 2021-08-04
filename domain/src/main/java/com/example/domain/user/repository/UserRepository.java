package com.example.domain.user.repository;

import com.example.domain.user.entity.UserDO;

/**
 * @Author: wangcan
 * @Date: 2021/7/14 14:32
 */
public interface UserRepository {

    UserDO getById(Long id);

    boolean save(UserDO userDO);

    boolean update(UserDO userDO);
}
