package com.zems.person.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanzm
 * @since 2017/10/26
 */
@RestController
public class HomeController {

    @RequestMapping(value = "/")
    public String home(){
        return "Hello World.";
    }
}
