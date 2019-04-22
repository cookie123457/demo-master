package com.example.demo.controller;


import com.example.demo.Person.Person;
import com.example.demo.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController

@RequestMapping(value="/count")
public class PersonController {

    @Autowired
    private PersonMapper personMapper;

    @GetMapping
    public int getParams(@RequestParam("id") int id) {
        return id;
    }


    @RequestMapping(value = "all")
    public int responseNew(@RequestParam("id") int id){
        int para=getParams(id);
        int answer=personMapper.countAll(para);
        return answer;
    }


}






