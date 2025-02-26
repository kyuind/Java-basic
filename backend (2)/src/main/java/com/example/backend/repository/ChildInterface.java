package com.example.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.backend.domain.Child;

public interface ChildInterface extends JpaRepository<Child, Long> {

}
