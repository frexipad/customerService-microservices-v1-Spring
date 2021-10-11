package com.frexdel.customer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequestDTO implements Serializable {
    private UUID id;
    private String name;
    private String email;
    private String password;

}

