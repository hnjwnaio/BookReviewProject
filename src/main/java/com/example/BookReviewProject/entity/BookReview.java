package com.example.BookReviewProject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EntityListeners(AuditingEntityListener.class) // 생성시간 자동 기록
public class BookReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id 자동 생성
    private Long id;

    @Column(nullable = false) // 제목은 비어있으면 안됨
    private String title;

    @Column
    private String author;

    @Column(columnDefinition = "TEXT") // 긴 텍스트 저장 가능하게
    private String content;

    @Column
    private Integer rating;

    @CreatedDate // 엔티티가 생성될 때 시간이 자동으로 저장됨
    @Column(updatable = false)
    private LocalDateTime createdAt;
}
