package com.example.interfaces.facade;

import com.example.interfaces.dto.UserDTO;
import com.example.interfaces.service.UserService;
import com.example.interfaces.vo.UserVO;
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
        return userService.getById(id);
    }

    @GetMapping("/save")
    public boolean save(@RequestParam UserDTO userDTO) {
        return userService.save(userDTO);
    }
}
