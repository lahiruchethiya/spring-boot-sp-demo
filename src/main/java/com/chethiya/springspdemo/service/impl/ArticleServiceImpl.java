package com.chethiya.springspdemo.service.impl;

import com.chethiya.springspdemo.model.Article;
import com.chethiya.springspdemo.repository_writer.ArticleWriterRepository;
import com.chethiya.springspdemo.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {

    private final ArticleWriterRepository writerRepository;

    @Override
    public void createArticle(Article article) {
        article.setState("new");
        article.setCreated(OffsetDateTime.now());
        article.setModified(OffsetDateTime.now());

        writerRepository.save(article);

    }
}
