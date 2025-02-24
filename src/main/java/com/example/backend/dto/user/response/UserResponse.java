package com.example.backend.dto.user.response;

import com.example.backend.domain.User;

public class UserResponse {
    private Long id;
    private String name;
    private Integer age;

    public UserResponse( Long id,int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public UserResponse(User user){
        this.id =user.getId();
        this.name= user.getName();
        this.age = user.getAge();
    }

    public Integer getAge() {
        return age;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
