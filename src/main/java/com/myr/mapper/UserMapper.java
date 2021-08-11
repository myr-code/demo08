package com.myr.mapper;

import com.myr.bean.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @BelongsProject: GoodsWarnSystem
 * @BelongsPackage: com.bruceliu.mapper
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-05-10 17:32
 * @Description: TODO
 */
@Mapper
public interface UserMapper {

    /**
     * 01-登录方法
     * @param user 传入参数  封装了账号和密码
     * @return 返回的时候登录成功之后的用户对象
     */
    public User userLogin(User user);
}
