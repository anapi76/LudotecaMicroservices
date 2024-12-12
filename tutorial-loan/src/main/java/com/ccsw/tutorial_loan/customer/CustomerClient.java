package com.ccsw.tutorial_loan.customer;

import com.ccsw.tutorial_loan.customer.model.CustomerDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "SPRING-CLOUD-EUREKA-CLIENT-CUSTOMER", url = "http://localhost:8080")
public interface CustomerClient {

    @GetMapping(value = "/customer")
    List<CustomerDto> findAll();
}
