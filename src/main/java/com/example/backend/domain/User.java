package com.example.backend.domain;

import jakarta.persistence.*;

@Entity // JPA가 해당 클래스를 엔티티로 인식
@Table(name = "user") // 내 데이터베이스의 테이블이름
public class User {

    @Id //(PK)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(nullable = false, length=25, name="name")
    private  String name;

    @Column
    private  Integer age;

    protected User(){} ;  // JPA를 사용하기위해 기본 생성자 필수


    public User(String name, Integer age) {
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException(String.format("잘못된 name(%s)이 들어왔음",name));
        }
        this.name = name;
        this.age = age;
    }

    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
    //Cascade 참조값이 사라지면 참조하던 데이터도 삭제
    private Profile profile;

    public void setProfile(Profile profile){
        this.profile = profile; //User가 Profile을 저장함
        profile.setUser(this); // Profile이 User를 저장함
    }

    public Integer getAge() {
        return age;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void updateName(String name){
        this.name = name;

    }



}
