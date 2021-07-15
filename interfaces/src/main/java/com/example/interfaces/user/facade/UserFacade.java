package com.example.interfaces.user.facade;

import com.example.domain.user.service.UserService;
import com.example.domain.user.entity.UserDO;
import com.example.interfaces.user.dto.UserDTO;
import com.example.interfaces.user.vo.UserVO;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wangcan
 * @Date: 2021/7/14 11:39
 */
@RestController
public class UserFacade {

    @Resource
    private UserService userService;

    @GetMapping("/getById")
    public UserVO getById(@RequestParam Long id) {
        // do 2 vo
        UserDO userDO = userService.getById(id);
        if (userDO == null) {
            return null;
        }
        UserVO vo = new UserVO();
        vo.setId(userDO.getId());
        vo.setName(userDO.getName());
        vo.setAge(12);
        return vo;
    }

    @GetMapping("/save")
    public boolean save(@RequestParam UserDTO userDTO) {
        // dto 2 do
        UserDO userDO = new UserDO();
        userDO.setName(userDTO.getName());
        return userService.save(userDO);
    }
}
