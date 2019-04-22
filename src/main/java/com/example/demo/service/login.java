package com.example.demo.service;

import java.net.URLDecoder;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

public class login {
    @RestController
    public class MyController {
        @RequestMapping("/login")
        public String hello(){
            return "hello，this is a jwt api!";
        }
    }
}
