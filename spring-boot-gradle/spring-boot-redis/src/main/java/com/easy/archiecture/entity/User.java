package com.easy.archiecture.entity;

import java.io.Serializable;

public class User implements Serializable {


    private static final long serialVersionUID = -7200372816323414372L;
    private Integer id;
    private String userName;
    private Boolean gender;

    private String testEnum;

    public User() {
    }

    public User(Integer id, String userName, Boolean gender) {
        this.id = id;
        this.userName = userName;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }
}
