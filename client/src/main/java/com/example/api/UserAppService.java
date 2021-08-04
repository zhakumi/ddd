package com.example.api;


import com.example.dto.UserDTO;

/**
 * @Author: wangcan
 * @Date: 2021/7/14 17:20
 *
 */
public interface UserAppService {

    UserDTO getById(Long id);

    boolean save(UserDTO userDO);
}
