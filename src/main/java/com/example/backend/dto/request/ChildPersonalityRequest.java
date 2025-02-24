package com.example.backend.dto.request;

public class ChildPersonalityRequest {
    private String loginID;
    private String password;
    private String name;
    private String personalityName;


    public ChildPersonalityRequest(String loginID, String name, String password, String personalityName) {
        this.loginID = loginID;
        this.name = name;
        this.password = password;
        this.personalityName = personalityName;
    }

    public String getLoginID() {
        return loginID;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getPersonalityName() {
        return personalityName;
    }
}
