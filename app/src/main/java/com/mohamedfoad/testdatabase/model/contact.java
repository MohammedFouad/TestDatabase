package com.mohamedfoad.testdatabase.model;

/**
 * Created by PC-SMART on 1/2/2018.
 */

public class contact {
    int id;
    String name;
    String phoneNumber;
    String group;

    public contact(int id, String name, String phoneNumber, String group) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}