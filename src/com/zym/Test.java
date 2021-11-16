package com.zym;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouyumeng
 * @description
 * @date 2021/08/06
 **/
public class Test {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(null);
        list.add("a");
        for (String ele : list) {
            System.out.println(ele);
        }
    }
}
