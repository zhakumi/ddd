package com.example.domain.service;

import com.example.application.service.AppUserService;
import com.example.domain.entity.UserDO;
import com.example.domain.repository.UserRepository;
import com.example.interfaces.dto.UserDTO;
import com.example.interfaces.vo.UserVO;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @Author: wangcan
 * @Date: 2021/7/14 14:27
 */
@Service
public class UserServiceDomain implements AppUserService {

    @Resource
    private UserRepository userRepository;

    @Override
    public UserVO getById(Long id) {
        UserDO userDO = userRepository.getById(id);
        if (userDO == null) {
            return null;
        }
        // do 2 vo
        UserVO vo = new UserVO();
        vo.setId(userDO.getId());
        vo.setName(userDO.getName());
        vo.setAge(0);
        return vo;
    }

    @Override
    public boolean save(UserDTO userDTO) {
        // dto 转do
        UserDO userDO = new UserDO();
        userDO.setId(userDO.getId());
        userDO.setName(userDO.getName());
        return userRepository.save(userDO);
    }
}
