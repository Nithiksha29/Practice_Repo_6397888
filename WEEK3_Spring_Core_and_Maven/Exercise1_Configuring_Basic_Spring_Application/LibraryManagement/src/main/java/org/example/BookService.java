package org.example;

public class BookService {
    private BookRepo bookRepository;

    // Setter for dependency injection
    public void setBookRepository(BookRepo bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void showBooks() {
        System.out.println("BookService is calling the repository...");
        bookRepository.displayBooks();
    }
}
