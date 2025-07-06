package org.example;


import org.springframework.stereotype.Repository;

@Repository
public class BookRepo {
    public void getAllBooks() {
        System.out.println("BookRepository: Fetching all books.");
    }
}
