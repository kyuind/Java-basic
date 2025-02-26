package com.example.backend.repository;

import com.example.backend.domain.Summary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SummaryInterface extends JpaRepository<Summary, Long> {
}
