package com.myr.service.impl;

import com.myr.bean.User;
import com.myr.mapper.UserMapper;
import com.myr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @BelongsProject: GoodsWarnSystem
 * @BelongsPackage: com.bruceliu.service.impl
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-05-10 17:50
 * @Description: TODO
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public User userLogin(User user) {
        return userMapper.userLogin(user);
    }
}
