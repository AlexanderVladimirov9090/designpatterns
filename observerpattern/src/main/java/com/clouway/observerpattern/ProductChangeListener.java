package com.clouway.observerpattern;

/**
 * Created by zumba on 20.10.16.
 *
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 *             This inteface is used for adding to Store  and selling amount of product to client.
 */
public interface ProductChangeListener {

    /**
     * Adds product to store.
     * @param product to be added.
     * @param amount of the product.
     */
    void onProductAdd(Product product, int amount);

    /**
     * Sells product.
     * @param product to be sold.
     * @param amount of the product.
     */
    void onProductSell(Product product, int amount);
}