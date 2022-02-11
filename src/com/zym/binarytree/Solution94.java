package com.zym.binarytree;

import java.util.LinkedList;
import java.util.List;

/**
 * @author zhouyumeng
 * @date 2022/02/11
 **/
public class Solution94 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode firstRight = new TreeNode(2);
        root.right = firstRight;
        TreeNode secondLeft = new TreeNode(3);
        firstRight.left = secondLeft;
        List<Integer> result = inorderTraversal(root);
        System.out.println(result);
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        if (null == root) {
            return result;
        }
        inorder(result, root);
        return result;
    }

    private static void inorder(List<Integer> result, TreeNode root) {
        if (null == root) {
            return;
        }
        inorder(result, root.left);
        result.add(root.val);
        inorder(result, root.right);
    }

}
