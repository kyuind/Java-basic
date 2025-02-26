package com.example.backend.dto.response;

import java.util.List;

public class ChildTotalGetDTOResponse {
    private List<ChildToKeywordDTOResponse> childToKeywordDTOResponse;
    private AllChildDTOResponse allChildDTOResponse;
    private List<ChildToPersonalityDTOResponse> childToPersonalityDTOResponse;
    private ChildToSummaryDTOResponse childToSummaryDTOResponse;


    public ChildTotalGetDTOResponse(List<ChildToKeywordDTOResponse> childToKeywordDTOResponse,
                                    AllChildDTOResponse allChildDTOResponse,
                                    List<ChildToPersonalityDTOResponse> childToPersonalityDTOResponse,
                                    ChildToSummaryDTOResponse childToSummaryDTOResponse) {
        this.childToKeywordDTOResponse = childToKeywordDTOResponse;
        this.allChildDTOResponse = allChildDTOResponse;
        this.childToPersonalityDTOResponse = childToPersonalityDTOResponse;
        this.childToSummaryDTOResponse = childToSummaryDTOResponse;
    }

    public List<ChildToKeywordDTOResponse> getChildToKeywordDTOResponse() {
        return childToKeywordDTOResponse;
    }

    public AllChildDTOResponse getAllChildDTOResponse() {
        return allChildDTOResponse;
    }

    public List<ChildToPersonalityDTOResponse> getChildToPersonalityDTOResponse() {
        return childToPersonalityDTOResponse;
    }

    public ChildToSummaryDTOResponse getChildToSummaryDTOResponse() {
        return childToSummaryDTOResponse;
    }
}
