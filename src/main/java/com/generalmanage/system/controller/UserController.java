package com.generalmanage.system.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/user")
public class UserController {


    @PostMapping("/getUser")
    public Object getUser(@RequestBody String request){
        JSONObject jsonObject = JSON.parseObject(request);
        String ss="123";
        String substring = ss.substring(0, Integer.parseInt(jsonObject.getString("temp")));
        return substring;
    }

}
