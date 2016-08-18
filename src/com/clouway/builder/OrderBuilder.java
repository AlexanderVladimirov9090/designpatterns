package com.clouway.builder;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Martin Milev <martinmariusmilev@gmail.com>
 */
public class OrderBuilder {
  private Long orderId = 0000L;
  private String customerName = "name";
  private String customerAddress = "adress";
  private Date orderDate = new Date();
  private Date orderCreationDate = new Date();
  private Date orderDeliveryDate = new Date();
  private List<OrderItem> items = new LinkedList<>();

  public OrderBuilder orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

  public OrderBuilder customerName(String customerName) {
    this.customerName = customerName;
    return this;
  }

  public OrderBuilder customerAddress(String customerAddress) {
    this.customerAddress = customerAddress;
    return this;
  }

  public OrderBuilder orderDate(Date orderDate) {
    this.orderDate = orderDate;
    return this;
  }

  public OrderBuilder orderCreationDate(Date orderCreationDate) {
    this.orderCreationDate = orderCreationDate;
    return this;
  }

  public OrderBuilder orderDeliveryDate(Date orderDeliveryDate) {
    this.orderDeliveryDate = orderDeliveryDate;
    return this;
  }

  public OrderBuilder items(List<OrderItem> items) {
    this.items = items;
    return this;
  }

  public Long getOrderId() {
    return orderId;
  }

  public String getCustomerName() {
    return customerName;
  }

  public String getCustomerAddress() {
    return customerAddress;
  }

  public Date getOrderDate() {
    return orderDate;
  }

  public Date getOrderCreationDate() {
    return orderCreationDate;
  }

  public Date getOrderDeliveryDate() {
    return orderDeliveryDate;
  }

  public List<OrderItem> getItems() {
    return items;
  }

  public Order build() {
    return new Order(this);
  }
}
