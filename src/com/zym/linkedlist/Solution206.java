package com.zym.linkedlist;


/**
 * @author zhouyumeng
 * @date 2021/09/15
 **/
public class Solution206 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        System.out.println(node1);
        Solution206 s = new Solution206();
        s.reverseList(node1);
        System.out.println(node3);
    }

    public ListNode reverseList(ListNode head) {
        if (null == head || null == head.next) {
            return head;
        }
        ListNode temp = new ListNode();
        reverse(head, null, temp);
        return temp.next;
    }

    private void reverse(ListNode curr, ListNode pre, ListNode temp) {
        ListNode next = curr.next;
        if (null != next) {
            reverse(next, curr, temp);
        } else {
            temp.next = curr;
        }
        curr.next = pre;
    }
}
