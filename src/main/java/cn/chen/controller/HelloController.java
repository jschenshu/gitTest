package cn.chen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
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

    @RequestMapping("/hello3")
    public String hello3(){
        System.out.println("hello3");
        return "hello3";
    }

    @RequestMapping("/hello4")
    public String hello4(){
        System.out.println("hello4");
        return "hello4";
    }

}
