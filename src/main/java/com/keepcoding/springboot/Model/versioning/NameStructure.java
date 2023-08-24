package com.keepcoding.springboot.Model.versioning;

public class NameStructure {

    private String name;
    private String surename;

    public NameStructure(String name, String surename) {
        this.name = name;
        this.surename = surename;
    }

    public NameStructure() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }
}
