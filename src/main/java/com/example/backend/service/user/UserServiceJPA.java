//package com.example.backend.service.user;
//
//import com.example.backend.domain.Profile;
//import com.example.backend.domain.User;
//import com.example.backend.domain.UserRepository;
//import com.example.backend.dto.user.request.UserCreateRequest;
//import com.example.backend.dto.user.response.UserResponse;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.io.IOException;
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//public class UserServiceJPA {
//    private final UserRepository userRepository;
//
//    public UserServiceJPA(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    //Post 요청 : 데이터 저장
//
//    public void saveUser(UserCreateRequest request){
//        userRepository.save(new User(request.getName(), request.getAge()));
//        userRepository.save(new User("aaa",12));
//        throw new IllegalArgumentException();
//
//    }
//    public List<User> getAllUsers(){
//        return userRepository.findAll().stream().toList();
//    }
//    // Get 요청 : 사용자 전체 조회
//    //1. userRepository.findAll() => SELECT * FROM user
//    //2. .stream() => 스트림형태로 변환
//    //3. map(UserResponse::new) => 각 요소마다 UserResponse 객체로 변환
////    4. collect(Collectors.toList()) => List 형식으로 반환
//
////    @Transactional
////    public List<UserResponse> getAllUsers(){
////        return userRepository.findAll().stream().map(UserResponse::new).collect(Collectors.toList());
////    }
//    //Put 요청 : 데이터 업데이트
//
//    public void updateUser(Long id, UserCreateRequest request){
//        User user = userRepository.findById(id).orElseThrow(IllegalAccessError::new);
//        user.updateName(request.getName());
//        userRepository.save(user);
//    }
//
//    //Delete 요청 : 데이터 삭제
//
//    public void deleteUser(String name) {
//        // 이름으로 사용자 리스트 조회
//        List<User> users = userRepository.findAllName(name);
//
//        // 사용자가 존재하지 않으면 예외 처리
//        if (users.isEmpty()) {  // 빈 리스트 체크
//            throw new IllegalArgumentException("User not found with name: " + name);
//        }
//
//        // 사용자 삭제
//        userRepository.deleteAllInBatch(users);
//    }
////    public void deleteUser(String name){
//        //find : 하나의 데이터만 찾길 원할때 ( 2개의 데이터가 있으면 안됌)
//        //findAll
//        List<User> user = userRepository.findAllName(name);
//        if (user == null){
//            throw new IllegalArgumentException();
//
//        }
//        //delete: 객체 하나 삭제
//        //deleteAllInBatch : 여러개 삭제
//        userRepository.deleteAllInBatch(user);
//    }


//}
