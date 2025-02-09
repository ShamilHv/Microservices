package com.shamil.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Schema(
        name="Error Response",
        description = "Schema to hold Error Response information"
)
public class ErrorResponseDto {

    @Schema(
        description = "Api path invoked by the client"
    )
    private String apiPath;

    @Schema(
            description = "Error code representing the error"
    )
    private HttpStatus errorCode;

    @Schema(
            description = "Error message representing the error"
    )
    private String errorMessage;

    @Schema(
            description = "Time representing when the error happened"
    )
    private LocalDateTime errorTime;

}
