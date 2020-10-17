package cn.chen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello");
        Long l = System.currentTimeMillis();
        System.out.println("开始时间: " + l);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("结束时间：" + System.currentTimeMillis());

        System.out.println("hello");
        System.out.println("hello");
        return "hello";
    }


}
