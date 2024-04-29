package com.example.q1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.GunalanAuthor;
import com.example.q1.model.GunalanBook;
import com.example.q1.repository.GunalanAuthorRepository;
import com.example.q1.repository.GunalanBookRepository;

@Service
public class BookService {
    @Autowired
    private GunalanBookRepository bookRepository;
@Autowired
private GunalanAuthorRepository authorRepository;
    public GunalanBook saveBook(Long authorId, GunalanBook book) {
        GunalanAuthor author = authorRepository.findById(authorId).orElse(null);
        if (author != null) {
            book.setAuthor(author);
            author.getBooks().add(book);
            return bookRepository.save(book);
        }
        return null;
    }

    public GunalanBook getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}

