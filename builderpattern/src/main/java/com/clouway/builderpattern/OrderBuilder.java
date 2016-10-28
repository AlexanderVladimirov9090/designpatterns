package com.clouway.builderpattern;

import java.util.Date;
import java.util.List;

/**
 * Created by zumba on 19.10.16.
 *
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 */
class OrderBuilder {
    public Long orderId = 0L;
    public String customerName = "No name";
    public String customerAddress = "No address";
    public Date oderCreationDate = new Date(1000);
    public Date orderDeliveryDate = new Date(1000);
    public List<OrderItem> items = null;

    public OrderBuilder setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    public OrderBuilder setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public OrderBuilder setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
        return this;
    }

    public OrderBuilder setOderCreationDate(Date oderCreationDate) {
        this.oderCreationDate = oderCreationDate;
        return this;
    }

    public OrderBuilder setOrderDeliveryDate(Date orderDeliveryDate) {
        this.orderDeliveryDate = orderDeliveryDate;
        return this;
    }

    public OrderBuilder setItems(List<OrderItem> items) {
        this.items = items;
        return this;
    }


    public Order build() {
        return new Order(this);
    }
}
