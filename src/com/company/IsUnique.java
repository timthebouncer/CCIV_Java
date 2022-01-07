package com.company;

import java.util.HashMap;
import java.util.Map;

public class IsUnique {

    public boolean isUnique(String val){

        //creat 265 false in memory
        boolean[] map = new boolean[265];
        char[] chars = val.toCharArray();

        for (char c : chars){
            //if 97 shows up again, it will be true
            if(map[c]){
                return false;
            }
            //a in ASCII is 97, now the 97 is true in memory
            map[c] = true;
        }


        return true;
    }

    public boolean isUnique2(String val) {
        Map<Character, Integer> testMap = new HashMap<>();
        char[] chars = val.toCharArray();
        for (int i=0; i<chars.length;i++){
            //to see if key is exist in map
            if(testMap.containsKey(chars[i])){
                return false;
            }else {
                //a in ASCII is 97 which means give {a:1} to map
                testMap.put(chars[i],1);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsUnique unique = new IsUnique();
        System.out.println(unique.isUnique2("abcd"));
    }
}
