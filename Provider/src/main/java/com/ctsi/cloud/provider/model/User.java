package com.ctsi.cloud.provider.model;

/**
 * Created by doulala on 2016/11/1.
 */
public class User {

    String id;
    String name;


    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
