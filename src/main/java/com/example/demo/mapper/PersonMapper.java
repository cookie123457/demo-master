package com.example.demo.mapper;

import com.example.demo.Person.Person;
import com.example.demo.model.Model;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PersonMapper {

    public int countAll(int id);
    public List selectAll();
    public int insert(Model model);//类型约束
}
