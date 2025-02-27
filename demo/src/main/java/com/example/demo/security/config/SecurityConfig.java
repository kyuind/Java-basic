
package com.example.demo.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http
                .csrf(csrf -> csrf.disable())//csrf 비활성화
                .authorizeHttpRequests(auth -> auth//인증 설정
                        .requestMatchers("/", "/login", "/signup").permitAll()//해당 url은 인증없이 접근 가능
                        .requestMatchers("/admin/**").hasRole("ADMIN")//해당 url은 ADMIN 권한이 있어야 접근 가능
                        .requestMatchers("/user/**").hasRole("USER")//해당 url은 USER 권한이 있어야 접근 가능
                        .anyRequest().authenticated())//나머지 url은 인증 필요
                .formLogin(form->form.disable())
                .logout(logout ->  logout//로그아웃 설정
                        .logoutUrl("/logout")//로그아웃 요청 url
                        .logoutSuccessUrl("/")//로그아웃 성공시 리다이렉트
                        .invalidateHttpSession(true) // 로그아웃후에 세션 만료
                        .deleteCookies("JSESSIONID") //쿠키 무효화
                        .permitAll());
        return http.build();
    }

    @Bean // 패스워드를 암호화
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean // 커스텀 인증 로직을 구성할때 UserDetailService를 사용하는 경우
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception{
        return authenticationConfiguration.getAuthenticationManager();
    }


}