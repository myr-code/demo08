package com.myr.Controller;

import com.myr.bean.User;
import com.myr.service.UserService;
import com.myr.utils.MessageResults;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @BelongsProject: GoodsWarnSystem
 * @BelongsPackage: com.bruceliu.controller
 * @CreateTime: 2020-06-10 23:32
 * @Description: TODO
 */
@Controller
@Scope("prototype")
public class TestController {
    @Resource
    UserService userService;


    @RequestMapping("/user_login")
    @ResponseBody
    public MessageResults user_login(User user,HttpSession session){
        System.out.println(user);
        User u = userService.userLogin(user);
        MessageResults msg = null;
        if(u!=null){
            //用户的登录信息
            session.setAttribute("userLogin",u);
            msg = new MessageResults(200,"登录成功",u);
        }else {
            msg = new MessageResults(500,"登录失败",u);
        }
        return msg;
    }

}
