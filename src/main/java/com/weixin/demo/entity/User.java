package com.weixin.demo.entity;

public class User {
    public String name;
    public String age;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
