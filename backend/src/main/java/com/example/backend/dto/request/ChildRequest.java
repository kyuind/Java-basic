package com.example.backend.dto.request;

import com.example.backend.domain.Child;

public class ChildRequest {
    private Long id;
    private String loginID;
    private String password;
    private String name;

    public ChildRequest(Long id, String loginID, String password, String name) {
        this.id = id;
        this.loginID = loginID;
        this.password = password;
        this.name = name;
    }

    public String getLoginID() {
        return loginID;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public static ChildRequest fromEntity(Child child){
        return new ChildRequest(child.getId(), child.getLoginID(), child.getPassword(), child.getName());
    }
}
