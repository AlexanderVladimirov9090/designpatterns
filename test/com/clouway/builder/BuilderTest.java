package com.clouway.builder;

import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * @author Martin Milev <martinmariusmilev@gmail.com>
 */
public class BuilderTest {
  private SimpleDateFormat dateFormat;
  private List<OrderItem> itemList;

  @Before
  public void setUp() throws Exception {
    dateFormat = new SimpleDateFormat("mm/dd");
    itemList = new LinkedList<>();
    itemList.add(new ItemBuilder()
            .productName("Apple")
            .measureUnit("kg")
            .quantity(100D)
            .price(20D)
            .build());
    itemList.add(new ItemBuilder().build());
  }

  @Test
  public void happyPath() throws Exception {
    Order order = new OrderBuilder()
            .customerName("John")
            .customerAddress("Sofia")
            .build();

    assertThat(order.getCustomerName(), is("John"));
    assertThat(order.getCustomerAddress(), is("Sofia"));
  }

  @Test
  public void onTimeDelivery() throws Exception {
    Order order = new OrderBuilder()
            .orderDate(dateFormat.parse("01/05"))
            .orderDeliveryDate(dateFormat.parse("01/4"))
            .build();

    assertThat(order.ontime(), is(true));
  }

  @Test
  public void lateDelivery() throws Exception {
    Order order = new OrderBuilder()
            .orderDate(dateFormat.parse("01/05"))
            .orderDeliveryDate(dateFormat.parse("01/08"))
            .build();

    assertThat(order.ontime(), is(false));
  }

  @Test
  public void items() throws Exception {
    Order order = new OrderBuilder()
            .items(itemList)
            .build();

    String actual = itemList.get(0).toString();
    String expected = "OrderItem{productName='Apple', measureUnit='kg', quantity=100.0, price=20.0}";

    assertThat(actual, is(expected));
    assertThat(order.getItems().size(), is(2));
    assertThat(itemList.get(0), is(sameInstance(order.getItems().get(0))));
    assertThat(itemList.get(1), is(sameInstance(order.getItems().get(1))));
  }


}
