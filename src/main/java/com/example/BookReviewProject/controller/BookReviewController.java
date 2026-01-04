package com.example.BookReviewProject.controller;

import com.example.BookReviewProject.dto.BookReviewForm;
import com.example.BookReviewProject.entity.BookReview;
import com.example.BookReviewProject.repository.BookReviewRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class BookReviewController {
    @Autowired
    private BookReviewRepository bookReviewRepository;

    // 1. 독서 감상평 작성 페이지로 이동
    @GetMapping("/reviews/new")
    public String newBookReviewForm() {
        return "reviews/new";
    }

    // 2. 폼 데이터를 받아 DB에 저장
    @PostMapping("/reviews/create")
    public String createBookReview(BookReviewForm form) {
        log.info(form.toString());

        // 1. DTO를 Entity로 변환
        BookReview bookReview = form.toEntity();
        log.info(bookReview.toString());

        // 2. Repository를 이용해 Entity를 DB에 저장
        BookReview saved = bookReviewRepository.save(bookReview);
        log.info(saved.toString());

        // 3. 저장 후 상세 페이지로 리다이렉트
        return "redirect:/reviews/" + saved.getId();
    }

    // 상세 조회
    @GetMapping("/reviews/{id}")
    public String show(@PathVariable Long id, Model model) {
        BookReview bookReviewEntity = bookReviewRepository.findById(id).orElse(null);
        model.addAttribute("bookReview", bookReviewEntity);
        return "reviews/show";
    }
}
