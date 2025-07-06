package org.example;

public class BookService {
    private BookRepo bookRepository;

    // Setter for dependency injection
    public void setBookRepository(BookRepo bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBooks() {
        System.out.println("BookService: Fetching books...");
        bookRepository.getAllBooks();
    }
}
