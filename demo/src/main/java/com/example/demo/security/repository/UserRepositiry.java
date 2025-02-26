package com.example.demo.security.repository;

import com.example.demo.security.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepositiry extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
