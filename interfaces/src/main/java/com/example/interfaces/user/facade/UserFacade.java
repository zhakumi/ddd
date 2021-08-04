package com.example.interfaces.user.facade;

import com.example.api.UserAppService;
import com.example.dto.UserDTO;
import com.example.interfaces.user.vo.UserVO;
import javax.annotation.Resource;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wangcan
 * @Date: 2021/7/14 11:39
 */
@RestController
public class UserFacade {

    @Resource
    private UserAppService userAppService;

    @GetMapping("/user/getById")
    public UserVO getById(@RequestParam Long id) {
        // do 2 vo
        UserDTO userDTO = userAppService.getById(id);
        if (userDTO == null) {
            return null;
        }
        UserVO vo = new UserVO();
        vo.setId(userDTO.getId());
        vo.setName(userDTO.getName());
        vo.setAge(12);
        return vo;
    }

    /**
     * 用户接口层  封装DTO 校验，转成内部DO
     * @param userDTO
     * @return
     */
    @PostMapping("/user/save")
    public boolean save(@RequestBody @Valid UserDTO userDTO) {
        return userAppService.save(userDTO);
    }
}
