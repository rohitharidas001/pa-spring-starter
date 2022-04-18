package com.galvanize.tmo.paspringstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class LibraryController {


    @Autowired
    LibraryRepository libraryRepository;

    @GetMapping("/health")
    public String health() {
        return "Success";
    }

    @PostMapping("/api/books")
    public ResponseEntity<?> createABook(@RequestBody Book book) {
        Book result = libraryRepository.save(book);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    @GetMapping("/api/books")
    public ResponseEntity<?> getAllBooks() {
        List<Book> result = (List<Book>) libraryRepository.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @DeleteMapping("/api/books")
    public ResponseEntity<?> deleteAllBooks() {
        libraryRepository.deleteAll();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
