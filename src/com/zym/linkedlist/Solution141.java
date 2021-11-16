package com.zym.linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * 链表中环的检测
 * @author zhouyumeng
 * @date 2021/09/16
 **/
public class Solution141 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        //node4.next = node2;
        Solution141 s = new Solution141();
        System.out.println(s.detectCycle2(node1));
    }

    public boolean detectCycle(ListNode head) {
        if (null == head || null == head.next) {
            return false;
        }
        ListNode curr = head.next;
        Set<ListNode> set = new HashSet<>();
        while (curr != null) {
            if (!set.add(curr)) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public boolean detectCycle2(ListNode head) {
        if (null == head || null == head.next) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}