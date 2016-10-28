package com.clouway.builderpattern;

import java.util.Date;
import java.util.List;

/**
 * Created by zumba on 19.10.16.
 *
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 */
public final class Order {
    private Long orderId;
    private String customerName;
    private String customerAddress;
    private Date orderCreationDate;
    private Date orderDeliveryDate;
    private List<OrderItem> items;

    Order(OrderBuilder orderBuilder) {
        this.orderId = orderBuilder.orderId;
        this.customerName = orderBuilder.customerName;
        this.customerAddress = orderBuilder.customerAddress;
        this.orderCreationDate = orderBuilder.oderCreationDate;
        this.orderDeliveryDate = orderBuilder.orderDeliveryDate;
        this.items = orderBuilder.items;
    }

    /**
     * Gets order Id.
      * @return
     */
    public Long getOrderId(){
        return orderId;
    }

    /**
     * Gets customer Name.
     * @return
     */
    public String getCustomerName(){
        return customerName;
    }

    /**
     * Gets Customer Address.
     * @return
     */
    public String getCustomerAddress(){
        return customerAddress;
    }

    /**
     * Gets Order Creation Date.
     * @return
     */
    public Date getOrderCreationDate(){
        return orderCreationDate;
    }

    /**
     * Gets Order Delivery Date.
     * @return
     */
    public Date getOrderDeliveryDate(){
        return orderDeliveryDate;
    }

    /**
     * Gets Items.
     * @return
     */
    public List<OrderItem> getItems(){
        return items;
    }
}