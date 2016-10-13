package com.clouway.adapterpattern;

import java.io.IOException;

/**
 * Created by zumba on 19.10.16.
 *
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 */
public interface MyInputStream {
    int read(byte[] buffer,int offset, int length) throws IOException;
}
