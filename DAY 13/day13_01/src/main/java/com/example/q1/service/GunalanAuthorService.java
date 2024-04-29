package com.example.q1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.q1.model.GunalanAuthor;
import com.example.q1.repository.GunalanAuthorRepository;

@Service
public class GunalanAuthorService {
    @Autowired
    private GunalanAuthorRepository authorRepository;

    public GunalanAuthor saveAuthor(GunalanAuthor author) {
        return authorRepository.save(author);
    }

    public GunalanAuthor getAuthorById(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    public List<GunalanAuthor> getAllAuthors() {
        return authorRepository.findAll();
    }

    public GunalanAuthor updateAuthor(Long id, GunalanAuthor author) {
        GunalanAuthor existingAuthor = authorRepository.findById(id).orElse(null);
        if (existingAuthor != null) {
            existingAuthor.setEmail(author.getEmail());
            existingAuthor.setPhoneNumber(author.getPhoneNumber());
            existingAuthor.setAddress(author.getAddress());
            return authorRepository.save(existingAuthor);
        }
        return null;
    }

    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
