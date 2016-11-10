package com.ctsi.cloud.service.consumer.services.model;

/**
 * Created by doulala on 2016/11/1.
 */
public class User {

    String id;
    String name;

    //在Feign interface中，默认构造函数是必须的
    public User() {
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
