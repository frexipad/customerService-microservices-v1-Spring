package com.frexdel.customer.mapstruct;

import com.frexdel.customer.dto.CustomerRequestDTO;
import com.frexdel.customer.dto.CustomerResponseDTO;
import com.frexdel.customer.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CustomerMapper {


    CustomerRequestDTO customerToRequestDTO(Customer customer);
    Customer requestDTOtoCustomer (CustomerResponseDTO customerResponseDTO);
}
