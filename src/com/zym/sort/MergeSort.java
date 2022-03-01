package com.zym.sort;

import java.util.Arrays;

/**
 * @author zhouyumeng
 * @date 2022/02/23
 **/
public class MergeSort {

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 3, 2, 1};
        mergeSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void mergeSort(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
    }

    public static void mergeSort(int[] nums, int q, int r) {
        if (q >= r) {
            return;
        }
        int p = (q + r) / 2;
        mergeSort(nums, q, p);
        mergeSort(nums, p + 1, r);
        merge(nums, q, p, r);
    }

    private static void merge(int[] nums, int q, int p, int r) {
        int[] temp = new int[r + 1];
        int i = q, j = p + 1, k = 0;
        while (i <= p && j <= r) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        int start = i, end = p;
        if (j <= r) {
            start = j;
            end = r;
        }
        //此处可以使用哨兵替代，使用最大的int值作为哨兵
        while (start <= end) {
            temp[k++] = nums[start++];
        }
        for (int x = 0; x <= r - q; x++) {
            nums[q + x] = temp[x];
        }
    }

}
