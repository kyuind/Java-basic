package com.example.backend.domain;

import jakarta.persistence.*;

import java.util.List;
import java.util.ArrayList;

@Entity
public class Personality {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private  String personalityName;

    //Chold - Personality N:M
    @ManyToMany(mappedBy = "personalityList")
    private  List<Child> childList = new ArrayList<>();

    public void addChild(Child child){
        this.childList.add(child);
        child.getPersonalityList().add(this);
    }


    protected Personality(String personalityName){};


    public Personality(List<Child> childList) {
        this.childList = childList;
    }


    public List<Child> getChildList() {
        return childList;
    }

    public void setChildList(List<Child> childList) {
        this.childList = childList;
    }
}
