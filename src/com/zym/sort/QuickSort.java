package com.zym.sort;

import java.util.Arrays;

/**
 * @author zhouyumeng
 * @date 2022/02/24
 **/
public class QuickSort {

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 3, 2, 1};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public void quickSort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    public void quickSort(int[] nums, int q, int r) {
        if (q >= r) {
            return;
        }
        int pivot = partition(nums, q, r);
        quickSort(nums, q, pivot - 1);
        quickSort(nums, pivot + 1, r);
    }

    private int partition(int[] nums, int q, int r) {
        int pivot = r;
        int i = q;
        //原地排序
        for (int j = q; j <= r - 1; j++) {
            if (nums[j] < nums[pivot]) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        int temp = nums[i];
        nums[i] = nums[pivot];
        nums[pivot] = temp;
        return i;
    }


}
