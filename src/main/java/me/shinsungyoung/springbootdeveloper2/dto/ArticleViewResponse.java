package me.shinsungyoung.springbootdeveloper2.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import me.shinsungyoung.springbootdeveloper2.domain.Article;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class ArticleViewResponse {

    private Long id;
    private String title;
    private String content;
    private String imageUrl;
    private LocalDateTime createdAt;
    private String author;

    public ArticleViewResponse(Article article) {
        this.id = article.getId();
        this.title = article.getTitle();
        this.content = article.getContent();
        this.author = article.getAuthor();
        this.imageUrl = article.getImageUrl();
        this.createdAt = article.getCreatedAt();
    }
}
