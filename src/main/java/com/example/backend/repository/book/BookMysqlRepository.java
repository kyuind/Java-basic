package com.example.backend.repository.book;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
//@Primary // 우선권
public class BookMysqlRepository implements BookRepository {

    @Override
    public void save(String bookName){
        System.out.println("MySQL Repository : " + bookName);
    }
}
