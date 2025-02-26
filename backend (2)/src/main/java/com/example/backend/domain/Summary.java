package com.example.backend.domain;


import com.example.backend.domain.Child;
import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "summary")
public class Summary implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // FK: childID
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "childID", nullable = false)
    private Child child;

    @Column(name = "chattingID", length = 100, nullable = false,
    unique = true)
    private String chattingID;

    @Lob
    @Column(name = "childDay", columnDefinition = "LONGTEXT")
    private String childDay;

    @Lob
    @Column(name = "childMind", columnDefinition = "LONGTEXT")
    private String childMind;

    @Lob
    @Column(name = "improveProcess", columnDefinition = "LONGTEXT")
    private String improveProcess;

    @Lob
    @Column(name = "understandChild", columnDefinition = "LONGTEXT")
    private String understandChild;

    @Lob
    @Column(name = "supportGuide", columnDefinition = "LONGTEXT")
    private String supportGuide;

    @Lob
    @Column(name = "situationSummary", columnDefinition = "LONGTEXT")
    private String situationSummary;

    @Lob
    @Column(name = "oneLinePrescribe", columnDefinition = "LONGTEXT")
    private String oneLinePrescribe;

    @Lob
    @Column(name = "orderPrescribe", columnDefinition = "LONGTEXT")
    private String orderPrescribe;

    @Lob
    @Column(name = "doneToday", columnDefinition = "LONGTEXT")
    private String doneToday;

    // getters and setters

    public Long getId() {
        return id;
    }

    public Child getChild() {
        return child;
    }

    public String getChattingID() {
        return chattingID;
    }

    public String getChildDay() {
        return childDay;
    }

    public String getChildMind() {
        return childMind;
    }

    public String getImproveProcess() {
        return improveProcess;
    }

    public String getUnderstandChild() {
        return understandChild;
    }

    public String getSupportGuide() {
        return supportGuide;
    }

    public String getSituationSummary() {
        return situationSummary;
    }

    public String getOneLinePrescribe() {
        return oneLinePrescribe;
    }

    public String getOrderPrescribe() {
        return orderPrescribe;
    }

    public String getDoneToday() {
        return doneToday;
    }

    protected Summary(){}
}
