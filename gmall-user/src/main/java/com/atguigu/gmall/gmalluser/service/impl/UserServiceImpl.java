package com.atguigu.gmall.gmalluser.service.impl;

import com.atguigu.gmall.gmalluser.bean.UmsMember;
import com.atguigu.gmall.gmalluser.mapper.UserMapper;
import com.atguigu.gmall.gmalluser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser() {//在业务层用get,在DAO层用select
//        List<UmsMember> umsMemberList =   userMapper.selectAllUser();
        List<UmsMember> umsMemberList = null;
        return umsMemberList;
    }
}
