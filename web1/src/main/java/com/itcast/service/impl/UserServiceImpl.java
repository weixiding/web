package com.itcast.service.impl;

import com.itcast.dao.UserDao;
import com.itcast.pojo.User;
import com.itcast.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by qd on 2018/12/26.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource(name="userDao")
    private UserDao userDao;

    @Override
   // @Cacheable("findAll")
    //使用缓存并存入redis中
    //value属性：表示存入redis数据库中的key
    //key属性：用于指定方法执行返回值的key，该属性是spring使用不写使用默认值
    public List<User> findAll() {
        return userDao.findAll();
    }
}
