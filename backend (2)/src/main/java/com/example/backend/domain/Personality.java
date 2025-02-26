package com.example.backend.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "personality",
uniqueConstraints = @UniqueConstraint(columnNames = "personlityName"))
public class Personality {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "personalityName", length = 30,
    nullable = false, unique = true)
    private String personalityName;


    @ManyToMany(mappedBy = "personalityList")
    private List<Child> childList = new ArrayList<>();

    protected Personality(){

    }

    //getter


    public Long getId() {
        return id;
    }

    public String getPersonalityName() {
        return personalityName;
    }

    public List<Child> getChildList() {
        return childList;
    }

    public Personality(String personalityName) {
        this.personalityName = personalityName;
    }
}
