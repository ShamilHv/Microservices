package com.shamil.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name="Customer",
        description = "Schema to hold Customer and Account information"
)
public class CustomerDto {

    @Schema(
            description = "Name of the customer", example = "Shamil"
    )
    @NotEmpty(message = "Name should not be empty")
    @Size(min=5, max=25, message = "Name should be between 5 and 25 characters")
    private String name;

    @Schema(
            description = "Email address of the customer", example="shamil@mail.com"
    )
    @NotEmpty(message = "Email should not be empty")
    @Email(message = "Email should be valid")
    private String email;

    @Schema(
            description = "Mobile number of the customer", example = "12345"
    )
    @Pattern(regexp = "^[0-9]{5}$", message = "Mobile number should be of 5 digits")
    private String mobileNumber;

    @Schema(
            description = "Account details of the customer"
    )
    private AccountsDto accountsDto;

}
