package com.shamil.cards.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.annotation.Fallback;
import org.springframework.http.HttpStatusCode;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ErrorResponseDto {

    private String apiPath;

    private HttpStatusCode errorCode;

    private String errorMessage;

    private LocalDateTime errorTime;

}
