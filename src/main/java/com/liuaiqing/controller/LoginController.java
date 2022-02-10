package com.liuaiqing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

//    @RequestMapping({"/","/login"})
//    public String login() {
//        return "login";
//    }

    /**
     * 登录页面
     * @return
     */
    @RequestMapping({"/sign"})
    public String sign() {
        System.out.println("sign");
        return "sign";
    }

    /**
     * 登录进入系统管理页面
     * 验证用户密码内容
     * @return
     */
    @RequestMapping({"/index"})
    public String index() {
        System.out.println("index");

        return "index";
    }
}
