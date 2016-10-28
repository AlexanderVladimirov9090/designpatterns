package com.clouway.builderpattern;

/**
 * Created by zumba on 19.10.16.
 *
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 */
public class  ItemBuilder {
    public String productName = "No name";
    public String measurementUnit = "kg";
    public Double quantity = 0.0;
    public Double price = 0.0;


    public ItemBuilder setProductName(String productName) {
        this.productName = productName;
        return this;
    }

    public ItemBuilder setMeasurementUnit(String measurementUnit) {
        this.measurementUnit = measurementUnit;
        return this;
    }

    public ItemBuilder setQuantity(Double quantity) {
        this.quantity = quantity;
        return this;
    }

    public ItemBuilder setPrice(Double price) {
        this.price = price;
        return this;
    }

    public OrderItem build() {
        return new OrderItem(this);
    }
}