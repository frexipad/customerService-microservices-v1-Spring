package com.frexdel.customer;

import com.frexdel.customer.dao.CustomerRepository;
import com.frexdel.customer.entity.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class CustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(CustomerRepository customerRepository){
		return args -> {
			customerRepository.save(new Customer(UUID.randomUUID(),"Iboudaaten","email","1234"));
			customerRepository.save(new Customer(UUID.randomUUID(),"Iboudaaten","email","1234"));
			customerRepository.save(new Customer(UUID.randomUUID(),"Iboudaaten","email","1234"));
			customerRepository.save(new Customer(UUID.randomUUID(),"Iboudaaten","email","1234"));
			customerRepository.save(new Customer(UUID.randomUUID(),"Iboudaaten","email","1234"));
		};
	}

}
