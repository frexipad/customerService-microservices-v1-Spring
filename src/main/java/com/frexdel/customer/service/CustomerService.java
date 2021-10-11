package com.frexdel.customer.service;

import com.frexdel.customer.dto.CustomerDto;
import com.frexdel.customer.dto.CustomerRequestDTO;
import com.frexdel.customer.dto.CustomerResponseDTO;

import java.util.List;
import java.util.UUID;

/**
 *
 */
public interface CustomerService {

    CustomerDto getCustomer(UUID id);
    CustomerDto save(CustomerDto customerDto);
    List<CustomerDto> getCustomers();
    CustomerDto update(CustomerDto customerDto);

}
