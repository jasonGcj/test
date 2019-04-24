package com.example.service;

import com.example.bean.User;
import com.example.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @Auther: THINKPAD
 * @Date:2019/1/14 9:06
 * @Description
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao dao;

    @Override
    public List<User> getlist(HashMap<String, Integer> map) {
        return dao.getlist(map);
    }

    @Override
    public int count(HashMap<String, Integer> map) {
        return dao.count(map);
    }
}
