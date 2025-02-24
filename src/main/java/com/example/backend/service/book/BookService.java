package com.example.backend.service.book;

import com.example.backend.dto.book.request.SaveBookRequest;
import com.example.backend.repository.book.BookMemoryRepository;
import com.example.backend.repository.book.BookMysqlRepository;
import com.example.backend.repository.book.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {
//    private final BookMemoryRepository bookMemoryRepository = new BookMemoryRepository();
//    private final BookMysqlRepository bookMysqlRepository = new BookMysqlRepository();
//    private final BookRepository bookRepository = new BookMemoryRepository();
//    private final BookRepository bookRepository = new BookMysqlRepository();

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void saveBook(SaveBookRequest request){
        bookRepository.save(request.getBook());
    }

}

