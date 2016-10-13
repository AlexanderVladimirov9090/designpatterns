package com.clouway.observerpattern;

import org.jmock.Expectations;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.LinkedList;

/**
 * Created by zumba on 29.10.16.
 *
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 */
public class StockVendorOnSellTest {
    public JUnitRuleMockery context = new JUnitRuleMockery();
    private Display display = context.mock(Display.class);
    private Product product = new Product("Carrots");

    @Test
    public void sellStock() {
        StockVendor stockVendor = new StockVendor(new LinkedHashMap<>(), new LinkedList<>(), display);
        context.checking(new Expectations() {{
            oneOf(display).show(product, 14);
            oneOf(display).show(product, 2);
        }});

        stockVendor.onProductAdd(product, 14);
        stockVendor.onProductSell(product, 12);
    }

    @Test
    public void outOfStock() {
        StockVendor stockVendor = new StockVendor(new LinkedHashMap<>(), new LinkedList<>(), display);
        context.checking(new Expectations() {
            {
                oneOf(display).show(product, 14);
                oneOf(display).show(product, 0);
            }
        });
        stockVendor.onProductAdd(product, 14);
        stockVendor.onProductSell(product, 30);
    }
}
