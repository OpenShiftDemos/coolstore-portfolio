package com.redhat.coolstore.orders;

import java.math.BigDecimal;
import com.redhat.coolstore.inventory.Product;

public class OrderItem {

    private Integer quantity;

    private BigDecimal price;

    private Product product;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Product getProduct() {
        return this.product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    static OrderItem of(final com.redhat.coolstore.entity.OrderItem entity) {

        final OrderItem orderItem = new OrderItem();
        orderItem.setPrice(entity.getPrice());
        orderItem.setQuantity(entity.getQuantity());
        orderItem.setProduct(Product.of(entity.getProduct()));

        return orderItem;
    }
}
