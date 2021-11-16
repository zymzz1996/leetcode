package com.zym;

/**
 * @author zhouyumeng
 * @description
 * @date 2021/08/19
 **/
public class Solution35 {

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        Solution35 s = new Solution35();
        System.out.println(s.searchInsert(nums, 7));
    }

    public int searchInsert(int[] nums, int target) {
        if (null == nums || nums.length == 0) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }


    public int searchInsertByDichotomy(int[] nums, int target) {
        if (nums[nums.length - 1] < target) {
            return nums.length;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left)/2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
