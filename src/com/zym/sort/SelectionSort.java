package com.zym.sort;

import java.util.Arrays;

/**
 * @author zhouyumeng
 * @date 2022/02/18
 **/
public class SelectionSort {

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 3, 2, 1};
        //int[] nums = {1, 2, 3, 4, 5, 6};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int min = nums[i];
            int mixIndex = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    mixIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = min;
            nums[mixIndex] = temp;
        }
    }

}
