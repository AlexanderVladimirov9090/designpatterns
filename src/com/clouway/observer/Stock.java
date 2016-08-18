package com.clouway.observer;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author Martin Milev <martinmariusmilev@gmail.com>
 */
public class Stock implements Observer {
  private Map<Product, Integer> inStock = new HashMap<>();
  private LinkedList<Product> outOfStock = new LinkedList<>();
  private Display display;

  public Stock(Display display){
    this.display = display;
  }

  @Override
  public void add(Product product, Integer amount) {
    if(inStock.containsKey(product)){
      int newAmount = inStock.get(product) + amount;
      inStock.replace(product, newAmount);
    } else {
      inStock.put(product, amount);
    }
    display.show(inStock.get(product) + " of " + product.toString() + " are in storage.");
  }

  @Override
  public void sell(Product product, Integer amount) {
    int inStockAmount = inStock.get(product);
    if (inStockAmount > amount) {
      inStock.replace(product, inStockAmount - amount);
      display.show("Sold " + amount + " of " + product.toString() + ".");
    } else {
      display.show(product.toString() + " is out of stock.");
      inStock.remove(product);
      outOfStock.add(product);
    }
  }
}
