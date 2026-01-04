package com.example.BookReviewProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // CreatedDate 작동
@SpringBootApplication
public class BookReviewProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookReviewProjectApplication.class, args);
	}

}
