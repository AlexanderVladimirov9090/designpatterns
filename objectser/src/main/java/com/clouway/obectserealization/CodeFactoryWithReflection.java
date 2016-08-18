package com.clouway.obectserealization;

import java.util.LinkedHashMap;

/**
 * Created by zumba on 14.10.16.
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 */
public class CodeFactoryWithReflection {
    private final LinkedHashMap<String, Class> classes = new LinkedHashMap<String, Class>() {{
        classes.put("json", JSONCodec.class);
        classes.put("xml", XMLCodec.class);
    }};

    public MessageCodec createCodec(String command) throws IllegalAccessException, InstantiationException {
        return (MessageCodec) classes.get(command).newInstance();
    }
}
