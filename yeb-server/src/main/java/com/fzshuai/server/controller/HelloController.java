package com.fzshuai.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 软件二班傅同学
 * @description 测试
 * @date 2021-02-23 13:41
 */
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/employee/basic/hello")
    public String hello2() {
        return "/employee/basic/hello";
    }

    @GetMapping("/employee/advanced/hello")
    public String hello3() {
        return "/employee/advanced/hello";
    }
}
