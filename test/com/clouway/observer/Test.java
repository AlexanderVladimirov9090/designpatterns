package com.clouway.observer;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author Martin Milev <martinmariusmilev@gmail.com>
 */
public class Test {
  private String actual = "";

  public Display display = new Display() {
    @Override
    public void show(String msg) {
      actual = msg;
    }
  };

  @Test
  public void happyPath() throws Exception {
    String expected;
    Store store = new Store();
    store.attach(new Stock(display));
    Product p1 = new Product("A");
    Product p2 = new Product("B");

    store.addProduct(p1,5);
    expected = "5 of product A are in storage.";
    assertThat(expected, is(actual));

    store.addProduct(p1,5);
    expected = "10 of product A are in storage.";
    assertThat(expected, is(actual));

    store.addProduct(p2,20);
    expected = "20 of product B are in storage.";
    assertThat(expected, is(actual));

    store.sellProduct(p1,11);
    expected = "product A is out of stock.";
    assertThat(expected, is(actual));

    store.sellProduct(p2,10);
    expected = "Sold 10 of product B.";
    assertThat(expected, is(actual));
  }
}
