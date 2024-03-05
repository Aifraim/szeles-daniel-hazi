package com.mindtechapps.szelesdanielhazi.customer.model;

import com.mindtechapps.szelesdanielhazi.customer.view.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    CustomerDTO entityToData(CustomerBE entity);
}
