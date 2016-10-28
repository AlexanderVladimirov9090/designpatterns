package com.clouway.builderpattern;

/**
 * Created by zumba on 19.10.16.
 *
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 */
public final class OrderItem {
    private String productName;
    private String measurementUnit;
    private Double quantity;
    private Double price;

   OrderItem(ItemBuilder itemBuilder) {
        this.productName = itemBuilder.productName;
        this.measurementUnit = itemBuilder.measurementUnit;
        this.quantity = itemBuilder.quantity;
        this.price = itemBuilder.price;
    }

    /**
     * Gets product name.
     * @return
     */
    public String getProductName(){
        return productName;
    }

    /**
     * Gets measurement unit of product.
     * @return
     */
    public String getMeasurementUnit(){
        return measurementUnit;
    }

    /**
     * Gets setQuantity of product.
     * @return
     */
    public Double getQuantity(){
        return quantity;
    }

    /**
     * Gets setPrice of product.
     * @return
     */
    public Double getPrice(){
        return price;
    }
}