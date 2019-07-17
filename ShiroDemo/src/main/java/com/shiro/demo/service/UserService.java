package com.shiro.demo.service;

import com.shiro.demo.model.User;

public interface UserService {
    User findByUsername(String username);
}
