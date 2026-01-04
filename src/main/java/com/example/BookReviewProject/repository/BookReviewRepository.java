package com.example.BookReviewProject.repository;

import com.example.BookReviewProject.entity.BookReview;
import org.springframework.data.repository.CrudRepository;

public interface BookReviewRepository extends CrudRepository<BookReview, Long> {
}
