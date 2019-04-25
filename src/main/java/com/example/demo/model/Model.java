package com.example.demo.model;

public class Model {
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

    public Model(){}

    public Model(int id, int oid, int name){
        this.oid=oid;
        this.id=id;
        this.name=name;
    }
}
