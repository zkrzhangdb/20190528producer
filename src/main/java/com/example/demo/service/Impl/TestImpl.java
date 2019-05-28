package com.example.demo.service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.demo.service.TestService;

@Service(version = "${demo.service.version}")
public class TestImpl implements TestService  {
    @Override
    public String say(String name) {
        return name +",你好！";
    }
}