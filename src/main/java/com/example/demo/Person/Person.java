package com.example.demo.Person;

public class Person {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    private int id;
    private int oid;
    private int name;

    public Person(){}

    public Person(int id,int oid,int name){
        this.oid=oid;
        this.id=id;
        this.name=name;
    }
    public Person(int id,int name){
        this.id=id;
        this.name=name;
    }
}
