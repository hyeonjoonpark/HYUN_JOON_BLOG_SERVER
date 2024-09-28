package org.hyunjooon.blog.domain.post.presentation;

import lombok.RequiredArgsConstructor;
import org.hyunjooon.blog.domain.post.presentation.dto.request.PostRequest;
import org.hyunjooon.blog.domain.post.presentation.dto.response.PostResponse;
import org.hyunjooon.blog.domain.post.service.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;
    // 게시물(post) 단일조회
    @GetMapping("/read")
    public PostResponse read() {
        return null;
    }

    // 게시물(post) 전체조회
    @GetMapping("/read/list")
    public List<PostResponse> reads() {
        return null;
    }

    // 게시물(post) 작성
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody PostRequest postRequest) {
        return null;
    }

    // 게시물(post) 수정
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(
            @PathVariable("id") Long id,
            @RequestBody PostRequest postRequest
    ) {
        return null;
    }

    // 게시물(post) 삭제
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        return null;
    }
}
