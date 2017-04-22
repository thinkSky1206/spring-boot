package com.liuwp.model;

import org.springframework.data.elasticsearch.annotations.Document;

/**
 * Author: liuwuping
 * Date: 17/4/22
 * Description:
 */
@Document(indexName = "test", type = "blog")
public class Blog {
    private Long id;
    private String title;
    private String author;
    private String content;

    public Blog() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
