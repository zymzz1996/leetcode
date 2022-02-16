package com.zym.recursion;

/**
 * @author zhouyumeng
 * @date 2022/02/16
 **/
public class Solution2 {

    public static void main(String[] args) {
        //[9,9,9,9,9,9,9]
        //[9,9,9,9]
        //[8,9,9,9,0,0,0,1]
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next = new ListNode(9);
        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);
        ListNode result = addTwoNumbers(l1, l2);
        result.print();
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //2 -> 4 ->3 342
        //5 -> 6 ->4 465
        //7 -> 0 ->8 807
        return add(l1, l2, 0);
    }

    private static ListNode add(ListNode l1, ListNode l2, int incr) {
        if (incr == 0 && l1 == null && l2 == null) {
            return null;
        }
        ListNode result = new ListNode();
        //incr不为0且l1、l2为空，说明此时有进位
        if (l1 == null && l2 == null) {
            result.val = incr;
        } else if (l1 == null) {
            result.val = l2.val + incr;
        } else if (l2 == null) {
            result.val = l1.val + incr;
        } else {
            result.val = l1.val + l2.val + incr;
        }
        int i = 0;
        if (result.val > 9) {
            i = result.val / 10;
            result.val = result.val % 10;
        }
        result.next = add(null == l1 ? null : l1.next, null == l2 ? null : l2.next, i);
        return result;
    }

}
