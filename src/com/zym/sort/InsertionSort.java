package com.zym.sort;

import java.util.Arrays;

/**
 * @author zhouyumeng
 * @date 2022/02/18
 **/
public class InsertionSort {

    public static void main(String[] args) {
        //int[] nums = {4, 5, 6, 3, 2, 1};
        int[] nums = {1, 2, 3, 4, 5, 6};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int value = nums[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (nums[j] > value) {
                    nums[j + 1] = nums[j];
                } else {
                    break;
                }
            }
            nums[j + 1] = value;
        }
    }

}
