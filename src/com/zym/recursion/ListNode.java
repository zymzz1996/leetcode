package com.zym.recursion;

/**
 * @author zhouyumeng
 * @date 2022/02/16
 **/
public class ListNode {

    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public void print() {
        ListNode temp = this;
        while (null != temp) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}
