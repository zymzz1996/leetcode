package com.zym.stack;

import com.zym.linkedlist.DoublyListNode;

/**
 * @author zhouyumeng
 * @date 2021/09/29
 **/
public class DoublyLinkedListStack {

    private DoublyListNode top;

    public DoublyLinkedListStack() {}

    public boolean push(String val) {
        if (null == top) {
            top = new DoublyListNode(val);
        } else {
            top.setNext(new DoublyListNode(val));
            DoublyListNode prev = top;
            top = top.getNext();
            top.setPrev(prev);
        }
        return true;
    }

    public String pop() {
        if (null == top) {
            return null;
        }
        String result = top.getVal();
        DoublyListNode prev = top.getPrev();
        top = prev;
        if (null != prev) {
            prev.setNext(null);
        }
        return result;
    }

    public static void main(String[] args) {
        DoublyLinkedListStack stack = new DoublyLinkedListStack();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
//        while (stack.top != null) {
//            System.out.println(stack.top.getVal());
//            System.out.println(stack.top.getPrev());
//            stack.top = stack.top.getPrev();
//        }
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
