package com.example.goodReadsApplication;
import java.util.*;
import com.example.goodReadsApplication.BookRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;


public class BookService implements BookRepository{
    private HashMap<Integer, Book> hmap = new HashMap<>();
    int uniqueId = 3;
    public BookService(){
        Book b1 = new Book(1, "Harry Potter", "harry_potter.jpg");
        Book b2 = new Book(2, "Rise", "rise.jpg");
        hmap.put(b1.getId(), b1);
        hmap.put(b2.getId(), b2);
    }
    @Override
    public ArrayList<Book> getBooks(){
        Collection<Book> bookCollection = hmap.values();
        ArrayList<Book> books = new ArrayList<>(bookCollection);
        return books;
    }
    @Override
    public Book getBookById(int bookId){
        Book book = hmap.get(bookId);
        if(book == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        return book;
    }
    @Override
    public Book addBook(Book book){
        book.setId(uniqueId);
        hmap.put(uniqueId, book);
        uniqueId ++;
        return book;
    }
}
