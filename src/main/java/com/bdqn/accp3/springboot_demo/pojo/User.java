package com.bdqn.accp3.springboot_demo.pojo;

public class User {
    private int id;
    private String userName;
    private String password;
    private int github_test;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getGithub_test() {
        return github_test;
    }

    public void setGithub_test(int github_test) {
        this.github_test = github_test;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
