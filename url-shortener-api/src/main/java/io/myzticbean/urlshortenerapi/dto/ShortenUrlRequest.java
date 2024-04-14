package io.myzticbean.urlshortenerapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class ShortenUrlRequest {

    private String urlToForward;
    private Long expiryDays;

}