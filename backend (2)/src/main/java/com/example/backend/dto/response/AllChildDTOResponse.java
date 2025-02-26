package com.example.backend.dto.response;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AllChildDTOResponse {
    private Long id;
    private LocalDate birth;
    private String name;
    private String profileImage;
    private String information;
    private Boolean gender;
    private String status;
    private String school;
    private List<Integer> feelScores;


    private Integer feelScore00;
    private Integer feelScore01;
    private Integer feelScore02;
    private Integer feelScore03;
    private Integer feelScore05;
    private Integer feelScore06;
    private Integer feelScore07;
    private Integer feelScore04;
    private Integer feelScore08;
    private Integer feelScore09;
    private Integer feelScore10;
    private Integer feelScore11;
    private Integer feelScore12;
    private Integer feelScore13;
    private Integer feelScore14;
    private Integer feelScore15;
    private Integer feelScore16;
    private Integer feelScore17;
    private Integer feelScore18;
    private Integer feelScore19;
    private Integer feelScore20;
    private Integer feelScore21;
    private Integer feelScore22;
    private Integer feelScore23;

    public AllChildDTOResponse(Long id, LocalDate birth, String name, String profileImage, String information, Boolean gender, String status, String school, Integer feelScore00, Integer feelScore01, Integer feelScore02, Integer feelScore03, Integer feelScore05, Integer feelScore06, Integer feelScore07, Integer feelScore04, Integer feelScore08, Integer feelScore09, Integer feelScore10, Integer feelScore11, Integer feelScore12, Integer feelScore13, Integer feelScore14, Integer feelScore15, Integer feelScore16, Integer feelScore17, Integer feelScore18, Integer feelScore19, Integer feelScore20, Integer feelScore21, Integer feelScore22, Integer feelScore23) {
        this.id = id;
        this.birth = birth;
        this.name = name;
        this.profileImage = profileImage;
        this.information = information;
        this.gender = gender;
        this.status = status;
        this.school = school;
        this.feelScore00 = feelScore00;
        this.feelScore01 = feelScore01;
        this.feelScore02 = feelScore02;
        this.feelScore03 = feelScore03;
        this.feelScore05 = feelScore05;
        this.feelScore06 = feelScore06;
        this.feelScore07 = feelScore07;
        this.feelScore04 = feelScore04;
        this.feelScore08 = feelScore08;
        this.feelScore09 = feelScore09;
        this.feelScore10 = feelScore10;
        this.feelScore11 = feelScore11;
        this.feelScore12 = feelScore12;
        this.feelScore13 = feelScore13;
        this.feelScore14 = feelScore14;
        this.feelScore15 = feelScore15;
        this.feelScore16 = feelScore16;
        this.feelScore17 = feelScore17;
        this.feelScore18 = feelScore18;
        this.feelScore19 = feelScore19;
        this.feelScore20 = feelScore20;
        this.feelScore21 = feelScore21;
        this.feelScore22 = feelScore22;
        this.feelScore23 = feelScore23;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public String getName() {
        return name;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public String getInformation() {
        return information;
    }

    public Boolean getGender() {
        return gender;
    }

    public String getStatus() {
        return status;
    }

    public String getSchool() {
        return school;
    }


    public List<Integer> getFeelScores() {
        List<Integer> scores = new ArrayList<>();
        scores.add(this.feelScore00);
        scores.add(this.feelScore01);
        scores.add(this.feelScore02);
        scores.add(this.feelScore03);
        scores.add(this.feelScore04);
        scores.add(this.feelScore05);
        scores.add(this.feelScore06);
        scores.add(this.feelScore07);
        scores.add(this.feelScore08);
        scores.add(this.feelScore09);
        scores.add(this.feelScore10);
        scores.add(this.feelScore11);
        scores.add(this.feelScore12);
        scores.add(this.feelScore13);
        scores.add(this.feelScore14);
        scores.add(this.feelScore15);
        scores.add(this.feelScore16);
        scores.add(this.feelScore17);
        scores.add(this.feelScore18);
        scores.add(this.feelScore19);
        scores.add(this.feelScore20);
        scores.add(this.feelScore21);
        scores.add(this.feelScore22);
        scores.add(this.feelScore23);
        this.feelScores = scores;
        return feelScores;
    }
}
