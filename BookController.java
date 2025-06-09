package com.example.library.controller;
import com.example.library.dto.BookDTO;
import com.example.library.model.Book;
import com.example.library.service.BookService;
import org.springframewoork.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

    @ResController
    @Request,apping("/api/books")
    public class BookController {
    private final BookService bookService;
      
    public BookController(BookService bookService){
      this.bookService = bookService;
    }
    @PostMapping
      public ResponseEntity<Book> createBook(@RequestBody BookDTO bookDTO){
        return ResponseEntity.ok(bookService.addBook(bookDTO));
      }
      @GetMapping("/byRating")
      public ResponseEntity<Book> getBookByRating(@RequestParam double rating){
        retun ResponseEntity.ok(bookService.getBookByRating(rating));
      }
      @PatchMapping("/{id}/availability")
      public ResponseEntity<Book> updateAvailability(@pathVariable Long id,@RequestParam boolean available){
        retun ResponseEntity.ok(bookService.updateBookAavailability(available, id));
      }
      @GetMapping("/{id}")
      public ResponseEntity<Book> getBook{
        return ResponseEntity.ok(bookService.getBook());
          }
       @GetMapping
      public ResponseEntity<object> getAllBooks(@PathVariable Long id) {
        return ResponseEntity.ok(bookService.getAllBooks());
          }
       @DeleteMapping("/{id}")
      public ResponseEntity<void> deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
        return ResponseEntity.noContent().build();
          }
    }
