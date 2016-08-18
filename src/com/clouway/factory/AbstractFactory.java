package com.clouway.factory;

/**
 * @author Martin Milev <martinmariusmilev@gmail.com>
 */
public class AbstractFactory {

  public CodecFactory getFactory(String type) {
    if(type.equals("new")){
      return new CodecFactoryNew();
    }
    if (type.equals("ref")) {
      return new CodecFactoryRef();
    }
    return null;
  }
}
