package com.github.cn0.Runner.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zeno
 */
public class StringHelper {

    /**
     * Returns a list of arguments given from String string
     * @param string string, which contains args, separated by spaces
     * @return list of args from given String string
     */
    public static List<String> getArgs(String string) {
        ArrayList<String> list = new ArrayList<>();
        String builtString = "";
        for (int i = 0; i < string.length(); i++) {
            Character character = string.charAt(i);
            if(character == ' ') {
                list.add(builtString);
                builtString = "";
            } else {
                builtString = builtString + character;
            }
        }
        if(!list.contains(builtString))
            list.add(builtString);
        return list;
    }

}
