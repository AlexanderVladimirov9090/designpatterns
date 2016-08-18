package com.clouway.builder;

/**
 * @author Martin Milev <martinmariusmilev@gmail.com>
 */
public final class OrderItem {
  private String productName;
  private String measureUnit;
  private Double quantity;
  private Double price;

  public OrderItem(ItemBuilder builder) {
    this.productName = builder.getProductName();
    this.measureUnit = builder.getMeasureUnit();
    this.quantity = builder.getQuantity();
    this.price = builder.getPrice();
  }

  @Override
  public String toString() {
    return "OrderItem{" +
            "productName='" + productName + '\'' +
            ", measureUnit='" + measureUnit + '\'' +
            ", quantity=" + quantity +
            ", price=" + price +
            '}';
  }
}