package com.ylx.route.action;

import com.ylx.route.entity.UserDaomain;
import com.ylx.route.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService usersService;

    @ResponseBody
    @RequestMapping("/add")
    public int addUser(UserDaomain userDaomain) {
        return usersService.addUser(userDaomain);
    }
    @ResponseBody
    @RequestMapping("hello")
    public String hello() {
        return "hello";
    }
}
