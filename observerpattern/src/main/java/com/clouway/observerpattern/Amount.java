package com.clouway.observerpattern;

/**
 * Created by zumba on 20.10.16.
 *
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 *             Amout ot product in stock.
 */
public class Amount {
    private final int amount;

    public Amount(int amount) {
        this.amount = amount;
    }

    /**
     * Value of amount object.
     * @return
     */
    public int value(){
        return amount;
    }
}