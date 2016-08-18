package com.clouway.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Martin Milev <martinmariusmilev@gmail.com>
 */
public class Store {
  List<Observer> observers = new ArrayList<>();

  public void attach(Observer observer) {
    observers.add(observer);
  }

  public void addProduct(Product product, int quantity) {
    for (Observer observer : observers) {
      observer.add(product, quantity);
    }
  }

  public void sellProduct(Product product, int quantity) {
    for (Observer observer : observers) {
      observer.sell(product, quantity);
    }
  }
}
