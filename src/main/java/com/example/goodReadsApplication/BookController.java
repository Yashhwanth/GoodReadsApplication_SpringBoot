package com.example.goodReadsApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.goodReadsApplication.BookService;
import java.util.*;

@RestController
public class BookController {
    BookService bookService = new BookService();
    @GetMapping("/books")
    public ArrayList<Book> getBooks(){
        return bookService.getBooks();
    }
}
