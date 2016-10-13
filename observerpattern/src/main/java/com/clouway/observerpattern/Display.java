package com.clouway.observerpattern;

/**
 * Created by zumba on 20.10.16.
 *
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 *             Interface for displaing to the user when adding and selling product.
 */
public interface Display {
    /**
     * Will display product and amount stored in store.
     * @param product from store.
     * @param amount of product.
     */
    void show(Product product, int amount);
}