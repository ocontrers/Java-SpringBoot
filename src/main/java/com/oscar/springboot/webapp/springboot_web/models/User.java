package com.oscar.springboot.webapp.springboot_web.models;

public class User {
    
    

    public User(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }
    
    private String name;
    private String lastname;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    

}
