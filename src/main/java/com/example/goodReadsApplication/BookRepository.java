package com.example.goodReadsApplication;
import java.util.*;


public interface BookRepository {
    ArrayList<Book> getBooks();
    Book getBookById(int bookId);
    Book addBook(Book book);
}
