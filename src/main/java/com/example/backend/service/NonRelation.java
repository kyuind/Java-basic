package com.example.backend.service;

import com.example.backend.domain.Child;
import com.example.backend.domain.Parent;
import com.example.backend.dto.request.ChildRequest;
import com.example.backend.dto.request.ParentRequest;
import com.example.backend.repository.ChildRepository;
import com.example.backend.repository.ParentRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NonRelation {
    private final ChildRepository childRepository;
    private final ParentRepository parentRepository;

    public NonRelation(ChildRepository childRepository, ParentRepository parentRepository) {
        this.childRepository = childRepository;
        this.parentRepository = parentRepository;
    }

    @Transactional
    public void testChildRelational(ParentRequest parentRequest, ChildRequest childRequest) {
        Parent parent = new Parent(parentRequest.getEmail(), parentRequest.getName());
        parentRepository.save(parent);

        Child child = new Child(childRequest.getLoginID(), childRequest.getname(), childRequest.getPassword());
        child.setParent(parent);
        childRepository.save(child);

        Parent savedParent = parentRepository.findById(parent.getId()).orElseThrow();
        System.out.println("Parent 정보" + savedParent.getChildList());
    }

    @Transactional
    public void relationMethod(ParentRequest parentRequest, ChildRequest childRequest) {
        Parent parent = new Parent(parentRequest.getEmail(), parentRequest.getName());
        parentRepository.save(parent);

        Child child = new Child(childRequest.getLoginID(), childRequest.getname(), childRequest.getPassword());
        parent.addChild(child);
        childRepository.save(child);

        Parent savedParent = parentRepository.findById(parent.getId()).orElseThrow();
        System.out.println("Parent 정보" + savedParent.getChildList());
    }
}
