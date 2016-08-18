package com.clouway.obectserealization;

import org.junit.Test;

import java.util.HashMap;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by zumba on 15.10.16.
 */
public class CodeFactoryWithReflectionTest {
    private HashMap<String, Class> classes = new HashMap<>();

    @Test
    public void jsonMessage() throws InstantiationException, IllegalAccessException {

        CodeFactoryWithReflection codeFactoryWithReflection = new CodeFactoryWithReflection();
        MessageCodec messageCodec = codeFactoryWithReflection.createCodec("json");
        String actual = messageCodec.toMessage(new User("Go6o", 15));
        String expected = "{\"name\":\"Go6o\",\"age\":15}";
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void xmlMessage() throws InstantiationException, IllegalAccessException {

        CodeFactoryWithReflection codeFactoryWithReflection = new CodeFactoryWithReflection();
        MessageCodec messageCodec = codeFactoryWithReflection.createCodec("xml");
        String actual = messageCodec.toMessage(new User("Gosho", 14));
        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n<user>\n    <name>Gosho</name>\n    <age>14</age>\n</user>\n\n";
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void jsonInstance() throws InstantiationException, IllegalAccessException {

        CodeFactoryWithReflection codeFactoryWithReflection = new CodeFactoryWithReflection();
        MessageCodec messageCodec = codeFactoryWithReflection.createCodec("json");

        assertThat(messageCodec, is(instanceOf(JSONCodec.class)));
    }

    @Test
    public void xmlInstance() throws InstantiationException, IllegalAccessException {

        CodeFactoryWithReflection codeFactoryWithReflection = new CodeFactoryWithReflection();
        MessageCodec messageCodec = codeFactoryWithReflection.createCodec("xml");

        assertThat(messageCodec, is(instanceOf(XMLCodec.class)));
    }

    @Test(expected = NullPointerException.class)
    public void noCodecWithThatName() throws InstantiationException, IllegalAccessException {
        CodeFactoryWithReflection codeFactoryWithReflection = new CodeFactoryWithReflection();
        MessageCodec messageCodec = codeFactoryWithReflection.createCodec("q");
        String actual = messageCodec.toMessage(new User("Gosho", 14));
        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n<user>\n    <name>Gosho</name>\n    <age>14</age>\n</user>\n\n";
        assertThat(actual, is(equalTo(expected)));

    }
}