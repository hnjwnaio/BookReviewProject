package com.example.BookReviewProject.dto;

import com.example.BookReviewProject.entity.BookReview;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@ToString
public class BookReviewForm {
    private Long id;
    private String title;
    private String author;
    private String content;
    private Integer rating;

    public BookReview toEntity() {
        return new BookReview(id, title, author, content, rating, null);
    }
}
