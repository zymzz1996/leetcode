package com.zym;

/**
 * @author zhouyumeng
 * @description
 * @date 2021/07/16
 **/
public class Solution14 {

    private static final String EMPTY_STRING = "";

    public static void main(String[] args) {
        String[] strs = new String[]{"a","ac"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (null == strs || strs.length == 0) {
            return EMPTY_STRING;
        }
        String one = strs[0];
        if (strs.length == 1 || one.equals(EMPTY_STRING)) {
            return one;
        }
        boolean flag = true;
        for (int i = 0; i < one.length(); i++) {
            for (String str : strs) {
                if (!one.equals(str)) {
                    flag = false;
                }
                if (!flag) {
                    if (str.equals(EMPTY_STRING)) {
                        return EMPTY_STRING;
                    }
                    if (i + 1 > str.length()) {
                        return one.substring(0, i);
                    }
                    if (!str.substring(0, i + 1).equals(one.substring(0, i + 1))) {
                        return one.substring(0, i);
                    }
                }
            }
            if (flag) {
                return one;
            }
        }
        return one;
    }
}
