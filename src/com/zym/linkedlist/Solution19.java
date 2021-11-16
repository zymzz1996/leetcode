package com.zym.linkedlist;

/**
 * @author zhouyumeng
 * @date 2021/07/13
 **/
public class Solution19 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        //ListNode result = removeNthFromEnd(node1, 2);

        Solution19 s = new Solution19();
        ListNode result = s.removeNthFromEnd3(node1, 5);
        System.out.println(result);
    }

    private static ListNode removeNthFromEnd(ListNode head, int n) {
        int totalNum = fillNodeVal(head, 1);
        ListNode backNode = findBackNode(head, n, totalNum, 1);
        ListNode frontNode = findFrontNode(head, n, totalNum, 1);
        if (frontNode != null) {
            frontNode.next = backNode;
            return head;
        }
        return backNode;
    }

    private static int fillNodeVal(ListNode node, int index) {
        //1,2,3,4,5
        //倒数第4个：正数第2个 4+2 = 6  ||  prev-1
        //倒数第3个：正数第3个 3+3 = 6  ||  prev-2
        //倒数第2个：正数第4个 2+4 = 6  ||
        //倒数第1个：正数第5个 1+5= 6   ||
        if (null != node.next) {
            return fillNodeVal(node.next, index + 1);
        } else {
            //总数
            return index + 1;
        }
    }

    private static ListNode findBackNode(ListNode node, int n, int totalNum, int index) {
        if (index + n == totalNum) {
            return node.next;
        }
        return findBackNode(node.next, n, totalNum, index + 1);
    }

    private static ListNode findFrontNode(ListNode node, int n, int totalNum, int index) {
        if (index + 1 + n == totalNum) {
            return node;
        }
        if (node.next != null) {
            return findFrontNode(node.next, n, totalNum, index + 1);
        }
        return null;
    }



    private ListNode removeNthFromEnd2(ListNode head, int n) {
        if (null == head || null == head.next) {
            return null;
        }
        ListNode temp = head;
        int totalNum = 0;
        while (null != temp) {
            totalNum++;
            temp = temp.next;
        }
        ListNode preHead = new ListNode(-1, head);
        ListNode prev = preHead;
        int index = 0;
        while (null != prev) {
            if (index + n == totalNum) {
                prev.next = prev.next.next;
                return preHead.next;
            }
            prev = prev.next;
            index++;
        }
        return preHead.next;
    }


    private ListNode removeNthFromEnd3(ListNode head, int n) {
        if (null == head || null == head.next) {
            return null;
        }
        ListNode preHead = new ListNode(-1, head);
        ListNode slow = preHead;
        ListNode fast = preHead.next;
        for (int i = 0; i < n - 1; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return preHead.next;
    }
}
