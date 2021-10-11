package com.frexdel.customer.web;


import com.frexdel.customer.dto.CustomerDto;
import org.springframework.web.bind.annotation.*;
import com.frexdel.customer.service.CustomerService;
import java.util.List;
import java.util.UUID;

@RestController
public class CustomerWeb {
    CustomerService customerService;

    public CustomerWeb(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    List<CustomerDto> customers(){
        return customerService.getCustomers();
    }

    @GetMapping("/customer")
    public CustomerDto getCustomerByID(@RequestParam() UUID uuid){
        return customerService.getCustomer(uuid);
    }

    @PostMapping("/customer")
    public CustomerDto saveCustomer(@RequestBody CustomerDto customerDto){
        return customerService.save(customerDto);
    }
}
