package com.zym.sort;

/**
 * @author zhouyumeng
 * @date 2022/03/01
 **/
public class Solution215 {

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        Solution215 s = new Solution215();
        int kthLargest = s.findKthLargest(nums, k);
        System.out.println(kthLargest);
    }

    public int findKthLargest(int[] nums, int k) {
        return findKthLargest(nums, k, 0, nums.length - 1);
    }

    public int findKthLargest(int[] nums, int k, int q, int r) {
        int pivot = partition(nums, q, r);
        if (pivot == k - 1) {
            return nums[pivot];
        } else if (pivot > k - 1) {
            return findKthLargest(nums, k, q, pivot - 1);
        } else {
            return findKthLargest(nums, k, pivot + 1, r);
        }
    }

    private int partition(int[] nums, int q, int r) {
        int i = q;
        for (int j = q; j <= r - 1; j++) {
            if (nums[j] > nums[r]) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
        }
        int temp = nums[i];
        nums[i] = nums[r];
        nums[r] = temp;
        return i;
    }

}
