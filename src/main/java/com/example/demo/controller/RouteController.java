package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("thymeleaf")
public class RouteController {
    @RequestMapping("hello")
    public String hello(Map<String,Object> map) {
        map.put("msg", "mmmdfdf Hddddddello Thymeleaf mdw ");
        return "hello";
    }
    @RequestMapping("test1")
    public String index(Map<String,Object> map) {
//        map.put("msg", "Hello Thymeleaf mdw ");
        return "";
    }
    @RequestMapping("starter")
    public String start(Map<String,Object> map) {
//        map.put("msg", "Hello Thymeleaf mdw ");
        return "starter";
    }
    @RequestMapping("klltj")
    public String klltj(Map<String,Object> map) {
//        map.put("msg", "Hello Thymeleaf mdw ");
        return "klltj";
    }
    @RequestMapping("nlfb")
    public String nlfb(Map<String,Object> map) {
//        map.put("msg", "Hello Thymeleaf mdw ");
        return "nlfb";
    }
    @RequestMapping("xbfb")
    public String xbfb(Map<String,Object> map) {
//        map.put("msg", "Hello Thymeleaf mdw ");
        return "xbfb";
    }
    @RequestMapping("login")
    public String login(Map<String,Object> map) {
//        map.put("msg", "Hello Thymeleaf mdw ");
        return "login";
    }
}
