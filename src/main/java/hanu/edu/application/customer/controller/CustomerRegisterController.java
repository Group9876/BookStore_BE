package hanu.edu.application.customer.controller;

import hanu.edu.domain.customer.model.Customer;
import hanu.edu.domain.customer.service.CustomerResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRegisterController {

    @Autowired
    CustomerResourceService customerResourceService;

    @PostMapping(value = "/register")
    public ResponseEntity<String> register(@RequestBody Customer customer) {
        customerResourceService.create(customer);
        return new ResponseEntity<>("User registered successfully!", HttpStatus.CREATED);
    }
}

