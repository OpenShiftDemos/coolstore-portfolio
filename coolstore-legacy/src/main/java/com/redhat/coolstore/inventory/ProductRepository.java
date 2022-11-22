package com.redhat.coolstore.inventory;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.redhat.coolstore.entity.Product;

interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
}
