package com.example.backend.repository;

import com.example.backend.domain.Personality;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import java.util.List;
import java.util.Optional;

public interface PersonalityInterface extends JpaRepository<Personality, Long> {

    List<Personality> findByChildList_Id(Long childId);
    Optional<Personality> findByPersonalityName(String PersonalityName);

}
