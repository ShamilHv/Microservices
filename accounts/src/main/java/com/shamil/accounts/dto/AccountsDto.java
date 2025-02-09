package com.shamil.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jdk.jfr.DataAmount;
import lombok.Data;

@Data
@Schema(
        name="Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {

    @Schema(
            description = "Account number of the customer ",
            example = "3453454534"
    )
    @NotEmpty(message = "Account number should not be empty")
    @Pattern(regexp = "^[0-9]{10}$", message = "Mobile number should be of 10 digits")
    private Long accountNumber;

    @Schema(
            description ="Account type of the account",
            example="Savings"
    )
    @NotEmpty(message = "Account type should not be empty")
    private String accountType;

    @Schema(
            description = "Branch Address",
            example = "1001 Baku"
    )
    @NotEmpty(message = "Branch address should not be empty")
    private String branchAddress;

}
