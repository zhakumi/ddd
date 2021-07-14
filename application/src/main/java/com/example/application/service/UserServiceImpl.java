package com.example.application.service;

import com.example.interfaces.dto.UserDTO;
import com.example.interfaces.service.UserService;
import com.example.interfaces.vo.UserVO;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @Author: wangcan
 * @Date: 2021/7/14 17:15
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private AppUserService appUserService;

    @Override
    public UserVO getById(Long id) {
        return appUserService.getById(id);
    }

    @Override
    public boolean save(UserDTO userDTO) {
        return appUserService.save(userDTO);
    }
}
