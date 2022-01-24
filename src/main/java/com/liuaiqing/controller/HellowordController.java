package com.liuaiqing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Array;
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
        return "hello";
    }

    @RequestMapping("/helloThy")
    public String helloThymeleaf(Model model) {
        model.addAttribute("msg","hello");
        model.addAttribute("eac", Arrays.asList("111","2222"));
        return "hello";
    }
}
