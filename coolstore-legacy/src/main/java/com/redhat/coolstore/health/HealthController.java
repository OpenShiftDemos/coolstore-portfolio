package com.redhat.coolstore.health;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.redhat.coolstore.ResourceNotFoundException;
import com.redhat.coolstore.customers.CustomerRepository;

@RestController
@RequestMapping("/health")
public class HealthController {

    @Autowired
    private CustomerRepository repository;

    @GetMapping("/live")
    public String live() {

        return "live";
    }

    @GetMapping("/ready")
    public String ready() {

        repository.findById(1L).orElseThrow(ResourceNotFoundException::new);
        return "ready";
    }
}
