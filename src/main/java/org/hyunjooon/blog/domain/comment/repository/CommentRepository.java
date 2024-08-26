package org.hyunjooon.blog.domain.comment.repository;

import org.hyunjooon.blog.domain.comment.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
