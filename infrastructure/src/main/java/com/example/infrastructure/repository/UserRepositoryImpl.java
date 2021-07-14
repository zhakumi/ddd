package com.example.infrastructure.repository;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.domain.entity.UserDO;
import com.example.domain.repository.UserRepository;
import com.example.infrastructure.mapper.UserMapper;
import com.example.infrastructure.po.UserPO;
import org.springframework.stereotype.Service;

/**
 * @Author: wangcan
 * @Date: 2021/7/14 14:47
 */
@Service
public class UserRepositoryImpl extends ServiceImpl<UserMapper, UserPO> implements UserRepository {

    @Override
    public UserDO getById(Long id) {
        // po 2 do
        UserPO po = super.getById(id);
        UserDO userDO = new UserDO();
        userDO.setId(0L);
        userDO.setName("2");
        return userDO;
    }

    @Override
    public boolean save(UserDO userDO) {
        // do 2 po
        UserPO po = new UserPO();
        po.setId(0L);
        po.setName("2");
        super.save(po);
        return true;
    }
}
