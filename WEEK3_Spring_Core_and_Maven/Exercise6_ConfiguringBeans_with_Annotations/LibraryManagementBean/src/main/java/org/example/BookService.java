package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepo bookRepository;

    public void displayBooks() {
        System.out.println("BookService: Requesting books from repository...");
        bookRepository.getAllBooks();
    }
}
