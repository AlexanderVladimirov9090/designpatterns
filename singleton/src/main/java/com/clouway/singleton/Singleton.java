package com.clouway.singleton;

/**
 * Created by zumba on 18.10.16.
 *
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 */
public class Singleton {
    private static final Singleton singleton = new Singleton();
    private Singleton(){
        System.out.println("Singleton was created.");
    }

    public static Singleton getSingleton(){
        return singleton;
    }
}
