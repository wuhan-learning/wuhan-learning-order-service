package com.otr.wuhan.learning.orderservice.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

public class RequestInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Enumeration<String> headerNames = request.getHeaderNames();
        StringBuilder sb = new StringBuilder("===>");
        while(headerNames.hasMoreElements()){
            String name = headerNames.nextElement();
            sb.append(String.format("[%s : %s]\n", name, request.getHeader(name)));
        }
        System.out.println(sb.toString());
        return true;
    }
}
