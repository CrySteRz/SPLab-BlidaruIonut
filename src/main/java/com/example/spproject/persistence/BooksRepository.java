package com.example.spproject.persistence;

import com.example.spproject.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends JpaRepository<Book, Long> {


}