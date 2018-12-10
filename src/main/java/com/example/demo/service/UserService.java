package com.example.demo.service;

import com.example.demo.model.User;


public interface UserService {
    User findByusername(String username);

    void updatePwd(String username,String oldpwd,String newpwd);

}
