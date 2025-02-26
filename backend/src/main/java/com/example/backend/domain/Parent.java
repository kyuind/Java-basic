package com.example.backend.domain;

import jakarta.persistence.*;

import java.util.List;
import java.util.ArrayList;

@Entity
public class Parent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String name;

    // Child : parent (N:1)
    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
    private List<Child> childList = new ArrayList<>();

    protected Parent(){}

    public Parent(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public List<Child> getChildList() {
        return childList;
    }

    public void addChild(Child child){
        this.childList.add(child);
        child.setParent(this);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }
}
