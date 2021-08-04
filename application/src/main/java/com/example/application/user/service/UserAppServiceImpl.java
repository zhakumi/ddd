package com.example.application.user.service;

import com.example.api.UserAppService;
import com.example.application.order.command.UserSaveCmdExe;
import com.example.application.order.command.query.UserQryExe;
import com.example.domain.user.entity.UserDO;
import com.example.dto.UserDTO;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @Author: wangcan
 * @Date: 2021/7/14 14:27
 */
@Service
public class UserAppServiceImpl implements UserAppService {


    @Resource
    private UserQryExe userQryExe;
    @Resource
    private UserSaveCmdExe userSaveCmdExe;

    @Override
    public UserDTO getById(Long id) {
        UserDO userDO = userQryExe.getById(id);
        UserDTO dto = new UserDTO();
        dto.setId(userDO.getId());
        dto.setName(userDO.getName());
        return dto;
    }

    @Override
    public boolean save(UserDTO userDTO) {
        return userSaveCmdExe.save(userDTO);
    }
}
