import com.itcast.Application;
import com.itcast.pojo.User;
import com.itcast.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 整合junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)//指定引导类
public class SpringBootJunitTest {
    @Autowired
    UserService userService;
    @Test
    public void testFindAall() {
        List<User> all = userService.findAll();
        for (User user : all) {
            System.out.println(user);
        }
    }
}
