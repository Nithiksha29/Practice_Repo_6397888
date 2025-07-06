package com.example.Library.Management.controller;

import com.example.Library.Management.model.Book;
import com.example.Library.Management.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/books")
    public class BookController {

        @Autowired
        private BookRepo bookRepository;

        @GetMapping
        public List<Book> getAllBooks() {
            return bookRepository.findAll();
        }

        @PostMapping
        public Book addBook(@RequestBody Book book) {
            return bookRepository.save(book);
        }

        @GetMapping("/{id}")
        public Book getBookById(@PathVariable Long id) {
            return bookRepository.findById(id).orElse(null);
        }

        @PutMapping("/{id}")
        public Book updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
            return bookRepository.findById(id).map(book -> {
                book.setTitle(updatedBook.getTitle());
                book.setAuthor(updatedBook.getAuthor());
                return bookRepository.save(book);
            }).orElse(null);
        }

        @DeleteMapping("/{id}")
        public void deleteBook(@PathVariable Long id) {
            bookRepository.deleteById(id);
        }
    }


