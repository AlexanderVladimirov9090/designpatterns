package com.clouway.singleton;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.*;

/**
 * Created by zumba on 18.10.16.
 *
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 */
public class SingletonTest {

    @Test
    public void happyPath(){
        assertThat(Singleton.getSingleton(),is(sameInstance(Singleton.getSingleton())));
    }

}