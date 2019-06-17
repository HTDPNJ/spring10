package com.hfut.service.impl;

import com.hfut.pojo.Users;
import com.hfut.service.UserService;

public class UsersServiceImpl implements UserService {
    @Override
    public int insert(Users users) {
        return 0;
    }

    @Override
    public int insUsers(Users users) {
        insert(users);
        return 0;
    }
}
