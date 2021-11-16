package com.zym.stack;

import com.zym.linkedlist.ListNode;

/**
 * @author zhouyumeng
 * @date 2021/09/29
 **/
public class LinkedListStack {

    ListNode top;

    public boolean push(int val) {
        ListNode node = new ListNode(val);
        if (null == top) {
            top = node;
        } else {
            node.setNext(top);
            top = node;
        }
        return true;
    }

    public int pop() {
        if (null == top) {
            return -1;
        }
        int val = top.getVal();
        top = top.getNext();
        return val;
    }

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
