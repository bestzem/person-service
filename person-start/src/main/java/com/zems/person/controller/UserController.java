package com.zems.person.controller;

import com.google.gson.Gson;

import com.zems.person.dao.entity.User;
import com.zems.person.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author yanzm
 * @since 2017/10/29
 */
@Controller
@RequestMapping(value = "/person/user")
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping(value = "/signIn")
    public String signIn(){
        return "";
    }

    @RequestMapping(value = "/signOut")
    public String signOut(){
        return "";
    }

    @RequestMapping(value = "/registered/{name}/{password}",method = RequestMethod.POST)
    public String registered(@PathVariable String name,@PathVariable String password){
        User user=new User();
        user.setName(name);
        user.setPassword(password);
        service.insert(user);
        Gson gson=new Gson();
        return gson.toJson(user);
    }
}
