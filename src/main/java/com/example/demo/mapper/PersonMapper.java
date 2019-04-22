package com.example.demo.mapper;

import com.example.demo.Person.Person;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PersonMapper {
    public List<Person> seleteAll();
    public Person seleteperson(Integer id);
    public List<Person> seletepername(Integer name);
    public void saveUser(Person person);
    public void modify(Person person);
    public void modifyall(Person person);
    public void dele(Integer id);
}
