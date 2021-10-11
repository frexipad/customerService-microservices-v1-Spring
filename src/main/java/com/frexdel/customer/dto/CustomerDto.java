package com.frexdel.customer.dto;

import lombok.Data;

import java.util.UUID;
@Data
public class CustomerDto {
    private UUID id;
    private String name;
    private String email;
    private String password;
}
