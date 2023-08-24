package com.keepcoding.springboot.Model.versioning;

public class UserVersionV1 {

    private String name;

    public UserVersionV1(String name) {
        this.name = name;
    }

    public UserVersionV1() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
