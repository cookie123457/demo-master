package com.example.demo.mapper;

import com.example.demo.Person.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PersonMapper {

    public int countAll(@Param("id") int id);

}
