package org.simplefactory.demo1;

import java.util.HashMap;
import java.util.Map;

/***
 * 女娲造人工厂类
 */
public class NvwaFactory {
    public static Person createPerson(String arg){
        Map<String,Person> map=new HashMap<>();
        map.put("M",new Man());
        map.put("W",new Woman());
        map.put("R", new Robot());
        return map.getOrDefault(arg,null);
    }
}
