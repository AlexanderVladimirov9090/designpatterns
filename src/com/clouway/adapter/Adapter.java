package com.clouway.adapter;

import java.io.IOException;

/**
 * @author Martin Milev <martinmariusmilev@gmail.com>
 */
public class Adapter implements Target {
  @Override
  public int read(byte[] buf, int offset, int length) throws IOException {
    return new RealInputStream().read(buf, offset, length);
  }
}
