package com.tian.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
该控制类是为了查找jsp或者带参数访问jsp或者跳转
 */
@Controller
@RequestMapping("pages")
public class PageController {
    @RequestMapping("/reg")
    public String reg(){
        System.out.println("请求进入hello");
        return "reg";
    }

    @RequestMapping("/regForm")
    public String regForm(){
        return "regForm";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/loginForm")
    public String loginForm(){
        return "loginForm";
    }

    @RequestMapping("/ajaxCommit")
    public String ajaxCommit(){
        return "ajaxCommit";
    }

    @RequestMapping("/NongChang")
    public String NongChang(){
        return "NongChang";
    }

    @RequestMapping("/home")
    public String home(){
        return "home";
    }
}
