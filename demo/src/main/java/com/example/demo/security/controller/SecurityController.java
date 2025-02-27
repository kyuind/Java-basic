package com.example.demo.security.controller;


import com.example.demo.security.domain.User;
import com.example.demo.security.dto.request.LoginRequest;
import com.example.demo.security.service.SecurityService;
import jakarta.servlet.http.HttpServletResponse;
import org.hibernate.sql.ast.tree.expression.Collation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.metadata.PostgresCallMetaDataProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;


@RestController
@RequestMapping
public class SecurityController {
    private final SecurityService securityService;

    @Autowired
    public SecurityController(SecurityService securityService) {
        this.securityService = securityService;
    }

    @GetMapping("/user")
    public String user() {
        return "User Page";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Admin Page";
    }
    @GetMapping("/admin/me")
    public String adminname(){
        return "Adminname";
    }
//    @GetMapping("/")
//    public String root() {
//        return "Root Page";
//    }

    @GetMapping("/") //루트 페이지
    public String getCurrentUserRole(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        String roles = authorities.stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.joining(","));
        return "현재 사용자 : " + authentication.getName() + " 권한 : " + roles;
    }

    @GetMapping("/login") //로그인 페이지
    public String loginPage() throws IOException{
        Path path = Paths.get("src/main/resources/templates/login.html");
        return Files.readString(path);
    }

    @PostMapping("/login")//로그인
    public void login(@RequestBody LoginRequest loginRequest, HttpServletResponse response) throws Exception{
        if (!securityService.authenticate(loginRequest.getUsername(), loginRequest.getPassword())){
            response.sendRedirect("http://localhost:8080/login?error=true");
            return;
        }
        response.sendRedirect("http://localhost:8080/");
    }

    @GetMapping("/signup") //회원가입 페이지
    public String signupPage() throws IOException{
        Path path = Paths.get("src/main/resources/templates/signup.html");
        return Files.readString(path);
    }

    @PostMapping("/signup")
    public void signUP(@RequestBody User user, HttpServletResponse response) throws Exception{
        securityService.registerUser(user);
        response.sendRedirect("http://localhost:8080/login");
    }

}
