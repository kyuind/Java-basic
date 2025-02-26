package com.example.backend.repository;

import com.example.backend.domain.ChildMentalReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildMentalReportInterface extends JpaRepository<ChildMentalReport, Long> {
}
