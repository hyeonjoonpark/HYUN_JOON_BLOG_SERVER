package org.hyunjooon.blog.domain.post;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hyunjooon.blog.domain.comment.Comment;
import org.hyunjooon.blog.domain.tag.Tag;
import org.hyunjooon.blog.domain.user.User;
import org.hyunjooon.blog.global.common.entity.BaseTime;

import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(
        indexes = {
                @Index(name = "idx_post_title", columnList = "title"),
                @Index(name = "idx_post_content", columnList = "content"),
                @Index(name = "idx_post_tag", columnList = "tags")
        }
)
public class Post extends BaseTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "blog_id" )
    private Long id;

    @Column(length = 50, nullable = false)
    private String title;
    @Column(columnDefinition = "TEXT", length = 1000)
    private String content;

    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_writer")
    private User user;

    @OneToMany(
            mappedBy = "post",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @Setter
    private List<Tag> tags;

    public void addTags(Tag tag) {
        tag.setPost(this);
        this.tags.add(tag);
    }

    @OneToMany(
            mappedBy = "post",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private  List<Comment> comments;

    public void addComment(Comment comment) {
        comment.setPost(this);
        this.comments.add(comment);
    }

    @ColumnDefault("0")
    private int viewCount;
    @ColumnDefault("0")
    private int likeCount;

    @Builder
    public Post(String title, String content, int viewCount, int likeCount) {
        this.title = title;
        this.content = content;
        this.viewCount = viewCount;
        this.likeCount = likeCount;
    }
}
