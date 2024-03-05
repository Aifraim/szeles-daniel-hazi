package com.mindtechapps.szelesdanielhazi.customer.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerBE, Long> {

    Optional<CustomerBE> findCustomerByUsernameAndPassword(String username, String password);
}
