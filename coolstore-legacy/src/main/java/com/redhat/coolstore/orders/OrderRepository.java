package com.redhat.coolstore.orders;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.redhat.coolstore.entity.Order;

public interface OrderRepository extends PagingAndSortingRepository<Order, Long> {
}
