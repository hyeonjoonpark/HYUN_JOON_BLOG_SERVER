package org.hyunjooon.blog.domain.comment.types;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Status {
    APPROVED("승인"),
    REJECT("거절"),
    WAITING("대기");

    private final String message;
}
