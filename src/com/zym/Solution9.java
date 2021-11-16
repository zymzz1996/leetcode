package com.zym;

/**
 * @author zhouyumeng
 * @description
 * @date 2021/07/13
 **/
public class Solution9 {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int x) {
        boolean result = true;
        String s = String.valueOf(x);
        int length = s.length();
        for (int i = 0; i < length/2; i++) {
            char front = s.charAt(i);
            char back = s.charAt(length - i - 1);
            if (front != back) {
                result = false;
            }
        }
        return result;
    }
}
