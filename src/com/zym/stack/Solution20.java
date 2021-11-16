package com.zym.stack;

import com.sun.deploy.util.StringUtils;

import java.util.*;

/**
 * @author zhouyumeng
 * @description
 * @date 2021/07/21
 **/
public class Solution20 {

    private static final Map<Character, Character> MAP = new HashMap<Character, Character>(){{
        put('(', ')');
        put('{', '}');
        put('[', ']');
    }};

    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }

    public static boolean isValid(String s) {
        if (null == s || s.length() <= 1 || !MAP.containsKey(s.charAt(0))) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (MAP.containsKey(c)) {
                stack.push(c);
            } else {
                if (stack.size() == 0 || c != MAP.get(stack.pop())) {
                    return false;
                }
            }
        }
        return stack.size() == 0;
    }
}
