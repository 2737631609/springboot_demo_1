package com.bdqn.accp3.springboot_demo.service;

import com.bdqn.accp3.springboot_demo.dao.UserMapper;
import com.bdqn.accp3.springboot_demo.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getUsers() {

        return userMapper.getUsers();
    }
}
