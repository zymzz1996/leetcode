package com.zym;

import java.util.Arrays;

/**
 * @author zhouyumeng
 * @description
 * @date 2021/08/04
 **/
public class Solution27 {

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums, 3));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeElement(int[] nums, int val) {
        if (null == nums || nums.length == 0) {
            return 0;
        }
        int p = 0;
        while (p < nums.length) {
            if (nums[p] == val) {
                int q = p + 1;
                while (q < nums.length) {
                    if (nums[q] != val) {
                        int temp = nums[p];
                        nums[p] = nums[q];
                        nums[q] = temp;
                        break;
                    }
                    q++;
                }
                if (nums[p] == val) {
                    break;
                }
            }
            p++;
        }
        return p;
    }
}
