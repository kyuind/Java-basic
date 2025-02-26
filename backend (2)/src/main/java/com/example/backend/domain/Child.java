package com.example.backend.domain;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "child")
public class Child {

    // 컬럼
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String birth;

    @Column(nullable = false, unique = true)
    private String loginId;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String name;

    private String profileImage;

    private Integer phoneNumber;

    private String information;

    @Column(nullable = false)
    private Boolean gender;

    private String status;

    private String school;

    private Boolean wantToTakeRequest;

    private String comment;

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

    // 부모와의 관계 (다대일)
//    @ManyToOne
//    @JoinColumn(name = "parent_id")
//    private Parent parent;

    // 아이 특성 관련 (다대다)
    @ManyToMany
    @JoinTable(name = "personalityLink",
    joinColumns = @JoinColumn(name="child_id"),
    inverseJoinColumns = @JoinColumn(name="personality_id"))
    private List<Personality> personalityList = new ArrayList<>();

    // LLM 진단 결과 (일대다)
    @OneToMany(mappedBy = "child", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Summary> summaryList = new ArrayList<>();

    // 아이 키워드 (일대다)
    @OneToMany (mappedBy = "child", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ChildKeyWord> childKeyWordList = new ArrayList<>();

//    // 아이 심리 보고서 (일대다)
//    @OneToMany(mappedBy = "child", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<ChildMe>  = "child", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<ProfessionalAreaLink> professionalAreaLinkList = new ArrayList<>();
//
//    // 상담 분석 리스트 (일대다)
//    @OneToMany(mappedBy = "child", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Analysis> analysisList = new ArrayList<>();


    // 생성자
    protected Child(){}


    //getter

    public Long getId() {
        return id;
    }

    public String getBirth() {
        return birth;
    }

    public String getLoginId() {
        return loginId;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
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

    public Boolean getWantToTakeRequest() {
        return wantToTakeRequest;
    }

    public String getComment() {
        return comment;
    }

    public Integer getFeelScore00() {
        return feelScore00;
    }

    public Integer getFeelScore01() {
        return feelScore01;
    }

    public Integer getFeelScore02() {
        return feelScore02;
    }

    public Integer getFeelScore03() {
        return feelScore03;
    }

    public Integer getFeelScore05() {
        return feelScore05;
    }

    public Integer getFeelScore06() {
        return feelScore06;
    }

    public Integer getFeelScore07() {
        return feelScore07;
    }

    public Integer getFeelScore04() {
        return feelScore04;
    }

    public Integer getFeelScore08() {
        return feelScore08;
    }

    public Integer getFeelScore09() {
        return feelScore09;
    }

    public Integer getFeelScore10() {
        return feelScore10;
    }

    public Integer getFeelScore11() {
        return feelScore11;
    }

    public Integer getFeelScore12() {
        return feelScore12;
    }

    public Integer getFeelScore13() {
        return feelScore13;
    }

    public Integer getFeelScore14() {
        return feelScore14;
    }

    public Integer getFeelScore15() {
        return feelScore15;
    }

    public Integer getFeelScore16() {
        return feelScore16;
    }

    public Integer getFeelScore17() {
        return feelScore17;
    }

    public Integer getFeelScore18() {
        return feelScore18;
    }

    public Integer getFeelScore19() {
        return feelScore19;
    }

    public Integer getFeelScore20() {
        return feelScore20;
    }

    public Integer getFeelScore21() {
        return feelScore21;
    }

    public Integer getFeelScore22() {
        return feelScore22;
    }

    public Integer getFeelScore23() {
        return feelScore23;
    }

    public List<Personality> getPersonalityList() {
        return personalityList;
    }

    public List<Summary> getSummaryList() {
        return summaryList;
    }

    public List<ChildKeyWord> getChildKeyWordList() {
        return childKeyWordList;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void setChildKeyWordList(List<ChildKeyWord> childKeyWordList) {
        this.childKeyWordList = childKeyWordList;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setFeelScore00(Integer feelScore00) {
        this.feelScore00 = feelScore00;
    }

    public void setFeelScore01(Integer feelScore01) {
        this.feelScore01 = feelScore01;
    }

    public void setFeelScore02(Integer feelScore02) {
        this.feelScore02 = feelScore02;
    }

    public void setFeelScore03(Integer feelScore03) {
        this.feelScore03 = feelScore03;
    }

    public void setFeelScore04(Integer feelScore04) {
        this.feelScore04 = feelScore04;
    }

    public void setFeelScore05(Integer feelScore05) {
        this.feelScore05 = feelScore05;
    }

    public void setFeelScore06(Integer feelScore06) {
        this.feelScore06 = feelScore06;
    }

    public void setFeelScore07(Integer feelScore07) {
        this.feelScore07 = feelScore07;
    }

    public void setFeelScore08(Integer feelScore08) {
        this.feelScore08 = feelScore08;
    }

    public void setFeelScore09(Integer feelScore09) {
        this.feelScore09 = feelScore09;
    }

    public void setFeelScore10(Integer feelScore10) {
        this.feelScore10 = feelScore10;
    }

    public void setFeelScore11(Integer feelScore11) {
        this.feelScore11 = feelScore11;
    }

    public void setFeelScore12(Integer feelScore12) {
        this.feelScore12 = feelScore12;
    }

    public void setFeelScore13(Integer feelScore13) {
        this.feelScore13 = feelScore13;
    }

    public void setFeelScore14(Integer feelScore14) {
        this.feelScore14 = feelScore14;
    }

    public void setFeelScore15(Integer feelScore15) {
        this.feelScore15 = feelScore15;
    }

    public void setFeelScore16(Integer feelScore16) {
        this.feelScore16 = feelScore16;
    }

    public void setFeelScore17(Integer feelScore17) {
        this.feelScore17 = feelScore17;
    }

    public void setFeelScore18(Integer feelScore18) {
        this.feelScore18 = feelScore18;
    }

    public void setFeelScore19(Integer feelScore19) {
        this.feelScore19 = feelScore19;
    }

    public void setFeelScore20(Integer feelScore20) {
        this.feelScore20 = feelScore20;
    }

    public void setFeelScore21(Integer feelScore21) {
        this.feelScore21 = feelScore21;
    }

    public void setFeelScore22(Integer feelScore22) {
        this.feelScore22 = feelScore22;
    }

    public void setFeelScore23(Integer feelScore23) {
        this.feelScore23 = feelScore23;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPersonalityList(List<Personality> personalityList) {
        this.personalityList = personalityList;
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

    public void setStatus(String status) {
        this.status = status;
    }

    public void setSummaryList(List<Summary> summaryList) {
        this.summaryList = summaryList;
    }

    public void setWantToTakeRequest(Boolean wantToTakeRequest) {
        this.wantToTakeRequest = wantToTakeRequest;
    }
}
