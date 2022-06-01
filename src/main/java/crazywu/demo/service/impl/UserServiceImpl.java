package crazywu.demo.service.impl;

import org.springframework.stereotype.Service;

import crazywu.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{

    @Override
    public String say() {
        return "nihao";
    }
    
}