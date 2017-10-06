package com.legomyoreos.userobjecttest.model;


public class User {

    private String userName;
    private String realName;
    private int age;
    private String gender;
    private String location;

    public User(String userName, String realName, int age, String gender, String location) {
        this.userName = userName;
        this.realName = realName;
        this.age = age;
        this.gender = gender;
        this.location = location;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
