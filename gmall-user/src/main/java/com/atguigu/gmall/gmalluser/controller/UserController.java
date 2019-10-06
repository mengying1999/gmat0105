package com.atguigu.gmall.gmalluser.controller;

import com.atguigu.gmall.gmalluser.bean.UmsMember;
import com.atguigu.gmall.gmalluser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class UserController {

    @Autowired
    UserService userService;
    @RequestMapping("index")
    @ResponseBody
    public String index()
    {
        return "Hello user";
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser()//将所有的ums_member表里面的所有数据操作出来
    {
        List<UmsMember> umsMembers = userService.getAllUser();//控制器通常调用service层查数据
        System.out.println(umsMembers);
        return umsMembers;
    }
}
