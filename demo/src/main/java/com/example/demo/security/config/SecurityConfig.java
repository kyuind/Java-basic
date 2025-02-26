
package com.example.demo.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration // Spring 설정파일
@EnableWebSecurity // Spring security 활성화
public class SecurityConfig {

    @Bean // IoC/DI 패턴에 자동등록.
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http.csrf(csrf -> csrf.disable()) // 테스트중이니까 csrf 보호 비활성화

                // 루트 페이지("/") 를 제외한 모든 페이지, 인증검사 하겠다.
//                .authorizeHttpRequests(auth -> auth  // 모든 요청에 대한 보안 규칙 정의
//                        .requestMatchers("/").permitAll()
//                        .anyRequest().authenticated())

                .authorizeHttpRequests(auth -> auth.anyRequest().permitAll()) // 모두허용

                .formLogin( form -> form.loginPage("/login").permitAll()) // 로그인 폼을 설정 (default 설정도 제공해줌.), 로그인 폼 있으면 해당 url 넣어준다.
                .logout(logout -> logout.permitAll()); // 로그아웃 기능 활성화, 모든사용자는 로그아웃 사용가능

        return http.build();

    }


}


//package com.example.demo.security.config;
//
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration //Spring 에 설정파일
//@EnableWebSecurity //Spring security 활성화
//public class SecurityConfig {
//
//    @Bean //IoC/Di 패턴에 자동등록
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
//        http.csrf(csrf -> csrf.disable())//csrf 보호 비활성화 (test용)
//                .authorizeHttpRequests(auth ->auth//모든 요청에 대한 보안규칙 정의
//                        .requestMatchers("/","/login").permitAll()//루트 페이지에 대한 보안 규칙 : 누구나 허용
//                        .anyRequest().authenticated())//루트를 제외한 모든 페이지, 인증검사 진행
////              .authorizeHttpRequests(auth-> auth.anyRequest().permitAll())  모두 허용
//                .formLogin(form->form.permitAll())//로그인 폼을 설정(기본설정)
//                .logout(logout->logout.permitAll());//로그아웃 기능활성화, 모든 사용자는 로그아웃 사용가능
//
//        return http.build();
//
//    }
//}
//package com.example.demo.security.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration // Spring에 설정 파일입니다.
//@EnableWebSecurity //Spring security 활성화
//public class SecurityConfig {
//
//    @Bean //IoC/DI 패턴에 자동 등록
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
//        http.csrf(csrf -> csrf.disable())//csrf 보호 비활성화 (테스트)
//                .authorizeHttpRequests(auth -> auth //모든 요청에 대한 보안 규칙 정의
//                        .requestMatchers("/").permitAll() // 루트 페이지에 대한 보안 규칙 : 누구나 허용
//                        .anyRequest().authenticated()) // 루트를 제외한 모든 페이지, 인증 검사 하겠다.
////                .authorizeHttpRequests(auth -> auth.anyRequest().permitAll())//모두 허용
//                .formLogin(form -> form.permitAll()) // 로그인 폼을 설정(기본 설정)
//                .logout(logout -> logout.permitAll());//로그아웃기능 활성화, 모든사용자는 로그아웃 사용가능
//
//        return http.build();
//    }
//}