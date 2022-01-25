package com.liuaiqing.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * lan jie qi
 */
public class MyHandlerInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        // 获取请求拦截判断条件
        Object logincheck = request.getSession().getAttribute("logincheck");
        // 逻辑判断
        if (logincheck != null && StringUtils.isEmpty(logincheck.toString())) {
            return false;
        } else {
//            return true;
        }
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
}
