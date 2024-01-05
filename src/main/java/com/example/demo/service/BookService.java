package com.example.demo.service;

import com.example.demo.model.Book;

import java.util.HashSet;

public interface BookService {

    HashSet<Book> findAllBook();
    Book findBookByID(long id);
    void addBook(Book b);
    void deleteAllData();
}
