package com.itcast.dao;

import com.itcast.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by qd on 2018/12/26.
 */
@Repository("userDao")
public interface UserDao extends JpaRepository<User,Long> {

}
