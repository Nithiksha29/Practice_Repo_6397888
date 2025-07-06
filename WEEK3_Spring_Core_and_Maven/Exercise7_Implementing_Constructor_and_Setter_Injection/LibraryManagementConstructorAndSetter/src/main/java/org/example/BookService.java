package org.example;

public class BookService {
    private String libraryName;
    private BookRepo bookRepository;

    // Constructor for constructor injection
    public BookService(String libraryName) {
        this.libraryName = libraryName;
    }

    // Setter for setter injection
    public void setBookRepository(BookRepo bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBooks() {
        System.out.println("Welcome to " + libraryName);
        bookRepository.getAllBooks();
    }
}
