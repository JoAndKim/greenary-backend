package com.joandkim.greenery.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class PostContent {

    @Id
    @GeneratedValue
    private Long id;

    private String postImageUrl;
    private String content;

    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_post_content"))
    private Post post;
}
