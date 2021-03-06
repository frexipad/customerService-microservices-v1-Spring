package com.frexdel.customer.dto;

import com.frexdel.customer.CustomerApplication;
import com.frexdel.customer.entity.Customer;
import com.frexdel.customer.mapstruct.CustomerMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;
@Slf4j
@SpringBootTest(classes = CustomerApplication.class)
@ExtendWith(SpringExtension.class)
public class ShouldMapCarToDto {

    @Autowired
    CustomerMapper customerMapper;

    @Test
    public void shouldMapCarToDto() {
        //given
        Customer customer = new Customer( null,"1234","1234","1234");

        //when
        CustomerDto customerDto = customerMapper.toDto( customer );

        //then
        assertThat( customer ).isNotNull();
        assertThat( customerDto.getEmail() ).isEqualTo( "1234" );
        assertThat( customerDto.getName() ).isEqualTo( "1234" );
        log.info("Test Seccess ");

    }
    @Test
    public void shouldMapCarToDtoFailure() {
        //given
        Customer customer = new Customer( null,"1234","1234","1234");

        //when
        CustomerDto customerDto = customerMapper.toDto( customer );

        //then
        assertThat( customer ).isNotNull();
        assertThat( customerDto.getEmail() ).isNotEqualTo( "12344" );
        assertThat( customerDto.getName() ).isNotEqualTo( "12344" );
        log.info("Test Seccess ");

    }

}
