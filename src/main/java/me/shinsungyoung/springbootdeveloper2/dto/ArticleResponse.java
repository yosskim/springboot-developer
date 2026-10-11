package me.shinsungyoung.springbootdeveloper2.dto;

import lombok.Getter;
import me.shinsungyoung.springbootdeveloper2.domain.Article;

@Getter
public class ArticleResponse {

    private final String title;
    private final String content;
    private final String imageUrl;

    public ArticleResponse(Article article) {
        this.title = article.getTitle();
        this.content = article.getContent();
        this.imageUrl = article.getImageUrl();
    }
}
