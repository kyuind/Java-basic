package com.example.backend.dto.response;

public class ChildToPersonalityDTOResponse {
    private Long id;
    private String personalityName;

    public ChildToPersonalityDTOResponse(Long id, String personalityName) {
        this.id = id;
        this.personalityName = personalityName;
    }

    public String getPersonalityName() {
        return personalityName;
    }

    public Long getId() {
        return id;
    }
}
