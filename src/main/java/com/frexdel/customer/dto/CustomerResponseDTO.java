package com.frexdel.customer.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Data
public class CustomerResponseDTO implements Serializable {
    private UUID id;
    private String name;
    private String email;
    private String password;

}

