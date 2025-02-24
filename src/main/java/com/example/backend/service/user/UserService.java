//package com.example.backend.service.user;
//
//import com.example.backend.dto.user.response.UserResponse;
//import com.example.backend.repository.user.UserJDBCRepository;
//import com.example.backend.dto.user.request.UserCreateRequest;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//// 비지니스 로직 수행
//// 컨트롤러에서 받은 데이터 repository로 전달
//// 추가 검증
//@Service
//public class UserService {
//    private final UserJDBCRepository userRepository;
//
//    public UserService(UserJDBCRepository userRepository) {
//        this.userRepository = userRepository;
//    }
////    public UserService(JdbcTemplate jdbcTemplate) {
////        this.userRepository = new UserRepository(jdbcTemplate);
////    }
//
//    public void saveUser(UserCreateRequest request){
//        userRepository.saveUser(request);
//    }
//
//    public void updateUser(Long id, UserCreateRequest request){
//        userRepository.updateUser(id, request.getName(), request.getAge());
//
//    }
//
//    public  void deleteUser(Long id){
//        userRepository.deleteUser(id);
//    }
//
//    public List<UserResponse> getAllusers(){
//        return userRepository.getAllusers();
//    }
//
//    public UserResponse getUserId(Long id){
//        return userRepository.getUserId(id);
//    }
//}
