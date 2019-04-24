package com.example.controller;

import com.example.bean.User;
import com.example.service.UserService;
import com.example.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: THINKPAD
 * @Date:2019/1/14 9:05
 * @Description
 */
@Controller
public class UserController {
    @Autowired
    private UserService service;
    @RequestMapping("list")
    public String getlist(Model model, @RequestParam(name = "cpage",defaultValue = "1")int cpage){
        int pageSize = 3;
        int index = (cpage-1)*pageSize;
        HashMap<String, Integer> map = new HashMap<>();
        map.put("pageSize", pageSize);
        map.put("index", index);
        List<User> list = service.getlist(map);
        int count = service.count(map);
        Map<String, Object> page = PageUtil.page("list", cpage, pageSize, count, "");
        model.addAttribute("list", list);
        model.addAttribute("page", page);
        return "list";
    }
}
