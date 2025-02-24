package com.example.backend.dto.request;

public class ChildRequest {
    private String loginID;
    private String password;
    private String name;

    public ChildRequest(String loginID, String name, String password) {
        this.loginID = loginID;
        this.name = name;
        this.password = password;
    }

    public String getLoginID() {
        return loginID;
    }

    public String getname() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
