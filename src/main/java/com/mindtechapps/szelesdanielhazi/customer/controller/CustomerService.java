package com.mindtechapps.szelesdanielhazi.customer.controller;

import com.mindtechapps.szelesdanielhazi.customer.controller.request.CustomerRegisterRequest;
import com.mindtechapps.szelesdanielhazi.customer.model.CustomerBE;
import com.mindtechapps.szelesdanielhazi.customer.model.CustomerMapper;
import com.mindtechapps.szelesdanielhazi.customer.model.CustomerRepository;
import com.mindtechapps.szelesdanielhazi.customer.view.CustomerDTO;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerMapper mapper;
    private final CustomerRepository repository;

    public CustomerService(CustomerMapper mapper, CustomerRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    /**
     * This method looks up the database for a user which matches the provided
     * credentials stored in {@param uname} and {@param pword}.
     *
     * @param uname - The username from the request
     * @param pword - The password from the request
     * @return The found user stored in a {@link CustomerDTO} object.
     */
    public CustomerDTO login(final String uname, final String pword) {
        CustomerBE user = repository.findCustomerByUsernameAndPassword(uname, pword)
                .orElseThrow(() -> new BadCredentialsException("Invalid username or password"));

        return mapper.entityToData(user);
    }

    /**
     * @param request
     * @return
     */
    public CustomerDTO register(final CustomerRegisterRequest request) {
        CustomerBE userToSave = new CustomerBE();
        userToSave.setUsername(request.getCustomer().getUsername());
        userToSave.setPassword(request.getCustomer().getPassword());

        CustomerBE user = repository.save(userToSave);

        return mapper.entityToData(user);
    }
}
