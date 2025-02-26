package com.example.backend.dto.response;


public class ChildToKeywordDTOResponse {
    private Long id;
    private String keyWord;
    private Integer kind;

    public ChildToKeywordDTOResponse(Long id, String keyWord, Integer kind) {
        this.id = id;
        this.keyWord = keyWord;
        this.kind = kind;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public Integer getKind() {
        return kind;
    }

    public Long getId() {
        return id;
    }
}
