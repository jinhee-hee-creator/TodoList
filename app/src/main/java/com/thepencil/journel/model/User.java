package com.thepencil.journel.model;

public class User {

    private String name;
    private String id;

    public User(String id, String name){
        this.id = id;
        this.name = name;
    }

    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}

