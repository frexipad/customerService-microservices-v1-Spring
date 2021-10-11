package com.frexdel.customer.service;

import com.frexdel.customer.dao.CustomerRepository;
import com.frexdel.customer.dto.CustomerDto;
import com.frexdel.customer.dto.CustomerRequestDTO;
import com.frexdel.customer.dto.CustomerResponseDTO;
import com.frexdel.customer.entity.Customer;
import com.frexdel.customer.mapstruct.CustomerMapper;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    CustomerRepository customerRepository;
    CustomerMapper customerMapper;

    public CustomerServiceImpl(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    @Override
    public CustomerDto getCustomer(UUID id) {
        Customer customer= customerRepository.findById(id).get();
        return customerMapper.toDto(customer);
    }

    @Override
    public CustomerDto save(CustomerDto customerDto) {
        return customerMapper.toDto(customerRepository.save(customerMapper.toEntity(customerDto)));
    }

    @Override
    public List<CustomerDto> getCustomers() {
        List<Customer> customers= customerRepository.findAll();
        return customerMapper.toDto(customers);
    }

    @Override
    public CustomerDto update(CustomerDto customerDto) {
        Customer customer = customerMapper.toEntity(customerDto);
        Customer customerSaved = customerRepository.save(customer);
        return customerMapper.toDto(customerSaved);
    }
}
