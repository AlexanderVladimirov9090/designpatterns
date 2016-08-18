package com.clouway.factory;

/**
 * @author Martin Milev <martinmariusmilev@gmail.com>
 */
public interface CodecFactory {
  Codec make(String type);
}