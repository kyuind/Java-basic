package com.example.backend.dto.request;

import com.example.backend.domain.Personality;

public class PersonalityRequest {
    private Long id;
    private String personalityName;

    public PersonalityRequest(Long id, String personalityName) {
        this.id = id;
        this.personalityName = personalityName;
    }

    public Long getId() {
        return id;
    }

    public String getPersonalityName() {
        return personalityName;
    }

    public static PersonalityRequest fromEntity(Personality personality){
        return new PersonalityRequest(personality.getId(), personality.getPersonalityName());
    }
}
