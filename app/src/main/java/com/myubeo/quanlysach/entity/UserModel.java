package com.myubeo.quanlysach.entity;

public class UserModel {
    int userID;
    String userName;
    String password;
    String name;
    String dateOfBirthday;
    int type;
    String className;
    String email;

    public UserModel() {
    }

    public UserModel(int userID, String userName, String password, String name, String dateOfBirthday, int type, String className, String email) {
        this.userID = userID;
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.dateOfBirthday = dateOfBirthday;
        this.type = type;
        this.className = className;
        this.email = email;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
