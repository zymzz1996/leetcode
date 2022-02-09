package com.zym.binarytree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author zhouyumeng
 * @date 2022/02/09
 **/
public class Solution102 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode firstLeft = new TreeNode(9);
        root.left = firstLeft;
        TreeNode firstRight = new TreeNode(20);
        root.right = firstRight;
        TreeNode secondLeft = new TreeNode(15);
        firstRight.left = secondLeft;
        TreeNode secondRight = new TreeNode(7);
        firstRight.right = secondRight;
        System.out.println(levelOrder(root));
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (null == root) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new LinkedList<>();
            int currentQueueSize = queue.size();
            for (int i = 0; i < currentQueueSize; i++) {
                TreeNode treeNode = queue.remove();
                level.add(treeNode.val);
                if (treeNode.left != null) {
                    queue.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.add(treeNode.right);
                }
            }
            result.add(level);
        }
        return result;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
