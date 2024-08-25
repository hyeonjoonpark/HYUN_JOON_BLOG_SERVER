package org.hyunjooon.blog.domain.comment;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hyunjooon.blog.domain.post.Post;
import org.hyunjooon.blog.domain.user.User;
import org.hyunjooon.blog.global.common.entity.BaseTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Comment extends BaseTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id" )
    private Long id;

    @Column(length = 200)
    private String comment;

    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private Post post;

    @ColumnDefault("0")
    private int commentLike;

    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comment_writer")
    private User user;

    @Builder
    public Comment(String comment, int commentLike) {
        this.comment = comment;
        this.commentLike = commentLike;
    }
}
