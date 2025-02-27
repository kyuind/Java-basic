package com.example.demo.security.service;

import com.example.demo.security.repository.UserRepositiry;
import com.example.demo.security.domain.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    private final UserRepositiry userRepositiry;

    public CustomUserDetailsService(UserRepositiry userRepositiry) {
        this.userRepositiry = userRepositiry;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("username: " + username);
        User user = userRepositiry.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("해당 유저 없음."));

        System.out.println(username+": success");


        return org.springframework.security.core.userdetails.User
                .withUsername(user.getUsername())
                .password(user.getPassword())
                .roles(user.getRole())
                .build();
    }
}
