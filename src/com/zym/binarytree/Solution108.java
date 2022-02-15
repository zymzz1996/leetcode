package com.zym.binarytree;

/**
 * @author zhouyumeng
 * @date 2022/02/15
 **/
public class Solution108 {

    public static void main(String[] args) {
        //[-10,-3,0,5,9]
        int[] nums = {-10,-3,0,5,9};
        TreeNode root = sortedArrayToBST(nums);
        System.out.println(Solution94.inorderTraversal(root));
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        return sorted(nums, 0, nums.length - 1);
    }

    private static TreeNode sorted(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int middle = (left + right) / 2;
        TreeNode root = new TreeNode(nums[middle]);
        root.left = sorted(nums, left, middle - 1);
        root.right = sorted(nums, middle + 1, right);
        return root;
    }

}
