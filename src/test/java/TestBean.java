
import com.myr.App;
import com.myr.bean.User;
import com.myr.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @BelongsProject: GoodsWarnSystem
 * @BelongsPackage: com.bruceliu.test
 * @Author: bruceliu
 * @QQ:1241488705
 * @CreateTime: 2020-05-12 22:41
 * @Description: TODO
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class TestBean {

    @Resource
    UserService userService;

    @Test
    public void testuser(){
        User u = new User();
        u.setName("悟空");
        u.setPassword("123");
        User user = userService.userLogin(u);
        System.out.println(user);
    }
}
