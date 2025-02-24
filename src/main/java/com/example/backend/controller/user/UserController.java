//package com.example.backend.controller.user;
//
//import com.example.backend.domain.User;
//import com.example.backend.dto.user.response.UserResponse;
//import com.example.backend.service.user.UserServiceJPA;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import com.example.backend.dto.user.request.UserCreateRequest;
//import com.example.backend.service.user.UserService;
//
//import java.util.List;
//
////@PostMapping("/user")
////Json으로 받은 데이터를 객체로 변환해서 받아줌
//@RestController
//public class UserController {
//    private final UserServiceJPA userService;
//
////    @Autowired
////    public UserController(UserService userService) {
////        this.UserService = userService;
////    }
//
//    public UserController(UserServiceJPA userServicee) {
//        this.userService = userServicee;
//    }
//
//    @PostMapping("/users")
//    public void saveUser(@RequestBody UserCreateRequest request) {
//        userService.saveUser(request);
//    }
//
//    @GetMapping("/user")
//    public List<User> getAllUsers(){
//        return userService.getAllUsers();
//    }
//
//
//    @PutMapping("/{id}")
//    public  void updateUser(@PathVariable Long id,
//                            @RequestBody UserCreateRequest request){
//        userService.updateUser(id,request);
//    }
//
//    @DeleteMapping("/del/{name}")
//    public void deleteUser(@PathVariable String name){
//        userService.deleteUser(name);
//    }
////    @DeleteMapping("/del/{id}")
////    public void deleteUser(@PathVariable Long id){
////        userService.deleteUser(id);
////    }
////
////    @GetMapping("/user")
////    public List<UserResponse> getAllusers(){
////        return userService.getAllusers();
////    }
////
////    @GetMapping("/user/{id}")
////    public UserResponse getUserId(@PathVariable Long id){
////        return userService.getUserId(id);
////    }
//}
//////