package com.example.BookReviewProject.repository;

import com.example.BookReviewProject.entity.BookReview;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface BookReviewRepository extends CrudRepository<BookReview, Long> {
    @Override
    ArrayList<BookReview> findAll();
}
