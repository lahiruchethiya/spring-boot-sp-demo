package com.chethiya.springspdemo.controller;

import com.chethiya.springspdemo.model.Article;
import com.chethiya.springspdemo.service.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/article")
public class ArticleController {

    private final ArticleService service;

    @PostMapping("/create")
    public ResponseEntity<String> createArticle(@RequestBody Article article) {
        service.createArticle(article);
        return ResponseEntity.ok("New Article Created");
    }
}
