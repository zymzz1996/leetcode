package com.zym.linkedlist;

/**
 * @author zhouyumeng
 * @date 2021/09/26
 **/
public class Solution876 {

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        //n5.next = n6;
        Solution876 s = new Solution876();
        ListNode result = s.middleNode2(n1);
        System.out.println(result);
    }


    private ListNode middleNode(ListNode head) {
        if (null == head || null == head.next) {
            return head;
        }
        int totalNum = 0;
        ListNode temp = head;
        while (null != temp) {
            temp = temp.next;
            totalNum++;
        }
        int middleNum = totalNum / 2;
        ListNode middle = head;
        for (int i = 0; i < middleNum; i++) {
            middle = middle.next;
        }
        return middle;
    }

    private ListNode middleNode2(ListNode head) {
        if (null == head || null == head.next) {
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
