package cn.chen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello");
        return "hello";
    }

    @RequestMapping("/hello2")
    public String hello2(){
        System.out.println("hello2");
        return "hello2";
    }

}
