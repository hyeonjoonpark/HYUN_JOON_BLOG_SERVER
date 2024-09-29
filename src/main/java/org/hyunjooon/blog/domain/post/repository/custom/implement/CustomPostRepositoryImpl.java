package org.hyunjooon.blog.domain.post.repository.custom.implement;

import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.hyunjooon.blog.domain.post.Post;
import org.hyunjooon.blog.domain.post.repository.custom.CustomPostRepository;
import org.springframework.stereotype.Repository;

import static org.hyunjooon.blog.domain.post.QPost.post;

@Repository
@RequiredArgsConstructor
public class CustomPostRepositoryImpl implements CustomPostRepository {
    private final JPAQueryFactory jpaQueryFactory;
}
