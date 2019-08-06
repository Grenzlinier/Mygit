package online.shixun.project.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import online.shixun.project.model.UserModel;
import online.shixun.project.model.UserModel.Gender;
import online.shixun.project.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "hello")
    public String hello() {
        // 实例化用户对象
        UserModel user = new UserModel();
        user.setName("innovaee");
        user.setPassword("abcd");
        user.setEmail("tiger@innovaee.com");
        user.setGender(Gender.男);
        user.setBirthday(new Date());        
        user.setProfession("老师");
        // 保存用户信息
        userService.saveUser(user);
        return "hello";

    }

}