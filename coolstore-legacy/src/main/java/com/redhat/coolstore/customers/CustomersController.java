package com.redhat.coolstore.customers;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.redhat.coolstore.ResourceNotFoundException;

@RestController
@RequestMapping("/customers")
public class CustomersController {

    @Autowired
    private CustomerRepository repository;

    @GetMapping(value = "/{id}", produces = APPLICATION_JSON_VALUE)
    public Customer getById(@PathVariable("id") final Long id) {

        return Customer.of(
            repository.findById(id).orElseThrow(ResourceNotFoundException::new)
        );
    }

    @RequestMapping
    public Page<Customer> findAll(final Pageable pageable) {

        return repository.findAll(pageable).map(Customer::of);
    }
}
