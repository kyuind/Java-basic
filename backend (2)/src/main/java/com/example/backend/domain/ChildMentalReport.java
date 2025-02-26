package com.example.backend.domain;


import jakarta.persistence.*;

@Entity
@Table(name = "ChildMentalReport")
public class ChildMentalReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // 아동 (FK: childID)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "childID", nullable = false)
    private Child child;

    @Column(name = "chattingID", length = 100)
    private String chattingID;

    @Lob
    @Column(name = "reportSave", columnDefinition = "LONGTEXT")
    private String reportSave;

    //getter
    public Integer getId() {
        return id;
    }

    public Child getChild() {
        return child;
    }

    public String getChattingID() {
        return chattingID;
    }

    public String getReportSave() {
        return reportSave;
    }
}
