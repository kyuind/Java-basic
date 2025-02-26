package com.example.backend.service;

import com.example.backend.domain.Child;
import com.example.backend.domain.Personality;
import com.example.backend.dto.request.ChildRequest;
import com.example.backend.dto.request.PersonalityRequest;
import com.example.backend.repository.ChildRepository;
import com.example.backend.repository.PersonalityRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class ChildPersonality {
    private final PersonalityRepository personalityRepository;
    private final ChildRepository childRepository;

    public ChildPersonality(PersonalityRepository personalityRepository,
                            ChildRepository childRepository) {
        this.personalityRepository = personalityRepository;
        this.childRepository = childRepository;
    }

    @Transactional
//    child에 퍼스널리티를 추가하기
    public void addPersonalityToChild(Long childID, String personalityName) {
        Child child = childRepository.findById(childID).orElseThrow();

        Personality personality = personalityRepository.findByPersonalityName(personalityName).orElseGet(
                () -> personalityRepository.save(new Personality(personalityName)));


        child.addPersonality(personality);
        childRepository.save(child);
    }

    public List<PersonalityRequest> getChildPersonality(Long childID){
        Child child = childRepository.findById(childID).orElseThrow();
        return child.getPersonalityList().stream()
                .map(PersonalityRequest::fromEntity)
                .collect(Collectors.toList());
    }

    public List<ChildRequest> getPersonalityChild(Long personalityID){
        Personality personality = personalityRepository.findById(personalityID).orElseThrow();
        return personality.getChildList().stream()
                .map(ChildRequest::fromEntity)
                .collect(Collectors.toList());
    }
}