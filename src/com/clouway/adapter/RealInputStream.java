package com.clouway.adapter;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Martin Milev <martinmariusmilev@gmail.com>
 */
public class RealInputStream extends InputStream {
  @Override
  public int read() throws IOException {
    return 0;
  }
}
