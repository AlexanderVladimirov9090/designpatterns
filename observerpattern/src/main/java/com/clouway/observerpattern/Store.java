package com.clouway.observerpattern;

import java.util.List;

/**
 * Created by zumba on 20.10.16.
 *
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 */
class Store {
    private final List<ProductChangeListener> productChangeListeners;

    public Store(List<ProductChangeListener> productChangeListeners) {
        this.productChangeListeners = productChangeListeners;
    }

    public void assignChangeListener(ProductChangeListener productChangeListener) {
        productChangeListeners.add(productChangeListener);
    }

    public void addProduct(Product product, int amount) {
        for (ProductChangeListener each : productChangeListeners) {
            each.onProductAdd(product, amount);
        }
    }

    public void sellProduct(Product product, int amount) {
        for (ProductChangeListener each : productChangeListeners) {
            each.onProductSell(product, amount);
        }
    }
}