package com.zym;


/**
 * @author zhouyumeng
 * @description
 * @date 2021/06/25
 **/
public class Solution {

    public static void main(String[] args) {
        TreeNode CLeft2 = new TreeNode(4);
        TreeNode CRight2 = new TreeNode(3);
        TreeNode CLeft1 = new TreeNode(3);
        TreeNode CRight1 = new TreeNode(4);
        TreeNode BLeft = new TreeNode(2, CLeft1, CRight1);
        TreeNode BRight = new TreeNode(2, CLeft2, CRight2);
        TreeNode ARoot = new TreeNode(1 , BLeft, BRight);
        System.out.println(isSymmetry(ARoot));
    }

    public static boolean isSymmetry(TreeNode root) {
        return check(root, root);
    }

    private static boolean check(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        return left.val == right.val && check(left.left, right.right) && check(left.right, right.left);
    }

    static class TreeNode {
        private int val;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }
    }
}
