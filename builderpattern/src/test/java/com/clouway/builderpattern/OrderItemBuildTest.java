package com.clouway.builderpattern;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by zumba on 18.10.16.
 *
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 */
public class OrderItemBuildTest {
    private ItemBuilder itemBuilder = new ItemBuilder();

    @Test
    public void itemDefaultBuilderName() {
        String expected = "No name";
        OrderItem actual = itemBuilder.build();

        assertThat(actual.getProductName(), is(equalTo(expected)));
    }

    @Test
    public void itemDefaultBuilderMeasurementUnit() {
        String expected = "kg";
        OrderItem actual = itemBuilder.build();

        assertThat(actual.getMeasurementUnit(), is(equalTo(expected)));
    }

    @Test
    public void itemDefaultBuilderPrice() {
        Double expected = 0.0;
        OrderItem actual = itemBuilder.build();

        assertThat(actual.getPrice(), is(equalTo(expected)));
    }

    @Test
    public void itemDefaultBuilderQuantity() {
        Double expected = 0.0;
        OrderItem actual = itemBuilder.build();

        assertThat(actual.getQuantity(), is(equalTo(expected)));
    }

    @Test
    public void itemNameBuild() {
        String expected = "Name of product";
        OrderItem orderItem = itemBuilder.setProductName("Name of product").build();

        assertThat(orderItem.getProductName(), is(equalTo(expected)));
    }

    @Test
    public void itemMeasurementUnit() {
        String expected = "cm";
        OrderItem orderItem = itemBuilder.setMeasurementUnit("cm").build();

        assertThat(orderItem.getMeasurementUnit(), is(equalTo(expected)));
    }

    @Test
    public void itemQuantity() {
        Double expected = 3.0;
        OrderItem orderItem = itemBuilder.setQuantity(3.0).build();

        assertThat(orderItem.getQuantity(), is(equalTo(expected)));
    }

    @Test
    public void itemPrice() {
        Double expected = 3.0;
        OrderItem orderItem = itemBuilder.setPrice(3.0).build();

        assertThat(orderItem.getPrice(), is(equalTo(expected)));
    }

}