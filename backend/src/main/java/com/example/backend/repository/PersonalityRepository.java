package com.example.backend.repository;

import com.example.backend.domain.Personality;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PersonalityRepository extends JpaRepository<Personality, Long> {
    Optional<Personality> findAllByPersonalityName(String personalityName);

}
