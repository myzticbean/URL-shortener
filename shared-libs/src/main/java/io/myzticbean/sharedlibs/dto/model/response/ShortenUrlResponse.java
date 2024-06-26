package io.myzticbean.sharedlibs.dto.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter @AllArgsConstructor
public class ShortenUrlResponse {

    private String shortenedUrlShortcode;
    private LocalDateTime createdAt;
    private LocalDateTime expiresOn;
    private String errorMessage;

}
