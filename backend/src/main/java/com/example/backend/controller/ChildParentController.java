package com.example.backend.controller;


import com.example.backend.dto.request.ChildParentRequest;
import com.example.backend.service.NonRelation;
import org.springframework.web.bind.annotation.*;



@RestController
public class ChildParentController {
    private final NonRelation nonRelation;

    public ChildParentController(NonRelation nonRelation) {
        this.nonRelation = nonRelation;
    }

    @PostMapping("/childparent")
    public void testChildRelational(@RequestBody ChildParentRequest request){
        nonRelation.testChildRelational(request.getParentRequest(),
                request.getChildRequest());

    }

    @PostMapping("/relationmethod")
    public void relationmethod(@RequestBody ChildParentRequest request){
        nonRelation.relationmethod(request.getParentRequest(),
                request.getChildRequest());

    }

}
