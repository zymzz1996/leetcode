package com.zym.queue;


/**
 * @author zhouyumeng
 * @date 2021/11/16
 **/
public class LinkedListQueue {

    private ListNode head;
    private ListNode tail;

    public LinkedListQueue() {
        head = new ListNode();
        tail = head;
    }

    public boolean enqueue(String val) {
        tail.val = val;
        tail.next = new ListNode();
        tail = tail.next;
        return true;
    }

    public String dequeue() {
        if (null == head.val) {
            return null;
        }
        String result = head.val;
        if (null != head.next) {
            head = head.next;
        }
        return result;
    }

    static class ListNode{

        String val;
        ListNode next;

        public ListNode() {

        }
    }

    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();
        System.out.println(queue.enqueue("1"));
        System.out.println(queue.enqueue("2"));
        System.out.println(queue.enqueue("3"));
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
