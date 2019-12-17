package com.bdqn.accp3.springboot_demo.controller;

import com.bdqn.accp3.springboot_demo.pojo.User;
import com.bdqn.accp3.springboot_demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class LoginController {

    @Resource
    private UserService userService;

    @RequestMapping("login.html")
    @ResponseBody
    public List<User> hello(String uname)throws Exception{
        System.out.println(uname);
        return userService.getUsers();
    }

    @RequestMapping("list.html")
    public String list(Model model)throws Exception{
        model.addAttribute("list",userService.getUsers());
        model.addAttribute("str","abc");
        return "list";
    }
}
