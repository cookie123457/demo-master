package com.example.demo.service;

import com.example.demo.Person.Person;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Service
public interface PersonService {
    public List<Person> selete();
    public Person ServicefindById(Integer id);
    public List<Person> ServicefindByName(Integer name);
    public void deletePerson(Integer id);
    public int save(Person person);
    public void update(Person person);
    public void updateall(Person person);
}
