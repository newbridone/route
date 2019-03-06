package com.ylx.route.service.impl;

import com.ylx.route.dao.UserDao;
import com.ylx.route.entity.UserDaomain;
import com.ylx.route.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "usersService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public int addUser(UserDaomain userDaomain) {
        return userDao.insert(userDaomain);
    }
}
