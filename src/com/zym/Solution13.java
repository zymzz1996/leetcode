package com.zym;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhouyumeng
 * @description
 * @date 2021/07/14
 **/
public class Solution13 {

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }

    public static int romanToInt(String s) {
        //特殊: IV --> 4 IX --> 9 XL --> 40 XC --> 90 CD --> 400 CM --> 900
        Map<String, Integer> map = new HashMap<>(13);
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);
        if (map.get(s) != null) {
            return map.get(s);
        }
        //XCIV 94
        int result = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            String special = s.substring(i, i+2 > length ? length : i+2);
            if (map.get(special) != null) {
                result += map.get(special);
                i += 1;
            } else {
                String roman = String.valueOf(s.charAt(i));
                result += map.get(roman);
            }
        }
        return result;
    }

}
