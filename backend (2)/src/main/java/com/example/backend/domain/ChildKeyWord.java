package com.example.backend.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "childKeyWord")
public class ChildKeyWord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "chattingID", length = 100, nullable = false)
    private String chattingID;

    @Column(name = "keyWord")
    private String keyWord;

    @Column(name = "kind")
    private Integer kind;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "childID", nullable = false)
    private Child child;

    protected ChildKeyWord(){}


    //getter


    public Long getId() {
        return id;
    }

    public String getChattingID() {
        return chattingID;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public Integer getKind() {
        return kind;
    }

    public Child getChild() {
        return child;
    }
}
