package com.example.backend.repository.book;

import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository {
        public void save(String bookName);

}
