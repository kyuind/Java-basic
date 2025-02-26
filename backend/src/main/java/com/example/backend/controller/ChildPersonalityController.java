package com.example.backend.controller;

import com.example.backend.domain.Child;
import com.example.backend.domain.Personality;
import com.example.backend.dto.request.ChildRequest;
import com.example.backend.dto.request.PersonalityRequest;
import com.example.backend.service.ChildPersonality;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChildPersonalityController {
    private final ChildPersonality childPersonality;


    public ChildPersonalityController(ChildPersonality childPersonality) {
        this.childPersonality = childPersonality;
    }


    @PostMapping("/{childID}/personality")
    public ResponseEntity<String> addPersonalityToChild(
            @PathVariable Long childID,
            @RequestParam String personalityName)
    {
        childPersonality.addPersonalityToChild(childID, personalityName);
        return ResponseEntity.ok("추가 성공");
    }

    @GetMapping("/{childID}/personality")
    public ResponseEntity<List<PersonalityRequest>> getChildPersonality(
            @PathVariable Long childID)
    {
        return ResponseEntity.ok(childPersonality.getChildPersonality(childID));
    }

    @GetMapping("/{personalityID}/child")
    public ResponseEntity<List<ChildRequest>> getPersonalityChild(
            @PathVariable Long personalityID
    ){
        return ResponseEntity.ok(childPersonality.getPersonalityChild(personalityID));
    }



}
