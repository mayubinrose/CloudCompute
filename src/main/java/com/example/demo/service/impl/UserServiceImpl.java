package com.example.demo.service.impl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper usermapper;

    @Override
    public User findByusername(String username) {

        return usermapper.findByUsername(username);
    }

    @Override
    public void updatePwd(String username, String oldpwd, String newpwd) {

    }
}
