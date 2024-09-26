package org.hyunjooon.blog.domain.user;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hyunjooon.blog.domain.comment.Comment;
import org.hyunjooon.blog.domain.post.Post;

import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {
    @Id
    private String id;
    @Column(unique = true)
    private String email;
    @Size(max = 12, min = 2, message = "이름은 2~12자로 입력하세요")
    private String username;
    private String password;

    private String provider;
    private String providerId;

    private String role;

    @OneToMany(
            mappedBy = "user",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Post> posts = new ArrayList<>();

    public void addPost(Post post) {
        post.setUser(this);
        this.posts.add(post);
    }

    @OneToMany(
            mappedBy = "user",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Comment> comments = new ArrayList<>();

    public void addComment(Comment comment) {
        comment.setUser(this);
        this.comments.add(comment);
    }


    public User(String id, String email, String username, String password, String provider, String providerId, String role) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.password = password;
        this.provider = provider;
        this.providerId = providerId;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", provider='" + provider + '\'' +
                ", providerId='" + providerId + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
