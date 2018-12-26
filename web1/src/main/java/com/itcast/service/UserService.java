package com.itcast.service;

import com.itcast.pojo.User;

import java.util.List;

/**
 * Created by qd on 2018/12/26.
 */
public interface UserService {
    List<User> findAll();
}
