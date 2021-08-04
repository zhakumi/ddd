package com.example.application.order.command;

import com.example.domain.user.entity.UserDO;
import com.example.domain.user.service.UserDomainService;
import com.example.dto.UserDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 * @Author: wangcan
 * @Date: 2021/8/4 15:27
 */
@Component
public class UserSaveCmdExe {


    @Resource
    private UserDomainService userDomainService;

    public boolean save(UserDTO userDTO) {
        UserDO userDO = new UserDO();
        userDO.setId(userDTO.getId());
        userDO.setName(userDTO.getName());
        userDO.setAmount(0);
        return userDomainService.save(userDO);
    }
}
