package com.example.service;

import com.example.bean.User;

import java.util.HashMap;
import java.util.List;

/**
 * @Auther: THINKPAD
 * @Date:2019/1/14 9:05
 * @Description
 */
public interface UserService {

    List<User> getlist(HashMap<String, Integer> map);

    int count(HashMap<String, Integer> map);
}
