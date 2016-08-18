package com.clouway.factory;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * @author Martin Milev <martinmariusmilev@gmail.com>
 */
public class FactoryTest {
  @Test
  public void happyPath() throws Exception {
    AbstractFactory abs = new AbstractFactory();

    CodecFactory factoryNew = abs.getFactory("new");
    CodecFactory factoryRef = abs.getFactory("ref");

    Codec newObject = factoryNew.make("json");
    Codec refObject = factoryRef.make("json");

    String newName = newObject.getClass().getName();
    String refName = refObject.getClass().getName();

    assertThat(newName, is(equalTo(refName)));
  }
}
