package com.clouway.factory;

/**
 * @author Martin Milev <martinmariusmilev@gmail.com>
 */
public class CodecFactoryRef implements CodecFactory {
  @Override
  public Codec make(String type){
    try {
      if (type.contains("json")) {
        return JSONCodec.class.newInstance();
      }
      if (type.contains("xml")) {
        return XMLCodec.class.newInstance();
      }
    } catch (InstantiationException | IllegalAccessException e) {
      e.printStackTrace();
    }
    return null;
  }
}