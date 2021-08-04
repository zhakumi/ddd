package com.example.application.user.event;

import com.example.domain.user.entity.UserDO;
import com.example.domain.user.repository.UserRepository;
import com.example.domain.user.service.UserDomainService;
import com.google.common.eventbus.Subscribe;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

/**
 * @Author: wangcan
 * @Date: 2021/7/16 10:46
 */
@Component
public class UserEventListener {

//    @Resource
//    private EventBus eventBus;
    @Resource
    private UserDomainService userDomainService;
    @Resource
    private UserRepository userRepository;


//    @PostConstruct
//    public void register() {
//        eventBus.register(this);
//    }

    @Subscribe
    public void post(UserDO userDO) {
        // 假设此处跨微服务了 最终一致性
        System.out.println("用户app 收到修改金额请求请求" + userDO.getId() + userDO.getAmount());
        // 查询旧金额
        UserDO old = userRepository.getById(userDO.getId());
        userDO.setAmount(userDO.getAmount() + old.getAmount());
        // 修改新金额
        userDomainService.update(userDO);
        System.out.println("用户app 金额修改成功" + userDO.getId() + userDO.getAmount());
    }
}
