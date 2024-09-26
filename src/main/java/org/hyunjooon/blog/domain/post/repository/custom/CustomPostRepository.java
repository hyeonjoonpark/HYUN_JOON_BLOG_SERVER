package org.hyunjooon.blog.domain.post.repository.custom;

import org.hyunjooon.blog.domain.post.Post;

public interface CustomPostRepository {
    Post findByTitle(String title);
}
