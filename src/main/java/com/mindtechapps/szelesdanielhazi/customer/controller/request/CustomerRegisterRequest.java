package com.mindtechapps.szelesdanielhazi.customer.controller.request;

import com.mindtechapps.szelesdanielhazi.customer.view.CustomerDTO;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CustomerRegisterRequest {
    @NotNull(message = "Customer is not provided")
    private CustomerDTO customer;
}
