package com.frexdel.customer.mapstruct;

import com.frexdel.customer.dto.CustomerDto;
import com.frexdel.customer.entity.Customer;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.UUID;

@Mapper(componentModel = "spring")
public interface CustomerMapper extends IEntityMapper<CustomerDto,Customer> {

    @Override
    CustomerDto toDto(Customer customer);

    @Override
    List<CustomerDto> toDto(List<Customer> customers);

    @Override
    Customer toEntity(CustomerDto customerDto);

    @Override
    List<Customer> toEntity(List<CustomerDto> customerDtos);

    @Override
    default Customer fromId(UUID id){
       if (id==null){
           return null;
       }
       Customer customer=new Customer();
       customer.setId(id);
       return customer;
    };
}
