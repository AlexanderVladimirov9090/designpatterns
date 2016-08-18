package com.clouway.observer;

/**
 * @author Martin Milev <martinmariusmilev@gmail.com>
 */
public interface Observer {
  void add(Product product, Integer amount);

  void sell(Product product, Integer amount);
}
