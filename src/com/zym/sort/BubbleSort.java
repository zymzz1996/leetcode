package com.zym.sort;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author zhouyumeng
 * @date 2022/02/18
 **/
public class BubbleSort {

    public static void main(String[] args) {
        //int[] nums = {4, 5, 6, 3, 2, 1};
        int[] nums = {1, 2, 3, 4, 5, 6};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean flag = true;
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j - 1] > nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }

}
