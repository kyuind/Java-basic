package com.example.backend.service;

import com.example.backend.domain.Child;
import com.example.backend.domain.Personality;
import com.example.backend.domain.Summary;
import com.example.backend.dto.request.ChildModifyRequestDTO;
import com.example.backend.dto.response.*;
import com.example.backend.repository.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;
import java.time.LocalDate;

import static com.example.backend.repository.ChildInterface.*;


@Service
public class ChildService {
    private final ChildInterface childInterface;
    private final ChildKeyWordInterface childKeyWordInterface;
    private final SummaryInterface summaryInterface;
    private final PersonalityInterface personalityInterface;

    public ChildService(ChildInterface childInterface, ChildKeyWordInterface childKeyWordInterface, SummaryInterface summaryInterface, PersonalityInterface personalityInterface) {
        this.childInterface = childInterface;
        this.childKeyWordInterface = childKeyWordInterface;
        this.summaryInterface = summaryInterface;
        this.personalityInterface = personalityInterface;
    }

    @Transactional
//    1. Child에 있는 정보
//    2. Child id로 keyword 정보
//    3. Child id로 summary 정보
//    4. Child id로 personality 정보
    public ChildTotalGetDTOResponse childTotalGetDTOResponse(Long childId){

        Child child = childInterface.findById(childId).orElseThrow();

        AllChildDTOResponse allChildDTOResponse = new AllChildDTOResponse(
                child.getId(),
                LocalDate.parse(child.getBirth()), //yyyy-MM-dd
                child.getName(),
                child.getProfileImage(),
                child.getInformation(),
                child.getGender(),
                child.getStatus(),
                child.getSchool(),
                child.getFeelScore00(),
                child.getFeelScore01(),
                child.getFeelScore02(),
                child.getFeelScore03(),
                child.getFeelScore04(),
                child.getFeelScore05(),
                child.getFeelScore06(),
                child.getFeelScore07(),
                child.getFeelScore08(),
                child.getFeelScore09(),
                child.getFeelScore10(),
                child.getFeelScore11(),
                child.getFeelScore12(),
                child.getFeelScore13(),
                child.getFeelScore14(),
                child.getFeelScore15(),
                child.getFeelScore16(),
                child.getFeelScore17(),
                child.getFeelScore18(),
                child.getFeelScore19(),
                child.getFeelScore20(),
                child.getFeelScore21(),
                child.getFeelScore22(),
                child.getFeelScore23());

        // child에서 childkeywordList를 뽑아오기.
        List<ChildToKeywordDTOResponse> childToKeywordDTOResponses = child.getChildKeyWordList().stream()
                .map(childKeyword -> new ChildToKeywordDTOResponse(
                        childKeyword.getId(),
                        childKeyword.getKeyWord(),
                        childKeyword.getKind()
                )).collect(Collectors.toList());

        List<ChildToPersonalityDTOResponse> personalityDTOResponses = child.getPersonalityList().stream()
                .map(personality -> new ChildToPersonalityDTOResponse(
                        personality.getId(),
                        personality.getPersonalityName()
                )).collect(Collectors.toList());

        ChildToSummaryDTOResponse childToSummaryDTOResponse;
        List<Summary> summaryList = child.getSummaryList();
        if (summaryList != null && !summaryList.isEmpty()){
            Summary summary = summaryList.get(0);
            childToSummaryDTOResponse = new ChildToSummaryDTOResponse(
                    summary.getId(),
                    summary.getChildDay(),
                    summary.getChildMind(),
                    summary.getImproveProcess(),
                    summary.getUnderstandChild(),
                    summary.getSupportGuide(),
                    summary.getSituationSummary(),
                    summary.getOneLinePrescribe(),
                    summary.getOrderPrescribe(),
                    summary.getDoneToday()
            );
        }else{
            childToSummaryDTOResponse = new ChildToSummaryDTOResponse(null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null,
                    null);
        }

        return new ChildTotalGetDTOResponse(
                childToKeywordDTOResponses,
                allChildDTOResponse,
                personalityDTOResponses,
                childToSummaryDTOResponse
        );
    }


    @Transactional
    public Child updateChild(Long childId, ChildModifyRequestDTO requestDTO){
        Child child = childInterface.findById(childId).orElseThrow();

        if (requestDTO.getName() !=null) child.setName(requestDTO.getName());
        if (requestDTO.getLoginID() !=null) child.setLoginId(requestDTO.getLoginID());
        if (requestDTO.getPassword() !=null) child.setPassword(requestDTO.getPassword());
        if (requestDTO.getComment() !=null) child.setComment(requestDTO.getComment());
        if (requestDTO.getInformation() !=null) child.setInformation(requestDTO.getInformation());
        if (requestDTO.getPhoneNumber() !=null) child.setPhoneNumber(requestDTO.getPhoneNumber());
        if (requestDTO.getProfileImage() !=null) child.setProfileImage(requestDTO.getProfileImage());
        if (requestDTO.getSchool() !=null) child.setSchool(requestDTO.getSchool());

        if (requestDTO.getPersonalityNames() != null){
            List<Personality> updatePersonalities = requestDTO.getPersonalityNames().stream()
                    .map(name -> personalityInterface.findByPersonalityName(name)
                            .orElseGet(() -> personalityInterface.save(new Personality(name))))  // Optional에서 Personality 객체로 반환
                    .collect(Collectors.toList());

                    child.getPersonalityList().clear();
                    child.getPersonalityList().addAll(updatePersonalities);


        }

        return childInterface.save(child);

    }

}
