package com.mindtechapps.szelesdanielhazi.customer.controller;

import com.mindtechapps.szelesdanielhazi.customer.controller.request.CustomerRegisterRequest;
import com.mindtechapps.szelesdanielhazi.customer.view.CustomerDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "auth")
public class AuthenticationController {
    private CustomerService service;

    public AuthenticationController(CustomerService service) {
        this.service = service;
    }

    @PostMapping(path = "/login")
    public ResponseEntity<?> login(final @RequestParam String uname, final @RequestParam String pword) {
        try {
            CustomerDTO loginEntity = service.login(uname, pword);
            return ResponseEntity.ok(loginEntity);
        } catch (BadCredentialsException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @PostMapping(path = "/register")
    public ResponseEntity<?> register(final @RequestBody CustomerRegisterRequest request) {
        try {
            CustomerDTO loginEntity = service.register(request);
            return ResponseEntity.ok(loginEntity);
        } catch (BadCredentialsException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
}
