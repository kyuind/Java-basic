package com.example.demo.security.controller;




import com.example.demo.security.domain.User;
import com.example.demo.security.repository.UserRepositiry;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;


@RestController
public class SecurityController {
    private UserRepositiry userRepositiry;


    @GetMapping("/user")
    public  String user(){
        return "user";
    }

    @GetMapping("/")
    public String root(){
        return "Root page";
    }

    @GetMapping("/login")
    public String loginPage() throws IOException{
        Path path = Paths.get("src/main/resources/templates/login.html");
        return Files.readString(path);
    }


    @PostMapping("/signup")
    public void signUp(User user, HttpServletResponse response)throws Exception{
        System.out.println(user);
        user.setRoler("USER");
        String password = user.getPassword();
        String username = user.getUsername();
        String email = user.getEmail();
        userRepositiry.save(user);
        response.sendRedirect("http://localhost:8080/login");

    }
    @PostMapping("/join")
    public void join(@RequestParam String username, @RequestParam String password,
                     Model model,
                     HttpServletResponse httpServletResponse,
                     HttpSession httpSession) throws IOException {
        Optional<User> userOpt= userRepositiry.findByUsername(username);

    }
//    @GetMapping("/login")
//    public String LoginPage(@RequestParam(value="error",required = false), String error,
//                            @RequestParam(value = "logout", required = false), String logout,
//                            Model model){
//        if(error != null){
//                model.addAttribute("loginError","아이디 또는 비밀번호 틀림");
//        }
//        if(logout != null){
//            model.addAttribute("logoutMessage","로그아웃되었습니다.");
//        }
//
//        return "login";
//    }
}
