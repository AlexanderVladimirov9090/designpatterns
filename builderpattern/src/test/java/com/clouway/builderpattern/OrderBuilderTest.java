package com.clouway.builderpattern;

import org.junit.Test;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by zumba on 19.10.16.
 *
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 */

public class OrderBuilderTest {
    private OrderBuilder orderBuilder = new OrderBuilder();
    private ItemBuilder itemBuilder = new ItemBuilder();
    private OrderItem orderItem = itemBuilder.build();

    @Test
    public void defaultBuildId() {
        Long expected = 0L;
        Order order = orderBuilder.build();

        assertThat(order.getOrderId(), is(equalTo(expected)));
    }

    @Test
    public void defaultBuildCustomerName() {
        String expected = "No name";
        Order order = orderBuilder.build();

        assertThat(order.getCustomerName(), is(equalTo(expected)));
    }

    @Test
    public void defaultBuildCustomerAddress() {
        String expected = "No address";
        Order order = orderBuilder.build();

        assertThat(order.getCustomerAddress(), is(equalTo(expected)));
    }

    @Test
    public void defaultBuildOrderCreationDate() {
        Date expected = new Date(1000);
        Order order = orderBuilder.build();

        assertThat(order.getOrderCreationDate(), is(equalTo(expected)));
    }

    @Test
    public void defaultBuildDeliveryDate() {
        Date expected = new Date(1000);
        Order order = orderBuilder.build();

        assertThat(order.getOrderDeliveryDate(), is(equalTo(expected)));
    }

    @Test
    public void defaultBuildItems() {
        Order order = orderBuilder.build();

        assertThat(order.getItems(), is(nullValue()));
    }

    @Test
    public void orderId() {
        Long expected = 3333L;
        orderBuilder.setOrderId(3333L);
        Order order = orderBuilder.build();
        Long actual = order.getOrderId();

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void customerName() {
        String expected = "Pesho";
        orderBuilder.setCustomerName("Pesho");
        Order order = orderBuilder.build();
        String actual = order.getCustomerName();

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void customerAddress() {
        String expected = "Street";
        orderBuilder.setCustomerAddress("Street");
        Order order = orderBuilder.build();
        String actual = order.getCustomerAddress();

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void orderCreationDate() {
        Date expected = new Date(400000000000L);
        orderBuilder.setOderCreationDate(new Date(400000000000L));
        Order order = orderBuilder.build();
        Date actual = order.getOrderCreationDate();

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void orderDeliveryDate() {
        Date expected = new Date(5600000000000L);
        orderBuilder.setOrderDeliveryDate(new Date(5600000000000L));
        Order order = orderBuilder.build();
        Date actual = order.getOrderDeliveryDate();

        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void items() {
        List expected = new LinkedList<OrderItem>() {{
            add(orderItem);
        }};
        List items = new LinkedList<OrderItem>() {{
            add(orderItem);
        }};
        Order order = orderBuilder.setItems(items).build();

        assertThat(order.getItems(), is(equalTo(expected)));
    }

}