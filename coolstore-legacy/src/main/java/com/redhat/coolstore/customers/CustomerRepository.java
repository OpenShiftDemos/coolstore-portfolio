package com.redhat.coolstore.customers;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.redhat.coolstore.entity.Customer;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
}
