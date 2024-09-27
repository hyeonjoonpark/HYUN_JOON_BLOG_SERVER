package org.hyunjooon.blog.domain.post.presentation.dto.request;

import lombok.Builder;

import java.io.Serializable;

/**
 * DTO for {@link org.hyunjooon.blog.domain.post.Post}
 */
@Builder
public record PostRequest(
        String title,
        String content
) implements Serializable {

}