package com.zems.person.service.impl;

import com.zems.person.dao.entity.User;
import com.zems.person.dao.mapper.UserMapper;
import com.zems.person.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yanzm
 * @since 2017/10/29
 */
@Service("UserService")
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper mapper;

    @Override
    public int insert(User user){
        return mapper.insertSelective(user);
    }

}
