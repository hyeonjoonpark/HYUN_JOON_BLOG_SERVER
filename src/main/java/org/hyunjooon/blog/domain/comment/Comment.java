package org.hyunjooon.blog.domain.comment;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Comment {
    @Id
    private Long id;
}
