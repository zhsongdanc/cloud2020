package com.wxh.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @Author: demussong
 * @Description:
 * @Date: 2022/11/9 12:08
 */
@RestController
public class TestController {

    @GetMapping("/s")
    public String test(String wd){
        return wd;
    }
}
