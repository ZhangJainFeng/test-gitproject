package com.rpm.service.impl;

import com.rpm.pojo.User;
import com.rpm.service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public List<User> getUsers() {
        return new ArrayList<User>(){{
            add(new User("张三","asjhdg"));
            add(new User("李四","sadas"));
            add(new User("王五","werew"));
            add(new User("master","werew"));
            add(new User("hot-fix","hot-fix"));
        }};
    }

    @Override
    public void deleteUser(User user) {
       System.out.println("删除一个用户");
    }
}
