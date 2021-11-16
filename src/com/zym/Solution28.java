package com.zym;

/**
 * @author zhouyumeng
 * @description
 * @date 2021/08/05
 **/
public class Solution28 {

    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "pi"));
    }

    public static int strStr(String haystack, String needle) {
        if ("".equals(needle)) {
            return 0;
        }
        if ("".equals(haystack)) {
            return -1;
        }
        int p = 0;
        char[] chars = haystack.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == needle.charAt(p)) {
                p++;
                if (p == needle.length()) {
                    return i - p + 1;
                }
            } else {
                if (p != 0) {
                    i = i - p;
                    p = 0;
                }
            }
        }
        return -1;
    }
}
