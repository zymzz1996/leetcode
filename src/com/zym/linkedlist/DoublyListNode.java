package com.zym.linkedlist;

/**
 * @author zhouyumeng
 * @date 2021/09/29
 **/
public class DoublyListNode {

    private String val;

    private DoublyListNode prev;

    private DoublyListNode next;

    public DoublyListNode() {
    }

    public DoublyListNode(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public DoublyListNode getPrev() {
        return prev;
    }

    public void setPrev(DoublyListNode prev) {
        this.prev = prev;
    }

    public DoublyListNode getNext() {
        return next;
    }

    public void setNext(DoublyListNode next) {
        this.next = next;
    }
}
