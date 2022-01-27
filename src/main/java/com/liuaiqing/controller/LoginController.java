package com.liuaiqing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

//    @RequestMapping({"/","/login"})
//    public String login() {
//        return "login";
//    }

    @RequestMapping({"/sign"})
    public String sign() {
        return "sign";
    }
}
