package com.keepcoding.springboot.Model.versioning;

public class UserVersionV2 {

    private NameStructure name;

    public UserVersionV2(NameStructure name){
        this.name= name;
    }

    public UserVersionV2() {
    }

    public NameStructure getName() {
        return name;
    }

    public void setName(NameStructure name) {
        this.name = name;
    }
}
