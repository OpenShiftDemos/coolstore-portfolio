package com.redhat.coolstore.orders;

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
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderRepository repository;

    @GetMapping(value = "/{id}", produces = APPLICATION_JSON_VALUE)
    public Order getById(@PathVariable("id") Long id) {

        return Order.of(
            repository.findById(id).orElseThrow(ResourceNotFoundException::new)
        );
    }

    @RequestMapping
    public Page<Order> findAll(Pageable pageable) {

        return repository.findAll(pageable).map(Order::of);
    }
}
