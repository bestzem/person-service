package com.zems.person.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanzm
 * @since 2017/10/26
 */
@Controller
@RequestMapping(value = "/person")
public class HomeController {

    @RequestMapping(value = "/")
    public String home(){
        return "home";
    }
}
