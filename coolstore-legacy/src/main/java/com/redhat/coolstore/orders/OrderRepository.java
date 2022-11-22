package com.redhat.coolstore.orders;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.redhat.coolstore.entity.Order;

interface OrderRepository extends PagingAndSortingRepository<Order, Long> {
}
