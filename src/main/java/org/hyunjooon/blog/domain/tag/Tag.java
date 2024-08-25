package org.hyunjooon.blog.domain.tag;

import jakarta.persistence.*;
import lombok.*;
import org.hyunjooon.blog.domain.post.Post;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tag_id" )
    private Long id;
    private String tag;

    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;

    @Builder
    public Tag(String tag) {
        this.tag = tag;
    }
}
