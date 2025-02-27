package com.example.demo.security.service;


import com.example.demo.security.domain.User;
import com.example.demo.security.repository.UserRepositiry;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.swing.plaf.OptionPaneUI;
import java.util.Optional;

@Service
public class SecurityService {
    private final UserRepositiry userRepositiry;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;

    public SecurityService(AuthenticationManager authenticationManager, PasswordEncoder passwordEncoder, UserRepositiry userRepositiry) {
        this.authenticationManager = authenticationManager;
        this.passwordEncoder = passwordEncoder;
        this.userRepositiry = userRepositiry;
    }

//    public boolean authenticate(String username, String password){
//        Optional<User> userOpt= userRepositiry.findByUsername(username);
//        if(userOpt.isEmpty()){
//            return false;
//        }
//        User user = userOpt.get();
//        boolean matches = passwordEncoder.matches(password, user.getPassword());
//        return matches;
//    }

    public boolean authenticate(String username, String password){
        try{
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(username, password)
            );
            return authentication.isAuthenticated();
        } catch(AuthenticationException e){
            return false;
        }

    }

    public void registerUser(User user){
        user.setRole("ADMIN");
        user.setPassword(passwordEncoder.encode((user.getPassword())));
        userRepositiry.save(user);
    }
}
