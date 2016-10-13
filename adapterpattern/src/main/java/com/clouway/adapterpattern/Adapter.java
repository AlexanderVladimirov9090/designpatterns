package com.clouway.adapterpattern;

import java.io.IOException;

/**
 * Created by zumba on 19.10.16.
 *
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 */
public class Adapter implements MyInputStream {
    public int read(byte[] buffer, int offset, int length) throws IOException {
        return new RealInputStream().read(buffer,offset,length);
    }
}
