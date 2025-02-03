package com.example.serachBook.Repository;


import com.example.serachBook.Domain.Book;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository  extends JpaRepository<Book, Long>{

	 List<Book> findByTitleContainingIgnoreCase(String keyword);
}
