//package com.example.backend.repository.user;
//
//import com.example.backend.dto.user.request.UserCreateRequest;
//import com.example.backend.dto.user.response.UserResponse;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//// DB에 대한 요청들을 처리하는 역할
//// DB 직접 연결 작업
//// JDB를 사용하여 SQL을 DB로 보내는 작업
//@Repository
//public class UserJDBCRepository {
//    private final JdbcTemplate jdbcTemplate;
//
//    public UserJDBCRepository(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    // Post 사용자 입력 요청
//    public void saveUser(UserCreateRequest request) {
//        String sql = "INSERT INTO user(name, age) VALUES(?,?)";
//        jdbcTemplate.update(sql, request.getName(), request.getAge());
//    }
//
//    //PUT 사용자 정보 수정
//    public void updateUser(Long id, String name, Integer age) { // BIGINT = Long
//        String sql = "UPDATE user SET name = ? , age = ? WHERE id= ? ";
//        jdbcTemplate.update(sql, name, age, id);
//    }
//
//    //DELETE 사용자 정보 삭제
//    public void deleteUser(Long id) {
//        String sql = "DELETE FROM user WHERE id =?";
//        jdbcTemplate.update(sql, id);
//
//    }
//
//    public List<UserResponse> getAllusers() {
//        String sql = "SELECT * FROM user";
//        return jdbcTemplate.query(sql, userRowMapper);
//    }
//
//    private final RowMapper<UserResponse> userRowMapper = (rs, rowNum) ->
//            new UserResponse(rs.getLong("id"),rs.getInt("age"),  rs.getString("name"));
//
//    public UserResponse getUserId(Long id) {
//        String sql = "SELECT * FROM user WHERE id= ?";
//        return jdbcTemplate.queryForObject(sql, userRowMapper, id);
//    }
//}
//
