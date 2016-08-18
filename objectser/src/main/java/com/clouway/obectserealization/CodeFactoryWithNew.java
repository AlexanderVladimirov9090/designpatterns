package com.clouway.obectserealization;

/**
 * Created by zumba on 14.10.16.
 *
 *  @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 */
public class CodeFactoryWithNew {

    public MessageCodec createMessageCodec(String codecType){
        if (codecType.toLowerCase().equals("json")){
            return new JSONCodec();
        }
        if (codecType.toLowerCase().equals("xml")){
            return new XMLCodec();
        }
        return null;
    }
}
