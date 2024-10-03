package org.hyunjooon.blog.domain.post.presentation.dto.response;

import jakarta.validation.constraints.Min;
import lombok.Builder;
import org.hyunjooon.blog.domain.tag.Tag;
import org.hyunjooon.blog.domain.user.User;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * DTO for {@link org.hyunjooon.blog.domain.post.Post}
 */
@Builder
public record PostResponse(
        LocalDateTime createdDate,
        Long id,
        String title,
        String content,
        User user,
        List<Tag> tags,
        @Min(0) int viewCount,
        @Min(0) int likeCount
) implements Serializable {

}