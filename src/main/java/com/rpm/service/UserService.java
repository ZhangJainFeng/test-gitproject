package com.rpm.service;

import com.rpm.pojo.User;

import java.util.List;

/**
 * 用户服务接口
 */
public interface UserService {

    List<User> getUsers();
    void deleteUser(User user);

}
