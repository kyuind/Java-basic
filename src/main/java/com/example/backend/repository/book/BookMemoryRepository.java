package com.example.backend.repository.book;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

//import java.util.ArrayList;
//import java.util.List;
@Repository
@Primary
public class BookMemoryRepository implements BookRepository {
//    private final List<String> books = new ArrayList<>(); //같은 타입의 배열을 저장하는 list
    @Override
    public void save(String bookName){
//        books.add(bookName);
        System.out.println("Memory BookName : " + bookName);
    }

}
