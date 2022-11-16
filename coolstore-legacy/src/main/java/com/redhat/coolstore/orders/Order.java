package com.redhat.coolstore.orders;

import static java.math.BigDecimal.ZERO;
import static java.util.stream.Collectors.toList;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.function.Function;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.redhat.coolstore.customers.Customer;

public class Order {

    private Long id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy", timezone = "CET")
    private Date date;

    private Customer customer;

    private List<OrderItem> items;

    static Order of(final com.redhat.coolstore.entity.Order entity) {

        final Order order = new Order();
        order.setId(entity.getId());
        order.setDate(entity.getDate());
        order.setCustomer(Customer.of(entity.getCustomer()));
        order.setItems(entity.getItems().stream().map(OrderItem::of).collect(toList()));

        return order;
    }

    public BigDecimal getTotalAmmount() {

        if (items != null) {
            Function<OrderItem, BigDecimal> totalMapper =
                    item -> item.getPrice().multiply(new BigDecimal(item.getQuantity()));
            return items.stream().map(totalMapper).reduce(ZERO, BigDecimal::add);
        } else {
            return new BigDecimal(0);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }
}
