package com.example.backend.domain;

import com.example.backend.dto.request.ChildRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

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

    // Child - Parent (N : 1)
    @ManyToOne
    @JoinColumn(name="parent_id")
    private Parent parent;

    protected Child(){}

    public Child(String loginID, String password, String name) {
        this.loginID = loginID;
        this.password = password;
        this.name = name;
    }


    //Child - Personaliry N:M
    @ManyToMany
    @JoinTable(
            name = "child_personality",
            joinColumns = @JoinColumn(name = "child_id"),
            inverseJoinColumns = @JoinColumn(name="personality_id")
    )
    private List<Personality> personalityList = new ArrayList<>();

    public void addPersonality(Personality personality){
        this.personalityList.add(personality);
        personality.getChildList().add(this);
    }


    public Long getId() {
        return id;
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

    public Parent getParent() {
        return parent;
    }

    public void setLoginID(String loginID) {
        this.loginID = loginID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
        parent.getChildList().add(this);
    }

    public List<Personality> getPersonalityList() {
        return personalityList;
    }


}
