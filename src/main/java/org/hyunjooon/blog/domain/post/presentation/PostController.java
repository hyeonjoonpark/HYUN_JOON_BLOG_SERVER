package org.hyunjooon.blog.domain.post.presentation;

import lombok.RequiredArgsConstructor;
import org.hyunjooon.blog.domain.post.presentation.dto.request.PostRequest;
import org.hyunjooon.blog.domain.post.presentation.dto.response.PostResponse;
import org.hyunjooon.blog.domain.post.service.PostService;
import org.springframework.data.domain.Slice;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;
    // 게시물(post) 단일조회
    @GetMapping("/read/{userId}/{blogId}")
    public PostResponse read(
            @PathVariable String userId,
            @PathVariable("blogId") Long blogId
    ) {
        return postService.getPost(userId, blogId);
    }

    // 게시물(post) 전체조회
    @GetMapping("/read/list/{userId}")
    public Slice<PostResponse> reads(@PathVariable String userId) {
        return postService.getPosts(userId);
    }

    // 게시물(post) 작성
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody PostRequest postRequest) {
        return postService.createPost(postRequest);
    }

    // 게시물(post) 수정
    @PutMapping("/update/{userId}/{blogId}")
    public ResponseEntity<?> update(
            @PathVariable("userId") String userId,
            @PathVariable("blogId") Long blogId,
            @RequestBody PostRequest postRequest
    ) {
        return postService.updatePost(userId, blogId, postRequest);
    }

    // 게시물(post) 삭제
    @DeleteMapping("/delete/{userId}/{blogId}")
    public ResponseEntity<?> delete(
            @PathVariable("userId") String userId,
            @PathVariable("blogId") Long blogId
    ) {
        return postService.deletePost(userId, blogId);
    }
}
