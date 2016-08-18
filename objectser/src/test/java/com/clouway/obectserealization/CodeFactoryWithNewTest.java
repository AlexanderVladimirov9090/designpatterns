package com.clouway.obectserealization;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by zumba on 14.10.16.
 */
public class CodeFactoryWithNewTest {

    @Test
    public void jsonMessage() {
        CodeFactoryWithNew codeFactoryWithNew = new CodeFactoryWithNew();
        String command = "json";
        MessageCodec messageCodec = codeFactoryWithNew.createMessageCodec(command);
        String actual = messageCodec.toMessage(new User("Go6o", 18));
        String expected = "{\"name\":\"Go6o\",\"age\":18}";
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void xmlMessage() {
        CodeFactoryWithNew codeFactoryWithNew = new CodeFactoryWithNew();
        String command = "xml";
        MessageCodec messageCodec = codeFactoryWithNew.createMessageCodec(command);
        String actual = messageCodec.toMessage(new User("Go6o", 18));
        String expected = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n<user>\n    <name>Go6o</name>\n    <age>18</age>\n</user>\n\n";
        assertThat(actual, is(equalTo(expected)));
    }

    @Test
    public void jsonCodec() {
        CodeFactoryWithNew codeFactoryWithNew = new CodeFactoryWithNew();
        String command = "json";
        MessageCodec messageCodec = codeFactoryWithNew.createMessageCodec(command);

        assertThat(messageCodec, is(instanceOf(JSONCodec.class)));
    }

    @Test
    public void xmlCodec() {
        CodeFactoryWithNew codeFactoryWithNew = new CodeFactoryWithNew();
        String command = "xml";
        MessageCodec messageCodec = codeFactoryWithNew.createMessageCodec(command);

        assertThat(messageCodec, is(instanceOf(XMLCodec.class)));
    }
}