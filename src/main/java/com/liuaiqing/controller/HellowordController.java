package com.liuaiqing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Controller
public class HellowordController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }

    @RequestMapping("/helloMap")
    @ResponseBody
    public Map<String, Object> helloMap() {
        Map<String, Object> helloMap = new HashMap<>();
        helloMap.put("status", "Yes");
        helloMap.put("message", "ok");
        return helloMap;
    }

    @RequestMapping("/helloV")
    public String helloV() {
        System.out.println("helloV");
        return "login/hello";
    }

    @RequestMapping("/helloThy")
    public String helloThymeleaf(Model model) {
        model.addAttribute("msg","hello");
        model.addAttribute("eac", Arrays.asList("111","2222"));
        return "login/hello";
    }

    @RequestMapping("/helloT")
    @ResponseBody
    public String helloT(Model model) {
        model.addAttribute("stat", "true");
        model.addAttribute("msg", "helloT");
        model.addAttribute("result", Arrays.asList("11", "22", "333"));
        return "helloT";
    }
}
