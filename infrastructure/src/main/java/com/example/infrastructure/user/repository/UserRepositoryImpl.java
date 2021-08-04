package com.example.infrastructure.user.repository;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.domain.user.entity.UserDO;
import com.example.domain.user.repository.UserRepository;
import com.example.infrastructure.user.mapper.UserMapper;
import com.example.infrastructure.user.po.UserPO;
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
        userDO.setId(po.getId());
        userDO.setName(po.getName());
        userDO.setAmount(po.getAmount());
        return userDO;
    }

    @Override
    public boolean save(UserDO userDO) {
        // do 2 po
        UserPO po = new UserPO();
        po.setId(userDO.getId());
        po.setName(userDO.getName());
        po.setAmount(userDO.getAmount());
        return super.save(po);
    }

    @Override
    public boolean update(UserDO userDO) {
        UserPO po = new UserPO();
        po.setId(userDO.getId());
        po.setAmount(userDO.getAmount());
        return super.updateById(po);
    }
}
