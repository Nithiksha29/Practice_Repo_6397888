package org.example;

import org.springframework.stereotype.Service;

@Service
public class BookService {
    public void issueBook() {
        System.out.println("BookService: Issuing a book...");
    }

    public void returnBook() {
        System.out.println("BookService: Returning a book...");
    }
}
