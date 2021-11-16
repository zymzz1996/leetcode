package com.zym.linkedlist;

/**
 * @author zhouyumeng
 * @date 2021/07/22
 **/
public class Solution21 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(2);
        l2.next.next = new ListNode(4);
        Solution21 s = new Solution21();
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(s.mergeTwoLists3(l1, l2));
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (null == l1 && null == l2) {
            return null;
        } else if (null == l1) {
            return l2;
        } else if (null == l2) {
            return l1;
        } else {
            ListNode result = new ListNode();
            merge(l1, l2, result);
            return result;
        }
    }

    private void merge(ListNode l1, ListNode l2, ListNode resultNext) {
        if (l1.val <= l2.val) {
            resultNext.val = l1.val;
            if (null != l1.next) {
                resultNext.next = new ListNode();
                merge(l1.next, l2, resultNext.next);
            } else {
                connection(l2, resultNext);
            }
        } else {
            resultNext.val = l2.val;
            if (null != l2.next) {
                resultNext.next = new ListNode();
                merge(l1, l2.next, resultNext.next);
            } else {
                connection(l1, resultNext);
            }
        }
    }

    private void connection(ListNode node, ListNode resultNext) {
        resultNext.next = new ListNode();
        resultNext.next.val = node.val;
        if (null != node.next) {
            connection(node.next, resultNext.next);
        }
    }

    /**
     * 递归
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if (null == l1) {
            return l2;
        } else if (null == l2) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists2(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists2(l1, l2.next);
            return l2;
        }
    }

    /**
     * 迭代
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists3(ListNode l1, ListNode l2) {
        if (null == l1) {
            return l2;
        }
        if (null == l2) {
            return l1;
        }
        ListNode preHead = new ListNode(-1);
        ListNode prev = preHead;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        if (l1 != null) {
            prev.next = l1;
        }
        if (l2 != null) {
            prev.next = l2;
        }
        return preHead.next;
    }
}


