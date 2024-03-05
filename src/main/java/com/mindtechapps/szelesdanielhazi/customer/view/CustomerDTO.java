package com.mindtechapps.szelesdanielhazi.customer.view;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class CustomerDTO {
    @NotEmpty(message = "Username is required!")
    private String username;
    @NotEmpty(message = "Username is required!")
    private String password;
}
