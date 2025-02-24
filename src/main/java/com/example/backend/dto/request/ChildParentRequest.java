package com.example.backend.dto.request;

public class ChildParentRequest {
    private ParentRequest parentRequest;
    private ChildRequest childRequest;

    // 아래 코드로 진행시 request값이 모두 들어와야하기에, 기본생성자 만들어서 해결 가능
    public ChildParentRequest(){};

    public ChildParentRequest(ChildRequest childRequest, ParentRequest parentRequest) {
        this.childRequest = childRequest;
        this.parentRequest = parentRequest;
    }

    public ChildRequest getChildRequest() {
        return childRequest;
    }

    public ParentRequest getParentRequest() {
        return parentRequest;
    }

    public void setChildRequest(ChildRequest childRequest) {
        this.childRequest = childRequest;
    }

    public void setParentRequest(ParentRequest parentRequest) {
        this.parentRequest = parentRequest;
    }
}
