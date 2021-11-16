package com.zym;

import java.util.Arrays;

/**
 * @author zhouyumeng
 * @description
 * @date 2021/07/28
 **/
public class Solution26 {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        Solution26 s = new Solution26();
        System.out.println(s.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public int removeDuplicates(int[] nums) {
        if (null == nums || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        int len = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    len++;
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return len;
    }

    public int getSmallestNum(int[] nums, int num) {
        int smallestNum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > num && nums[i] < smallestNum) {
                smallestNum = nums[i];
            }
        }
        return smallestNum;
    }
}
