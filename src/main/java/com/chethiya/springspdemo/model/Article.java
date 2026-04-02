package com.chethiya.springspdemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "article")
public class Article extends BaseEntity{

    @Column(name = "article_title")
    private String articleTitle;
    @Column(name = "article_doi")
    private String articleDoi;
    @Column(name = "article_aid")
    private String articleAid;
    @Column(name = "state")
    private String state;

}
