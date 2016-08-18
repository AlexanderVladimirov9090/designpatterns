package com.clouway.observer;

/**
 * @author Martin Milev <martinmariusmilev@gmail.com>
 */
public class Product {
  private final String name;

  public Product(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "product " + name;
  }
}
