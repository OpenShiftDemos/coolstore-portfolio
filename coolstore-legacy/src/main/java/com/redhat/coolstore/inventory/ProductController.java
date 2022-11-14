package com.redhat.coolstore.inventory;

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
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @GetMapping(value = "/{id}", produces = APPLICATION_JSON_VALUE)
    public Product getById(@PathVariable("id") Long id) {

        return Product.of(
            repository.findById(id).orElseThrow(ResourceNotFoundException::new)
        );
    }

    @RequestMapping
    public Page<Product> findAll(Pageable pageable){

        return repository.findAll(pageable).map(Product::of);
    }
}
