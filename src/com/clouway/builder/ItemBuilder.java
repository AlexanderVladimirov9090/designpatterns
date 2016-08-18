package com.clouway.builder;

/**
 * @author Martin Milev <martinmariusmilev@gmail.com>
 */
public class ItemBuilder {
  private String productName = "product";
  private String measureUnit = "kg";
  private Double quantity = 0D;
  private Double price = 0D;

  public ItemBuilder productName(String productName) {
    this.productName = productName;
    return this;
  }

  public ItemBuilder measureUnit(String measureUnit) {
    this.measureUnit = measureUnit;
    return this;
  }

  public ItemBuilder quantity(Double quantity) {
    this.quantity = quantity;
    return this;
  }

  public ItemBuilder price(Double price) {
    this.price = price;
    return this;
  }

  public String getProductName() {
    return productName;
  }

  public String getMeasureUnit() {
    return measureUnit;
  }

  public Double getQuantity() {
    return quantity;
  }

  public Double getPrice() {
    return price;
  }

  public OrderItem build() {
    return new OrderItem(this);
  }
}
