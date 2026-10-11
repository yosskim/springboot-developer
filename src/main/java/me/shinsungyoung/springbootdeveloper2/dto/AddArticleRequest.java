package me.shinsungyoung.springbootdeveloper2.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.shinsungyoung.springbootdeveloper2.domain.Article;

@NoArgsConstructor // 기본 생성자 추가
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자 추가
@Getter
public class AddArticleRequest {

    private String title;
    private String content;
    private String imageUrl;

    public AddArticleRequest(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Article toEntity(String author) { // 생성자를 사용해 객체 생성
        return Article.builder()
                .title(title)
                .content(content)
                .author(author)
                .imageUrl(imageUrl)
                .build();
    }

}
