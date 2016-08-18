package com.clouway.factory;

/**
 * @author Martin Milev <martinmariusmilev@gmail.com>
 */
public class CodecFactoryNew implements CodecFactory {

  @Override
  public Codec make(String type) {
    if (type.contains("json")) {
      return new JSONCodec();
    }
    if (type.contains("xml")) {
      return new XMLCodec();
    }
    return null;
  }
}