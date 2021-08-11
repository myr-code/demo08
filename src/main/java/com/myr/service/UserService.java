package com.myr.service;


import com.myr.bean.User;

/**
 * @BelongsProject: GoodsWarnSystem
 * @BelongsPackage: com.bruceliu.service
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-05-10 17:49
 * @Description: TODO
 */
public interface UserService {

    /**
     * 01-登录方法
     * @param user 传入参数  封装了账号和密码
     * @return 返回的时候登录成功之后的用户对象
     */
    public User userLogin(User user);

}
