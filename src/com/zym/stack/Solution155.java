package com.zym.stack;

import com.zym.linkedlist.ListNode;

/**
 * @author zhouyumeng
 * @date 2021/10/12
 **/
public class Solution155 {

    ListNode top;

    int min;

    int count;

    public Solution155() {

    }

    public void push(int val) {
        ListNode node = new ListNode(val);
        if (null == top) {
            top = node;
        } else {
            node.setNext(top);
            top = node;
        }
        if (count++ == 0) {
            min = val;
        } else if (min > val) {
            min = val;
        }
    }

    public void pop() {
        top = top.getNext();
        if (top != null) {
            ListNode index = top;
            min = index.getVal();
            while (index != null) {
                if (index.getVal() < min) {
                    min = index.getVal();
                }
                index = index.getNext();
            }
        } else {
            count = 0;
        }
    }

    public int top() {
        if (null == top) {
            return -1;
        }

        return top.getVal();
    }

    public int getMin() {
        return min;
    }

    public static void main(String[] args) {
        Solution155 s = new Solution155();
        s.push(1);
        s.push(1);
        s.push(2);
        s.pop();
        s.pop();
        s.pop();
        s.push(2);
        System.out.println(s.top());
        System.out.println(s.getMin());
    }
}
