package com.zym.binarytree;

/**
 * @author zhouyumeng
 * @date 2022/02/14
 **/
public class Solution98 {

    public static void main(String[] args) {
        //[5,4,6,null,null,3,7]
        TreeNode root = new TreeNode(5);
        TreeNode firstLeft = new TreeNode(4);
        TreeNode firstRight = new TreeNode(6);
        root.left = firstLeft;
        root.right = firstRight;
        TreeNode secondLeft = new TreeNode(3);
        TreeNode secondRight = new TreeNode(7);
        firstRight.left = secondLeft;
        firstRight.right = secondRight;
        boolean validBST = isValidBST(root);
        System.out.println(validBST);
    }

    public static boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean isValid(TreeNode node, long minimum, long maximum) {
        if (null == node) {
            return true;
        }
        if (node.val <= minimum || node.val >= maximum) {
            return false;
        }
        return isValid(node.left, minimum, node.val) && isValid(node.right, node.val, maximum);
    }


}
