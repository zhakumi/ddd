package com.example.interfaces.service;


import com.example.interfaces.dto.UserDTO;
import com.example.interfaces.vo.UserVO;

/**
 * @Author: wangcan
 * @Date: 2021/7/14 11:55
 */
public interface UserService {

    /**
     * select by id
     * @param id
     * @return
     */
    UserVO getById(Long id);

    /**
     * save
     * @param userDTO
     * @return
     */
    boolean save(UserDTO userDTO);
}
