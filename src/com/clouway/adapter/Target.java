package com.clouway.adapter;

import java.io.IOException;

/**
 * @author Martin Milev <martinmariusmilev@gmail.com>
 */
public interface Target {
  public int read(byte[] buf, int offset, int length) throws IOException;
}
