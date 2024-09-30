package org.hyunjooon.blog.domain.post.service;

import lombok.RequiredArgsConstructor;
import org.hyunjooon.blog.domain.post.presentation.dto.response.PostResponse;
import org.hyunjooon.blog.domain.post.repository.PostRepository;
import org.springframework.data.domain.Slice;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;
    @Transactional(readOnly = true, rollbackFor = Exception.class)
    public PostResponse getPost() {
        return null;
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    public Slice<PostResponse> getPosts() {
        return null;
    }

    @Transactional(rollbackFor = Exception.class)
    public ResponseEntity<?> createPost() {
        return null;
    }

    @Transactional(rollbackFor = Exception.class)
    public ResponseEntity<?> updatePost() {
        return null;
    }

    @Transactional(rollbackFor = Exception.class)
    public ResponseEntity<?> deletePost() {
        return null;
    }
}
