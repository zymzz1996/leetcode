package com.zym;

import java.util.*;

/**
 * @author zhouyumeng
 * @description
 * @date 2021/06/29
 **/
public class Solution169 {

    public static void main(String[] args) {
        int[] ints = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(ints));
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(num)) {
                Integer current = map.get(num);
                if (++current > nums.length/2) {
                    return num;
                } else {
                    map.put(num, current);
                }
            } else {
                map.put(num, 1);
            }
        }
        return 0;
    }
}
