package com.example.Library.Management.repository;


import com.example.Library.Management.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Long> {
}