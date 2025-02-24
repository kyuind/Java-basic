package com.example.backend.domain;

import jakarta.persistence.*;
import java.util.List;
import java.util.ArrayList;

@Entity
public class Child {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String loginID;
    @Column
    private String password;
    @Column
    private String name;


    //Child - Persnality N:M
    @ManyToMany
    @JoinTable(
            name = "child_personality",
            joinColumns = @JoinColumn(name = "child_id"),
            inverseJoinColumns = @JoinColumn(name = "personality_id")
    )
    private List<Personality> personalityList = new ArrayList<>();

    public void addPersonality(Personality personality) {
        this.personalityList.add(personality);
        personality.getChildList().add(this);
    }


    //Child - Parnent (N:1)
    @ManyToOne
    @JoinColumn(name="parent_id", nullable = false)
    private  Parent parent;


    protected Child(){}

    public Child(String loginID, String name,String password) {

        this.loginID = loginID;
        this.name = name;
        this.password = password;

    }



    public String getName() {
        return name;
    }

    public String getLoginID() {
        return loginID;
    }

    public Parent getParent() {
        return parent;
    }

    public String getPassword() {
        return password;
    }


    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Personality> getPersonalityList() {
        return personalityList;
    }

}
