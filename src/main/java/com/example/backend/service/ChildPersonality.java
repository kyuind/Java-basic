package com.example.backend.service;

import com.example.backend.domain.Child;
import com.example.backend.domain.Personality;
import com.example.backend.repository.ChildRepository;
import com.example.backend.repository.PersonalityRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ChildPersonality {
    private final PersonalityRepository personalityRepository;
    private final ChildRepository childRepository;

    public ChildPersonality(ChildRepository childRepository, PersonalityRepository personalityRepository) {
        this.childRepository = childRepository;
        this.personalityRepository = personalityRepository;
    }
    @Transactional
    public void addPersonalityToChild(Long childID, String personalityName){
        Child child = childRepository.findById(childID).orElseThrow();

        Personality personality = personalityRepository.findByPersonalityName(personalityName).orElseThrow(
                () -> personalityRepository.save( new Personality(personalityName)));

        child.addPersonality(personality);
//        personality.addChild(child);
    }

    public List<Personality> getChildPersonality(Long childID){
        Child child = childRepository.findById(childID).orElseThrow();

        return child.getPersonalityList();
    }

    public List<Child> getPersonalityChild(Long personalityID){
        Personality personality = personalityRepository.findById(personalityID).orElseThrow();

        return personality.getChildList();
    }

}
