package com.example.demo.service.Impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.service.UserService;

@Service(version = "${demo.service.version}")
public class UserServiceImpl implements UserService {

    @Override
    public String getInfo() {
        return "UserServiceImpl";
    }
}
