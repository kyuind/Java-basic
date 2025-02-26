package com.example.backend.dto.response;

public class ChildToSummaryDTOResponse {
    private Long id;

    private String childDay;
    private String childMind;
    private String improveProcess;
    private String understandChild;
    private String supportGuide;
    private String situationSummary;
    private String oneLinePrescribe;
    private String orderPrescribe;
    private String doneToday;

    public ChildToSummaryDTOResponse(Long id, String childDay, String childMind, String improveProcess, String understandChild, String supportGuide, String situationSummary, String oneLinePrescribe, String orderPrescribe, String doneToday) {
        this.id = id;
        this.childDay = childDay;
        this.childMind = childMind;
        this.improveProcess = improveProcess;
        this.understandChild = understandChild;
        this.supportGuide = supportGuide;
        this.situationSummary = situationSummary;
        this.oneLinePrescribe = oneLinePrescribe;
        this.orderPrescribe = orderPrescribe;
        this.doneToday = doneToday;
    }

    public Long getId() {
        return id;
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
}
