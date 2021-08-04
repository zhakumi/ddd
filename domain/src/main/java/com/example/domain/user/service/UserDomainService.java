package com.example.domain.user.service;


import com.example.domain.user.entity.UserDO;

/**
 * @Author: wangcan
 * @Date: 2021/7/14 17:20
 */
public interface UserDomainService {

    boolean save(UserDO userDO);

    boolean update(UserDO userDO);
}
