package com.example.dao;

import com.example.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

/**
 * @Auther: THINKPAD
 * @Date:2019/1/14 9:06
 * @Description
 */
@Mapper
public interface UserDao {
    List<User> getlist(HashMap<String, Integer> map);

    int count(HashMap<String, Integer> map);
}
