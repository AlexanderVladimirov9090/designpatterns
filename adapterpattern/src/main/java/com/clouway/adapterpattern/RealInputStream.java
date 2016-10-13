package com.clouway.adapterpattern;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by zumba on 19.10.16.
 *
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 */
public class RealInputStream extends InputStream {
    public int read() throws IOException {
        return -1;
    }
}
