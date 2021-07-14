package com.example.application.service;

import com.example.interfaces.dto.UserDTO;
import com.example.interfaces.vo.UserVO;

/**
 * @Author: wangcan
 * @Date: 2021/7/14 17:20
 */
public interface AppUserService {

    UserVO getById(Long id);

    boolean save(UserDTO userDTO);
}
