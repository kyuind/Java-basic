package com.example.backend.dto.request;

import java.util.List;

public class ChildModifyRequestDTO {

    private String name;
    private String loginID;
    private String password;
    private String profileImage;
    private Integer phoneNumber;
    private String information;
    private String school;
    private String comment;
    private List<String> personalityNames;

    public ChildModifyRequestDTO(){}

    public ChildModifyRequestDTO(String comment,
                                 String information,
                                 String loginID,
                                 String name,
                                 String password,
                                 List<String> personalityName,
                                 Integer phoneNumber,
                                 String profileImage,
                                 String school) {
        this.comment = comment;
        this.information = information;
        this.loginID = loginID;
        this.name = name;
        this.password = password;
        this.personalityNames = personalityNames;
        this.phoneNumber = phoneNumber;
        this.profileImage = profileImage;
        this.school = school;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPersonalityNames(List<String> personalityNames) {
        this.personalityNames = personalityNames;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getComment() {
        return comment;
    }

    public String getInformation() {
        return information;
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

    public List<String> getPersonalityNames() {
        return personalityNames;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public String getSchool() {
        return school;
    }
}