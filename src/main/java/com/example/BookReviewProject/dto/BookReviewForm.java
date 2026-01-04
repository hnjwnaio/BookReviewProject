package com.example.BookReviewProject.dto;

import com.example.BookReviewProject.entity.BookReview;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@ToString
public class BookReviewForm {
    private Long id;
    private String title;
    private String author;
    private String content;
    private Integer rating;

    public BookReview toEntity() {
        return new BookReview(null, title, author, content, rating, null);
    }
}
